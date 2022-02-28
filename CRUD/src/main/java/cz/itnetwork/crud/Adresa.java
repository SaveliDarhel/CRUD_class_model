/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.crud;

/**
 *
 * @author savel
 */
public class Adresa {
    private String ulice;
    private String cisloPopisne;
    private String cisloSmerovaci;
    private String psc;
    private String mesto;
    private String stat;
    
    public Adresa(String ulice, String cisloPopisne, String cisloSmerovaci, String psc, String mesto, String stat){
        this.ulice = ulice;
        this.cisloPopisne = cisloPopisne;
        this.cisloSmerovaci =cisloSmerovaci;
        this.psc = psc;
        this.mesto = mesto;
        this.stat = stat;
    }

    /**
     * @return the ulice
     */
    public String getUlice() {
        return ulice;
    }

    /**
     * @return the cisloPopisne
     */
    public String getCisloPopisne() {
        return cisloPopisne;
    }

    /**
     * @return the cisloSmerovaci
     */
    public String getCisloSmerovaci() {
        return cisloSmerovaci;
    }

    /**
     * @return the psc
     */
    public String getPsc() {
        return psc;
    }

    /**
     * @return the mesto
     */
    public String getMesto() {
        return mesto;
    }

    /**
     * @return the stat
     */
    public String getStat() {
        return stat;
    }
    
    
    @Override
    public String toString(){
        return ulice +" "+ cisloPopisne +"/"+ cisloSmerovaci +", "+ psc +", "+ mesto;
    }
    
}
