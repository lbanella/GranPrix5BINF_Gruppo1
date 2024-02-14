package com.mycompany.granprix5binf;

import java.io.*;
import java.time.Duration;
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

	public Macchina(Pilota pilota, Circuito circuito) {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public String getNome() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public Pilota getPilota() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public int getID() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public boolean getRunning() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public double getDistanzaPercorsaInUnGiro() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public void setDistanzaPercorsaInUnGiro(double distanzaPercorsaInUnGiro) {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public double getDistanzaDaPercorrereInUnGiro() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public int getGiriDisputati() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public int getGiriDaDisputare() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public boolean isIncidentata() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public void gareggia() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public void pitStop() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public void incidente() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public void run() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public String toString() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

}
