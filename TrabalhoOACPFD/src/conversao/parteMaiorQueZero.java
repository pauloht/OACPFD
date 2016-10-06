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
public class parteMaiorQueZero {
    public static String converter(int valor)
    {
       StringBuilder sb = new StringBuilder();
       while (true)
       {
            if (valor%2==0)
            {
                sb.append('0');
                if (valor==0)
                {
                    break;
                }
                valor = valor/2;
            }
            else if (valor%2==1)
            {
                sb.append('1');
                if (valor==1)
                {
                    break;
                }
                valor = (valor-1)/2;
            }
       }
       return (sb.reverse().toString());
    }
    
    public static Double converter(String valor)
    {
        StringBuilder aux = new StringBuilder(valor).reverse();
        Double retorno = 0.00;
        for (int i=0;i<aux.length();i++)
        {
            if (aux.charAt(i)=='1')
            {
                retorno = retorno + Math.pow(2, i);
            }
        }
        return( retorno );
    }
}
