package com.mycompany.granprix5binf;

import java.io.*;
import java.util.*;


/**
 *
 * @author Banella Lorenzo,Moroni Marco,Benazza Adile  5BINF ITTS Alessandro Volta Perugia
 * @version 14/02/2024
*/

public class Vigenere implements Runnable{

    private int ir;
    private int fr;
    private int ic;
    private int fc;
    private Matrice matrix;

    /**
     * 
     * @param ir 
     * @param fr
     * @param ic
     * @param fc
     * @param matrix 
     */
    public Vigenere(int ir, int fr, int ic, int fc, Matrice matrix) {
        this.ir = ir;
        this.fr = fr;
        this.ic = ic;
        this.fc = fc;
        this.matrix = matrix;
    }

    @Override
    public void run() {
        popola();
    }

    private void popola(){
        int c,r,car;
        for(r=ir; r<fr; r++) {
            for(c=ic; c<fc; c++) {
                car = r + c + 65;
                if(car>90) {
                    car = car - 26;
                }
                this.matrix.setElemento(r, c, car);
            }
        }
    }
}