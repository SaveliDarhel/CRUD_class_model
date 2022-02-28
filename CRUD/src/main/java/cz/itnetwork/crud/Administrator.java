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
public class Administrator extends Pojisteny{
    
    private Pojisteny pojisteny;
    private Pojisteni pojisteni;
    private Udalost udalost;
    private Databaze databaze;
    
    public Administrator (){
        
    }
    
    public Administrator(String jmeno, String prijmeni){
        super(jmeno, prijmeni);     
    }
    
    public Pojisteny vytvorPojisteneho(String jmeno, String prijmeni){
        pojisteny = new Pojisteny(jmeno, prijmeni);
        return pojisteny;
    }
    
    //vytvaří pojištění které naleží jedné osobě, nová pojištění se automaticky přidavaji sem
    public void vytvorPojisteni(Pojisteny pojisteny, String nazevPojisteni, String typPojisteni, double pojistnaCastka){
        pojisteni = new Pojisteni(pojisteny, nazevPojisteni, typPojisteni, pojistnaCastka);
        pojisteny.ulozPojisteni(pojisteni);
    }
    
    public Pojisteni vyhledejPojisteni(Pojisteny pojisteny, String nazevPojisteni){
        Pojisteni pojisteni = new Pojisteni();
        for (Pojisteni i : pojisteny.vratSeznPojisteni()){
            if (i.getNazevPojisteni().equals(nazevPojisteni)){
                pojisteni = i;
            }
        }
        return pojisteni;
    }
    
    public void vymazPojisteni(Pojisteny pojisteny, String nazevPojisteni){
        pojisteny.vratSeznPojisteni().remove(vyhledejPojisteni(pojisteny, nazevPojisteni));
    }
    
    @Override
    public String toString(){
        return "Administrator " + jmeno +" "+ prijmeni;
    }
    
}
