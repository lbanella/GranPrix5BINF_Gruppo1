package com.mycompany.granprix5binf;
import java.io.*;
import java.util.*;


/**
 *
 * @author Banella Lorenzo,Moroni Marco,Benazza Adile  5BINF ITTS Alessandro Volta Perugia
 * @version 14/02/2024
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

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}
	

	public String getScuderia() {
		return scuderia;
	}

        @Override
	public String toString() {
		return nome+"  "+cognome+" della scuderia :"+scuderia;
	}

}