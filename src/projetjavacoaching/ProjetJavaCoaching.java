/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavacoaching;

import java.time.Clock;

/**
 *
 * @author poste
 */
public class ProjetJavaCoaching {

    /**
     * @param args the command line arguments
     */
    static int i = 0;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello world");
        Lapin lap = new Lapin("Bob", 4);
        while (i <= 10) {
            lap.crier();
            i++;
        }
    }
    
}
