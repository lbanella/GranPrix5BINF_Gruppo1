package com.mycompany.granprix5binf;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Banella Lorenzo,Moroni Marco,Benazza Adile  5BINF ITTS Alessandro Volta Perugia
 * @version 14/02/2024
*/

public class GestoreGiocatori {

	private ArrayList<Giocatore> listaGiocatori;
	private static final String nomeFileListaGiocatori = "dati.bin";

	public GestoreGiocatori() {
            this.listaGiocatori = new ArrayList<>();
	}

	public void addGiocatore(Giocatore giocatore) {
		listaGiocatori.add(giocatore);
	}

	public void esportaGiocatori() {
           try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeFileListaGiocatori))) {
            oos.writeObject(listaGiocatori);
            } catch (IOException e) {
            System.err.println("Errore durante l'esportazione dei giocatori: " + e.getMessage());
            }
	}

	public void importaGiocatori() {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeFileListaGiocatori))) {
                this.listaGiocatori = (ArrayList<Giocatore>) ois.readObject();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GestoreGiocatori.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(GestoreGiocatori.class.getName()).log(Level.SEVERE, null, ex);
            }
	}

	public  boolean formUtente() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("--------------------------------------------------");
            System.out.println("|               GrandPrix Simulatore             |");
            System.out.println("--------------------------------------------------");
            System.out.println("| 1) Registrarti                                 |");
            System.out.println("| 2) Login                                       |");
            System.out.println("--------------------------------------------------");
            System.out.println("| 0) Uscita                                      |");
            System.out.println("--------------------------------------------------");
            System.out.print("Scelta: ");

            int scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il carattere di nuova linea residuo

            boolean registrato =false;
            boolean autenticato = false;


            switch (scelta) {
                case 1:
                        importaGiocatori();
                        registrato =effettuaRegistrazione();
                        autenticato = effettuaLogin();
                        break;
                case 2:
                        importaGiocatori();
                        autenticato = effettuaLogin();
                        break;
                default:
                        System.out.println("ATTENZIONE!!! Scelta errata");
            }

            return autenticato;
        }
        
        public boolean effettuaRegistrazione() {
            boolean registrato=false;
            Giocatore nuovoGiocatore;
            do{
                nuovoGiocatore = new Giocatore();
                // verifico se l'username è già presente, nell array lista giocatori
                boolean usernamePresente = false;
                for (Giocatore giocatore : listaGiocatori) {
                    if (giocatore.getUsername().equals(nuovoGiocatore.getUsername())) {
                        usernamePresente = true;
                        System.out.println("Username gia in uso. Riprova");
                        break;
                    }
                }
                if (!usernamePresente) {
                    registrato=true;
                }   
            }while(!registrato);
                
            addGiocatore(nuovoGiocatore);
            esportaGiocatori();
            System.out.println("Registrazione completata. Ora puoi effettuare il login.");
            return registrato;
	}

	public boolean effettuaLogin() {
             Scanner scanner = new Scanner(System.in);
            boolean autenticato = false;
            do{
                System.out.println("Inserisci l'username (oppure '0' per tornare indietro)");
                String username = scanner.nextLine();

                if (username.equals("0")) {
                    System.out.println("Sei tornato indietro, rieffettua il login.");
                    break;
                }
            
                System.out.println("Inserisci il verme");
                String verme = scanner.nextLine().toUpperCase();
                // Creo un cifrario che mi servirà a fare il confronto tra le password 
                Cifrario cifrario = new Cifrario(verme);
                System.out.println("Inserisci la password");
                String password = cifrario.cifra(scanner.nextLine().toUpperCase());
                boolean utenteTrovato = false;
                for (Giocatore g :listaGiocatori){
                    if (username.equals(g.getUsername()) && password.equals(g.getPassword())) {
                        utenteTrovato=true;
                    } 
                }
                
                if(utenteTrovato){
                    autenticato = true;
                }else{
                    System.out.println("Credenziali sbagliate, riprova!");
                }
            } while (!autenticato);
            
        return autenticato;
	}

}
