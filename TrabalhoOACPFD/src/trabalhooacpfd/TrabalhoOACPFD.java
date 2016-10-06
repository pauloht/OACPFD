/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhooacpfd;

import conversao.converter;
import conversao.parteMaiorQueZero;
import conversao.parteMenorQueZero;

/**
 *
 * @author FREE
 */
public class TrabalhoOACPFD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer a=2;
        System.out.println(parteMaiorQueZero.converter(a));
        
        System.out.println(parteMenorQueZero.converter(a));
        
        double b=1.2;
        
        System.out.println("btostring=" + Double.toString(b));
        
        System.out.println( converter.converter(b)[0] + "|" + converter.converter(b)[1] + "|" + converter.converter(b)[2] );
    }
    
}
