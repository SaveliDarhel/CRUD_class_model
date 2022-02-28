/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.crud;
import java.util.ArrayList;
/**
 *
 * @author savel
 */
public class Databaze {
    private ArrayList<Pojisteny> seznPojistenych;
    
    public Databaze(){
        seznPojistenych = new ArrayList<>();
    }
    
    public void ulozPojisteneho(Pojisteny pojisteny){
        seznPojistenych.add(pojisteny);
    }
    
    public void vypisData(){
        for (Pojisteny i : seznPojistenych){
            System.out.println(i);
            i.vypisPojisteni();
            System.out.println();
        }
    }
    
    public Pojisteny najdiPojisteneho(String jmeno){
        Pojisteny pojisteny = new Pojisteny();
        for (Pojisteny i : seznPojistenych){
            if (i.getJmeno().equals(jmeno)){
                pojisteny = i;
            }
        }
        return pojisteny;
    }
    
    public void vymazPojisteneho(String jmeno){
        seznPojistenych.remove(najdiPojisteneho(jmeno));  
    }
    
}
