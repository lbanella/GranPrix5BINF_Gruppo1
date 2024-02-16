package com.mycompany.granprix5binf;

import java.io.*;
import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

/**
 *
 * @author Banella Lorenzo,Moroni Marco,Benazza Adile  5BINF ITTS Alessandro Volta Perugia
 * @version 14/02/2024
*/

public class Macchina extends Thread {

	private String nome;
	private int idMacchina;
	private Pilota pilota;
	private boolean running;
	private double distanzaPercorsaInUnGiro;
	private double distanzaDaPercorrereInUnGiro;
	private int giriDisputati;
	private int giriDaDisputare;
	private int pitStopFatti;
	private int pitStopDaFare;
	private boolean truccata;
	private boolean incidentata;
	private boolean pitStopInCorso;
	private Duration tempoTotaleGara;
        
        
        /**
         * @param  pilota
         * @param  circuito
        */
        
	public Macchina(Pilota pilota, Circuito circuitoSuCuiDeveGareggiare) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Inserisci il nome della macchina :");
            this.nome = scanner.next();
            
            System.out.println("Inserisci l'id della macchina :");
            this.idMacchina = scanner.nextInt();
            
            System.out.println("Vuoi truccare la macchina : true/false ");
            this.truccata = scanner.nextBoolean();
            
