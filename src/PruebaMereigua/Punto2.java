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
public class Punto2 {
    
    public int enteroMayot(int[] array_enteros) {
        int enteroMayor = 0;
        for (int entero : array_enteros) {
            if (entero > enteroMayor) {
                enteroMayor = entero;
            }
        }
        return enteroMayor;
    }
    
}
