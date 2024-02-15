package com.mycompany.granprix5binf;
import java.io.*;
import java.util.*;


/**
 *
 * @author Banella Lorenzo,Moroni Marco,Benazza Adile  5BINF ITTS Alessandro Volta Perugia
 * @version 14/02/2024
*/

public class Circuito {

	private String nome;
	private double lunghezza;
        private int numeroMacchinePartecipanti;
	private int numeroGiri;
	private int numeroPitStopMinimi;

	public Circuito() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Inserisci il nome del circuito:");
           this.nome = scanner.nextLine();

            System.out.println("Inserisci la lunghezza del circuito (il valore sarà in km):");
            this.lunghezza = scanner.nextDouble();
            
            System.out.println("Inseri…
[17:03, 14/2/2024] banella lore: questo è circuito
[17:04, 14/2/2024] banella lore: package com.mycompany.granprix5binf;
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