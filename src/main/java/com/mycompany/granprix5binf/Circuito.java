package com.mycompany.granprix5binf;
import java.io.*;
import java.util.*;


/**
 *
 * @author Banella Lorenzo,Moroni Marco,Benazza Adile  5BINF ITTS Alessandro Volta Perugia
  * @version 21/02/2024
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

        System.out.println("Inserisci il numero di macchine che dovranno gareggiare :");
        this.numeroMacchinePartecipanti = scanner.nextInt();


        do {
            System.out.println("Inserisci il numero di giri: (minimo 10 )");
            this.numeroGiri = scanner.nextInt();
        }while (this.numeroGiri < 10);


        do {
            System.out.println("Inserisci il numero minimo di pit stop minimi 1 max 3:");
            this.numeroPitStopMinimi = scanner.nextInt();
        }while  (numeroPitStopMinimi != 1 && numeroPitStopMinimi != 2 && numeroPitStopMinimi != 3);   
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
    * @return lunghezza
    */

    public double getLunghezza() {
        return lunghezza;
    }

    /**
    * 
    * @return numeroMacchinePartecipanti
    */

    public int getNumeroMacchinePartecipanti() {
        return numeroMacchinePartecipanti;
    }

    /**
    * 
    * @return numeroGiri
    */
    public int getNumeroGiri() {
        return numeroGiri;
    }

    /**
    * 
    * @return numeroPitStopMinimi
    */

    public int getNumeroPitStopMinimi() {
        return numeroPitStopMinimi;
    }

    /**
    * 
    * @return String
    */

    @Override
    public String toString() {
        return "Circuito{" + "nome=" + nome + ", lunghezza=" + lunghezza + ", numeroMacchinePartecipanti=" + numeroMacchinePartecipanti + ", numeroGiri=" + numeroGiri + ", numeroPitStopMinimi=" + numeroPitStopMinimi + '}';
    }
             
}