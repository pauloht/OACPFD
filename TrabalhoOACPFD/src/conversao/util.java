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
public class util {
    public static String complementoDeDois(String entrada)
    {
        StringBuilder sb = new StringBuilder();
        
        for (int i=0;i<sb.length();i++)
        {
            if (sb.charAt(i)=='0')
            {
                sb.setCharAt(i, '1');
            }
            else
            {
                sb.setCharAt(i, '0');
            }
        }
        
        sb.reverse();
        
        int i=0;
        while (true)
        {
            if (sb.charAt(i)=='0')
            {
                sb.setCharAt(i, '1');
                break;
            }
            else
            {
                sb.setCharAt(i, '0');
                i++;
                if (i>=sb.length())
                {
                    break;
                }
            }
        }
        
        return(sb.reverse().toString());
    }
}
