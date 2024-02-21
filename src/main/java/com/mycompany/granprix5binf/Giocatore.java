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

	public Giocatore(String username,String password) {
		this.username =  username;
		this.password = password;
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