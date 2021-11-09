/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaMereigua;

/**
 *
 * @author PC-9313
 */
public class Punto3 {
    
    public String revertirCadena(String cadena){
        
            char[] ch = cadena.toCharArray();
	    int inicio = 0;
	    int logitud = ch.length-1;
	    char temp;
	    while(logitud>inicio){
	        temp = ch[inicio];
	        ch[inicio] = ch[logitud];
	        ch[logitud] = temp;
	        logitud--;
	        inicio++;
	    }
	    cadena = new String(ch);
	return cadena;
    }
    
}
