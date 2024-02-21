package com.mycompany.granprix5binf;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Banella Lorenzo,Moroni Marco,Benazza Adile  5BINF ITTS Alessandro Volta Perugia
 * @version 14/02/2024
*/

public class GestoreGara {

	private static ArrayList<Macchina> listaMacchine;
	private static ArrayList<Macchina> grigliaDiPartenza;
	private static ArrayList<Macchina> classifica;
	private static Circuito CircuitoSuCuiSiSvolgeLaGara;

	public static void main(String[] args) {
            GestoreGiocatori gestoreGiocatori=new GestoreGiocatori();
            boolean autenticato = gestoreGiocatori.formUtente();

            if (autenticato) {
                faiScegliereCircuito();
                faiScegliereMacchine();
                avviaGara();
                moitoraGara();
                stampaClassificaFinale(); 
            }
        }
        
        public static void clearScreen() {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }

        private static void faiScegliereCircuito() {
                CircuitoSuCuiSiSvolgeLaGara =new Circuito();
            }

            private static void faiScegliereMacchine() {
                listaMacchine = new ArrayList<>();
                for (int i = 0; i < CircuitoSuCuiSiSvolgeLaGara.getNumeroMacchinePartecipanti(); i++) {
                    Pilota pilota = new Pilota();
                    Macchina macchina = new Macchina(pilota, CircuitoSuCuiSiSvolgeLaGara);
                    listaMacchine.add(macchina);
                }
            }

	public static void avviaGara() {
            grigliaDiPartenza = new ArrayList<>();
            for (Macchina r : listaMacchine) {
                grigliaDiPartenza.add(r);
            }
            
            System.out.println("Benvenuti alla gara svolta sul circuito di "+CircuitoSuCuiSiSvolgeLaGara.getNome());
            try {
                Thread.sleep(1000);
                System.out.println("Pronti");
                Thread.sleep(1000);
                System.out.println("Partenza");
                Thread.sleep(1000);
                System.out.println("Via");
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                System.err.println(e.getStackTrace());
            }

            for (Macchina r : grigliaDiPartenza) {
                r.start();
            }
	}

	public static void safetyCar(int giroIncidente) {
            for (Macchina r : grigliaDiPartenza) {
               r.setGiriDisputati(giroIncidente);
               r.setDistanzaPercorsaInUnGiro(0.0);
            }
	}

	public static void moitoraGara() {
            boolean run = true;
            int nMacchineArrivate = 0;
            classifica = new ArrayList<>();
            ArrayList<Macchina> incidentate = new ArrayList<>();

            while (run) {
                clearScreen();
                System.out.println("***************************************");
                for (Macchina r : listaMacchine) {
                    System.out.println("*  " + r + " *");
                }
                System.out.println("***************************************");


                //Iteratore che ciclerà sulle macchine in pista
                Iterator<Macchina> iterator = grigliaDiPartenza.iterator();

                int maxGiriDisputati = 0;

                // Trova il numero massimo di giri disputati tra tutte le macchine
                while (iterator.hasNext()) {
                    Macchina r = iterator.next();
                    if (r.getGiriDisputati() > maxGiriDisputati) {
                        maxGiriDisputati = r.getGiriDisputati();
                    }
                }
                iterator = grigliaDiPartenza.iterator(); // ripristino l'iteratore

                while (iterator.hasNext()) {
                    Macchina r = iterator.next();
                    if (!r.getRunning() || r.isIncidentata()) {
                        if (r.isIncidentata()) {
                            try {
                                r.join();
                            } catch (InterruptedException ex) {
                                Logger.getLogger(GestoreGara.class.getName()).log(Level.SEVERE, null, ex);
                            }
                           incidentate.add(r);
                            // Controlla se la macchina incidentata ha gli stessi giri della prima 
                            if (r.getGiriDisputati() == maxGiriDisputati) {
                                safetyCar( r.getGiriDisputati());
                            } else {
                                safetyCar(maxGiriDisputati);
                            }
                        } else {
                            try {
                                r.join();
                            } catch (InterruptedException ex) {
                                Logger.getLogger(GestoreGara.class.getName()).log(Level.SEVERE, null, ex);
                            }   
                            classifica.add(r);
                        }
                        iterator.remove();
                        nMacchineArrivate++;
                    }

                    if (nMacchineArrivate == listaMacchine.size()) {
                        run = false;
                        break;
                    }
                }

                try {
                    Thread.sleep(1500); // 1000 ms = 1 sec
                } catch (InterruptedException e) {
                    System.err.println(e.getStackTrace());
                }
            }
            
            // Aggiungi le macchine incidentate alla fine della classifica
            classifica.addAll(incidentate);
        }

	  public static void stampaClassificaFinale() {
        StringBuilder sb = new StringBuilder();

        LocalDateTime oraCorrente = LocalDateTime.now();
        DateTimeFormatter formatoDataOra = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dataOraFormattata = oraCorrente.format(formatoDataOra);

        sb.append("-----------------------------------------------------------------------------------------------");
        sb.append("\n");
        sb.append("|               Gara corsa a  " + CircuitoSuCuiSiSvolgeLaGara.getNome() + ", Svolta : " + dataOraFormattata + "                                 ");
        sb.append("\n");
        sb.append("-----------------------------------------------------------------------------------------------");
        sb.append("\n");

        for (int i = 0; i < classifica.size(); i++) {
            if(classifica.get(i).isIncidentata()){
                sb.append("| La macchina " + classifica.get(i).getNome() + " guidata da " + classifica.get(i).getPilota()+ "id"+classifica.get(i).getID()  + " è arrivata " + (i + 1) + " perchè incidentata "+ "                                 ");
            }else{
                sb.append("| La macchina " + classifica.get(i).getNome() + " guidata da " + classifica.get(i).getPilota() + " id " +
                classifica.get(i).getID() +" è arrivata " + (i + 1) + " tempo: " +
                classifica.get(i).getTempoTotaleGara().toMinutesPart() + " minuti e " +
                classifica.get(i).getTempoTotaleGara().toSecondsPart() + " secondi." +
                classifica.get(i).getTempoTotaleGara().toMillis() + " ms."+"                                 ");
            }
            sb.append("\n");
        }
        sb.append("-----------------------------------------------------------------------------------------------");

        // Scrivi il risultato della gara in un nuovo file che cambia in base al nome del circuito e  quando è stata svolta
        String nomeFileNuovo = "Gara_di_"+CircuitoSuCuiSiSvolgeLaGara.getNome().replaceAll("[^a-zA-Z0-9_]", "_") + "_" + dataOraFormattata.replaceAll("[^a-zA-Z0-9_]", "_") + ".txt";
        System.out.println(nomeFileNuovo);
        Scrittore scrittore = new Scrittore("gare/"+nomeFileNuovo, sb.toString());
        Thread threadScrittore = new Thread(scrittore);
        threadScrittore.start();
        try {
            threadScrittore.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(GestoreGara.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }

}