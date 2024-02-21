package com.mycompany.granprix5binf;
import java.io.*;
import java.util.*;


/**
 *
 * @author Banella Lorenzo,Moroni Marco,Benazza Adile  5BINF ITTS Alessandro Volta Perugia
 * @version 21/02/2024
*/

public class Pilota {

	private String nome;
	private String cognome;
	private String scuderia;

	public Pilota() {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Inserisci il nome del pilota :");
            this.nome = scanner.next();
            
            System.out.println("Inserisci il cognome del pilota :");
            this.cognome = scanner.next();

            System.out.println("Inserisci la scuderia del pilota :");
            this.scuderia = scanner.next();
	}
        
        /**
        * 
        * @return nome
        */

	public String getNome() {
		return nome;
	}
        
        /**
        * 
        * @return cognome
        */
        
	public String getCognome() {
		return cognome;
	}
	
        /**
        * 
        * @return scuderia
        */
        
	public String getScuderia() {
		return scuderia;
	}
        
        /**
        * 
        * @return String
        */
        
        @Override
	public String toString() {
		return nome+"  "+cognome+" della scuderia :"+scuderia;
	}

}