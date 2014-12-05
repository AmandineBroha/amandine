/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavacoaching;

/**
 *
 * @author poste
 */

public class Lapin {
    
    private String nom;
    private int age;

    public Lapin(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void crier() {
        System.out.println("HAAAAAAA");
    }
    
}
