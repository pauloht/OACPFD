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
public class parteMenorQueZero {
    public static String converter(int valor)
    {
        StringBuilder sb = new StringBuilder();
        int aux = valor;
        int diminuidor=1;
        while (aux > 0)
        {
            aux = aux/10;
            diminuidor=diminuidor*10;
        }
        
        while (valor!=0 && sb.length()<10)
        {
            valor = valor*2;
            
            if (valor>=diminuidor)
            {
                sb.append('1');
                valor = valor-diminuidor;
            }
            else
            {
                sb.append('0');
            }
        }
        if (sb.length()==0)
        {
            return("0");
        }
        return(sb.toString());
    }
    
    public static Double converter(String valor)
    {
        Double retorno = 0.0;
        int contador=-1;
        for (int i=0;i<valor.length();i++)
        {
            if (valor.charAt(i)=='1')
            {
                retorno = retorno + Math.pow(2, contador);
            }
            contador--;
        }
        return( retorno );
    }
}
