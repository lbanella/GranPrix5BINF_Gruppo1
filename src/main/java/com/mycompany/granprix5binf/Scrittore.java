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

public class Scrittore extends Thread {

	private String nomeFile;
	private String messaggio;

	public Scrittore(String nomeFile, String messaggio) {
        this.nomeFile = nomeFile;
        this.messaggio = messaggio;
    }
    

	/**
     * Scrive su un file di testo,un semplice messaggio,usando la classe BufferedWriter
     */
	public void scrivi(){ 
        //1) apro il file
        try (BufferedWriter br = new BufferedWriter(new FileWriter(nomeFile))) {
            //2) scrivo nel buffer
            br.write(messaggio);
            br.newLine(); // Utilizza newLine() per la nuova riga, più compatibile
            //3) svuoto il buffer e salvo nel file i dati
            br.flush();
        } catch (IOException ex) {
			Logger.getLogger(Scrittore.class.getName()).log(Level.SEVERE, null, ex);
        }
            
                
    }

	public void run() {
		scrivi();
	}

}