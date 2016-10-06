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
public class deslocamento {
    public static int deslocamento(String parteInteira, String parteDecimal)
    {
        System.out.println("inicio deslocamento");
        StringBuilder sInteira = new StringBuilder(parteInteira).reverse();
        
        int deslocamento = -1;
        
        for (int i=0;i<sInteira.length();i++)
        {
            if (sInteira.charAt(i)=='1')
            {
                deslocamento = i;
            }
        }
        
        if (deslocamento !=-1)
        {
            System.out.println("fim deslocamento");
            return(deslocamento);
        }
        
        StringBuilder sDecimal = new StringBuilder(parteDecimal);
        
        deslocamento = -1;
        
        for (int i=0;i<sDecimal.length();i++)
        {
            if (sDecimal.charAt(i)=='1')
            {
                deslocamento = i;
                break;
            }
        }
        System.out.println("fim deslocamento");
        return(deslocamento*-1);
    }
}
