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
public class quebrador {
    public static int[] quebrar(Double valor)
    {
        int[] retorno = new int[2];
        
        String aux = valor.toString();
        
        String aux2[] = aux.split("\\.");
        
        if (aux2.length==1)
        {
            System.out.println("usando separador ,");
            aux2 = aux.split("\\,");
        }
        else
        {
            System.out.println("usando separador .");
        }
        
        if (aux2.length==1)
        {
            System.out.println("nao existe separador!, parte decimal 0");
            String buffer = aux2[0];
            aux2 = new String[2];
            aux2[0] = buffer;
            aux2[1] = "0";
        }
        
        retorno[0] = Integer.parseInt(aux2[0]);
        retorno[1] = Integer.parseInt(aux2[1]);
        return(retorno);
    }
}
