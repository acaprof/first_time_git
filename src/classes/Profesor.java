/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Java 1
 */
public class Profesor extends Covek {
    private String faklutet;
    private String zvanje;

    public Profesor(String faklutet, String zvanje, String ime, String prezime, int godine, char pol, String jmbg) {
        super(ime, prezime, godine, pol, jmbg);
        this.faklutet = faklutet;
        this.zvanje = zvanje;
        System.out.println("Konstruktor klase profesor");
    }

    public String getFaklutet() {
        return faklutet;
    }

    public void setFaklutet(String faklutet) {
        this.faklutet = faklutet;
    }

    public String getZvanje() {
        return zvanje;
    }

    public void setZvanje(String zvanje) {
        this.zvanje = zvanje;
    }

    @Override
    public String toString() {
        return "fakultet: "+ faklutet + ", zvanje: "+ zvanje +" ||| "+super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
