package com.mycompany.granprix5binf;
import java.io.*;
import java.util.*;


/**
 *
 * @author Banella Lorenzo,Moroni Marco,Benazza Adile  5BINF ITTS Alessandro Volta Perugia
 * @version 14/02/2024
*/

public class Giocatore implements Serializable{

	private String username;
	private String password;

	public Giocatore() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Inserisci l'username");
		this.username =  scanner.nextLine();
                 System.out.println("Inserisci il verme che ti servirà a cifrarti la password");
		Cifrario cifrario = new Cifrario(scanner.nextLine().toUpperCase());
                System.out.println("Inserisci la password che poi veràà cifrata (quando vorrai loggarti dovrai scriverla tutta maiuscola)");
		this.password = cifrario.cifra(scanner.nextLine().toUpperCase());
	}
        
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
        
        public String toString(){
            return "Username : " + username + " Password : "+ password;
        }

}