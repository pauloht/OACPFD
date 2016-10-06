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
public class converter {
    public static String[] converter(double valor)
    {
        char temp;
        if (valor < 0)
        {
            temp = '1';
            valor = valor*-1;
        }
        else
        {
            temp = '0';
        }
        
        int[] partes = quebrador.quebrar(valor);
        
        String inteira = parteMaiorQueZero.converter(partes[0]);
        
        String decimal = parteMenorQueZero.converter(partes[1]);
        
        int deslocamentoV = deslocamento.deslocamento(inteira, decimal);
        String nInteira = "1";
        StringBuilder nDecimalSB;
        
        StringBuilder aux;
        
        if (deslocamentoV > 0)
        {
            nDecimalSB = new StringBuilder(decimal).reverse();
            aux = new StringBuilder(inteira).reverse();
            for (int i=0;i<deslocamentoV;i++)
            {
                char charMovimentado = aux.charAt(i);
                System.out.println("char =  " + charMovimentado);
                nDecimalSB.append(charMovimentado);
            }
        }
        else
        {
            nDecimalSB = new StringBuilder();
            deslocamentoV = deslocamentoV*-1;
            for (int i=deslocamentoV;i<decimal.length();i++)
            {
                nDecimalSB.append(decimal.charAt(i));
            }
        }
        
        String mantissaS = excessok.converter(deslocamentoV);
        
        System.out.println("antes de normalizar : " + inteira.toString() + "." + decimal.toString());
        System.out.println("depois de normalizar ; " + nInteira + "." + nDecimalSB.reverse().toString());
        System.out.println("mantissa : " + mantissaS);
        
        String valorS = decimal.toString();
        String sinalS = temp + "";
        
        String[] retorno = new String[3];
        
        retorno[0] = sinalS;
        retorno[1] = mantissaS;
        retorno[2] = valorS;
        
        return(retorno);
    }
}
