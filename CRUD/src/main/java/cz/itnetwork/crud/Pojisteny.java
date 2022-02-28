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
public class Pojisteny {
    private static int dalsiId = 1;
    protected String jmeno;
    protected String prijmeni;
    private Adresa adresa;
    private String telefon;
    private Pojisteni pojisteni;
    private Udalost udalost;
    
    //ukláda pojištění které naleží jedné osobě
    private ArrayList<Pojisteni> seznPojisteni = new ArrayList<>(); 
    
    // ukláda udalosti které jsou v ramcí jednoho pojíštění
    ArrayList<Udalost> seznamUdalosti = new ArrayList<>();
    
    public Pojisteny(){
        dalsiId++;
    }
    
    public Pojisteny(String jmeno, String prijmeni){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        dalsiId++;
    }
    
    /**
     * @return the dalsiId
     */
    public static int getDalsiId() {
        return dalsiId;
    }

    /**
     * @return the jmeno
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * @return the prijmeni
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * @return the adresa
     */
    public Adresa getAdresa() {
        return adresa;
    }

    /**
     * @param adresa the adresa to set
     */
    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    /**
     * @return the telefon
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * @param telefon the telefon to set
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    
    @Override
    public String toString(){
        return dalsiId + ". " + jmeno +" "+ prijmeni;
    }
    
    public ArrayList<Pojisteni> vratSeznPojisteni(){
        return this.seznPojisteni;
    }
    
    public void ulozPojisteni(Pojisteni pojisteni){
        seznPojisteni.add(pojisteni);
    }
    
    public void vypisPojisteni(){
        for (Pojisteni p : this.seznPojisteni){
            System.out.print(p + "; ");
        } 
        System.out.println();
    }
    
    public void vytvorUdalost(String typUdalosti, double skoda){
        udalost = new Udalost(typUdalosti, skoda);
        seznamUdalosti.add(udalost);
    }
    
    public void vypisUdalosti(){
        for (Udalost i : this.seznamUdalosti){
            System.out.println(i);
        }
        System.out.println();
    }

    /**
     * @param jmeno the jmeno to set
     */
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    /**
     * @param prijmeni the prijmeni to set
     */
    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }
    
    
    
}
