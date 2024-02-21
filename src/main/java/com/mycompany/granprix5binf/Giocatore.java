package com.mycompany.granprix5binf;
import java.io.*;
import java.util.*;


/**
 *
 * @author Banella Lorenzo,Moroni Marco,Benazza Adile  5BINF ITTS Alessandro Volta Perugia
 * @version 21/02/2024
*/

public class Giocatore implements Serializable{

	private String username;
	private String password;

	public Giocatore(String username,String verme,String password) {
		this.username =  username;
                Cifrario cifrario = new Cifrario(verme.toUpperCase());
		this.password = cifrario.cifra(password.toUpperCase());
	}
        
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
        
        @Override
        public String toString(){
            return "Username : " + username + " Password : "+ password;
        }

}