/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.crud;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 *
 * @author savel
 */
public class Pojisteni {
    private Pojisteny pojisteny;
    private String nazevPojisteni;
    private String typPojisteni;
    private double pojistnaCastka;
    
    public Pojisteni(){
        
    }
    
    public Pojisteni (Pojisteny pojisteny, String nazevPojisteni, String typPojisteni, double pojistnaCastka){
        this.pojisteny = pojisteny;
        this.nazevPojisteni = nazevPojisteni;
        this.typPojisteni = typPojisteni;
        this.pojistnaCastka = pojistnaCastka;
    }

    /**
     * @return the nazevPojisteni
     */
    public String getNazevPojisteni() {
        return nazevPojisteni;
    }

    /**
     * @return the typPojisteni
     */
    public String getTypPojisteni() {
        return typPojisteni;
    }

    /**
     * @return the pojistnaCastka
     */
    public double getPojistnaCastka() {
        return pojistnaCastka;
    }
    
    
    @Override
    public String toString(){
        return "(" + nazevPojisteni +", "+ typPojisteni +", "+ pojistnaCastka +")";
    }

    /**
     * @param nazevPojisteni the nazevPojisteni to set
     */
    public void setNazevPojisteni(String nazevPojisteni) {
        this.nazevPojisteni = nazevPojisteni;
    }

    /**
     * @param typPojisteni the typPojisteni to set
     */
    public void setTypPojisteni(String typPojisteni) {
        this.typPojisteni = typPojisteni;
    }

    /**
     * @param pojistnaCastka the pojistnaCastka to set
     */
    public void setPojistnaCastka(double pojistnaCastka) {
        this.pojistnaCastka = pojistnaCastka;
    }

    
    
}