            this.pilota=pilota;
            this.running = true;
            this.distanzaPercorsaInUnGiro=0.0;
            this.distanzaDaPercorrereInUnGiro=circuitoSuCuiDeveGareggiare.getLunghezza();
            this.giriDisputati=0;
            this.giriDaDisputare=circuitoSuCuiDeveGareggiare.getNumeroGiri();
            this.pitStopFatti=0;
            this.pitStopDaFare=circuitoSuCuiDeveGareggiare.getNumeroPitStopMinimi();
            this.incidentata=false;
            this.pitStopInCorso=false;
	}

	public String getNome() {
		return nome;
	}

	public Pilota getPilota() {
		return pilota;
	}

	public int getID() {
		return idMacchina;
	}

	public boolean getRunning() {
		return running;
	}

	public double getDistanzaPercorsaInUnGiro() {
		return distanzaPercorsaInUnGiro;
	}

	public void setDistanzaPercorsaInUnGiro(double distanzaPercorsaInUnGiro) {
		this.distanzaPercorsaInUnGiro=distanzaPercorsaInUnGiro;
	}

	public double getDistanzaDaPercorrereInUnGiro() {
		return distanzaDaPercorrereInUnGiro;
	}

	public int getGiriDisputati() {
		return giriDisputati;
	}

        public void setGiriDisputati(int giriDisputati) {
            this.giriDisputati = giriDisputati;
        }
        
        
	public int getGiriDaDisputare() {
		return giriDaDisputare;
	}

	public boolean isIncidentata() {
		return incidentata;
	}

	public void gareggia() {
            Random random = new Random();
           double velocitaMedia =(distanzaDaPercorrereInUnGiro/10)+0.2;
            while (running) {
                if(this.truccata==true){
                     distanzaPercorsaInUnGiro = distanzaPercorsaInUnGiro + random.nextDouble((velocitaMedia*0.8),(velocitaMedia*1.5))*2;
                }else{
                    distanzaPercorsaInUnGiro = distanzaPercorsaInUnGiro + random.nextDouble((velocitaMedia*0.8),(velocitaMedia*1.5));
                }
            
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } 
                
                /* se viene generato un numero inferiore a 10
                la macchina potrebbe far un incidente 
                MA
                non è detto che lo faccia
                */
            
                if(random.nextInt(100)<10){
                    incidente();
                }
            
                /* se la macchina ha fatto piu giri di (npitStopDaFare  +2) e  
                ha fatto meno pitStop di quelli necessari per terminare la gara ,
                 effettuerà un pitStop
                */
                if(giriDisputati > (this.pitStopDaFare+2) && pitStopFatti<pitStopDaFare ){
                    pitStop();
                }
            
                /* se la macchina ha percorso uguale o maggiore la distanza da percorrere in un giro 
                aumentano i giri disputati e la distanza percorsa in un giro viene riazzerata
                */
                
                if (distanzaPercorsaInUnGiro >= distanzaDaPercorrereInUnGiro) {
                    giriDisputati++;
                    distanzaPercorsaInUnGiro = 0.0; // Resetta la distanza per iniziare un nuovo giro
                }
                
                /* se la macchina ha disputato i giri da disputare,
                   e ha fatto i pitstop minimi , termina la gara della Macchina
                   OPPURE
                   ha disputato minimo 3 giri in piu rispetto a quelli da disputare MA
                   non ha effettutato i pitstop minimi, viene "squalificata" quindi termina la gara della Macchina
                */
                
                if (giriDisputati >= giriDaDisputare && pitStopFatti>= pitStopDaFare  || giriDisputati >= (giriDaDisputare +3) && pitStopFatti< pitStopDaFare ) {
                    running = false;
                    break;
                }
            }
	}

	public void pitStop() {
            Random random = new Random();
            int pitStop =random.nextInt(1,giriDaDisputare);
            if(pitStopDaFare== pitStop){
               pitStopFatti++;
               pitStopInCorso=true;
               
         
               /* durataPit stop in media vanno dagli 1.8 (più veloce di sempre) secondi ai 6(se va male),
                 sono in milli perchè saranno la durata dello sleep che simulerebbe il pitstop
                */
               
               int durataPitStop=random.nextInt(1500, 6000);
               try {
                Thread.sleep(durataPitStop); // Modifica qui l'intervallo se necessario
                }catch (InterruptedException e) {
                e.printStackTrace();
                }
            }
             pitStopInCorso = false;
	}

	public void incidente() {
		Random random = new Random();
            int probabilitaIncidente = random.nextInt(100);
            if(this.truccata){
                if (probabilitaIncidente <15) {  // 15% di probabilità di incidente
                this.incidentata = true;
                this.running = false;
     
            }
            }else{
               if (probabilitaIncidente < 5) {  // 5% di probabilità di incidente
                this.incidentata = true;
                this.running = false;
                } 
            }
	}

	public void run() {
            // inizia la gara della Macchina
            
            LocalTime inizioGara = LocalTime.now();
            gareggia();
            
            // finisce la gara della Macchina
            LocalTime fineGara = LocalTime.now();
            // viene calcolata il tempo totale in pista della Macchina
            Duration durataEsecuzione = Duration.between(inizioGara, fineGara);
            this.tempoTotaleGara=durataEsecuzione;
	}

	public String toString() {
            if (!this.running) {
                if (this.incidentata) {
                    return "La macchina " + getNome() + " guidata da " + this.pilota + " non ha terminato la gara a causa di un incidente.";
                } else {
                    return "La macchina " + getNome() + " guidata da " + this.pilota + " ha terminato la gara.";
                }
            }else{
                if (this.pitStopInCorso) {
                    return "La macchina " + getNome() + " guidata da " + this.pilota + " (ID " + this.idMacchina + ") è al " + giriDisputati +
                    " giro e sta facendo il " + pitStopFatti + "° pit stop al giro " + giriDisputati + ".";
                }
                else if (pitStopFatti == 0 ) {
                    return "La macchina " + getNome() +" (ID " + this.idMacchina + ") guidata da " + this.pilota +  " è al " + giriDisputati +
                    " giro su " + giriDaDisputare + " giri, ma non ha ancora effettuato nessun pit stop, ("+pitStopFatti+"/" +pitStopDaFare+") quindi non potrà terminare la gara ,  "+ 
                    "Distanza percorsa nel giro "+giriDisputati+ " : "+distanzaPercorsaInUnGiro; 
                    
                }else if (pitStopFatti < pitStopDaFare && pitStopFatti > 0 ) {
                    return "La macchina " + getNome() +" (ID " + this.idMacchina + ") guidata da " + this.pilota +  " è al " + giriDisputati +
                    " giro su " + giriDaDisputare + " giri, ha completato " + pitStopFatti + " pit stop, ma non può terminare la gara, ne mancano ancora " +(pitStopDaFare-pitStopFatti)+
                    "Distanza percorsa nel giro "+giriDisputati+ " : "+distanzaPercorsaInUnGiro; 
                }else {
                    return "La macchina " + getNome() +" (ID " + this.idMacchina + ") guidata da " + this.pilota +  " è al " + giriDisputati +
                    " giro su " + giriDaDisputare + " giri, ha completato " + pitStopFatti + " pit stop e può terminare la gara,  "+ 
                    "Distanza percorsa nel giro "+giriDisputati+ " : "+distanzaPercorsaInUnGiro; 
                }
                
            }
	}

}
