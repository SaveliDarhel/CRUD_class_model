/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.crud;
import java.time.LocalDate;
/**
 *
 * @author savel
 */
public class Udalost {
    private String typUdalosti;
    private double skoda;
    private LocalDate datumUdalosti;
    
    public Udalost(String typUdalosti, double skoda){
        this.typUdalosti = typUdalosti;
        this.skoda = skoda;
        this.datumUdalosti = LocalDate.now();
    }

    /**
     * @return the typUdalosti
     */
    public String getTypUdalosti() {
        return typUdalosti;
    }

    /**
     * @return the skoda
     */
    public double getSkoda() {
        return skoda;
    }

    /**
     * @return the datumUdalosti
     */
    public LocalDate getDatumUdalosti() {
        return datumUdalosti;
    }
    
    @Override
    public String toString(){
        return "(" + typUdalosti + ", " + skoda + ", " + datumUdalosti + ")";
    }
    
    
}
