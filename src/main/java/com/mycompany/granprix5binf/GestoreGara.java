package com.mycompany.granprix5binf;

import java.io.*;
import java.util.*;
import java.util.ArrayList;

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

	private static void faiScegliereCircuito() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	private static void faiScegliereMacchine() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public static void avviaGara() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public static void safetyCar(int giroIncidente) {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public static void moitoraGara() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public static void stampaClassificaFinale() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

}