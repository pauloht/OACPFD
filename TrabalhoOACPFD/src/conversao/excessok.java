/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversao;

/**
 *
 * @author FREE
 */
public class excessok {
    //assume 10 bits
    public static String converter(int valor)
    {
        int minValor = -1024;
        //System.out.println("valor : " + valor);
        valor = valor-minValor;
        //System.out.println("valor : " + valor);
        
        return( parteMaiorQueZero.converter(valor) );
    }
    
    public static Double converter(String valor)
    {
        double valorEmAbsoluto = parteMaiorQueZero.converter(valor);
        Double retorno = valorEmAbsoluto + 1024;
        
        return( retorno );
    }
}
