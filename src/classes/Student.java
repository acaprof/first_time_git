/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.lang.Math;
/**
 *
 * @author Java 1
 */
public class Student extends Covek {
    
    private String brIndeksa;

    public Student(String brIndeksa) {
        super();
        this.brIndeksa = brIndeksa;
    }
    
    public Student(String ime, String prezime, int godine, char pol, String jmbg, String brIndeksa) {
//        super();
        super(ime, prezime, godine, pol, jmbg);
        this.brIndeksa = brIndeksa;
        System.out.println("Konstruktor klase Student");
    }   
    
    public String getBrIndeksa() {
        return brIndeksa;
    }

    @Override
    public String spava() {
        return "Student nikada ne spava, samo uci";
    }
    
    public void setBrIndeksa(String brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    @Override
    public String toString() {
        return "brIndeksa: "+ brIndeksa+ " ||| " + super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    
    public boolean daLiJeBrojVeciOd100(double br) {
        return br > 100.00;
//        if(br > 100.00) {
//            return true;
//        } else {
//            return false;
//        }
    }

    @Override
    public boolean equals(Object o) {
        return this.brIndeksa.equals(((Student)o).brIndeksa);
//        if(o instanceof Student) {
////            Student s = (Student)o;
////            if(this.brIndeksa.equals(s.brIndeksa))
////                    return true;
//                return this.brIndeksa.equals(((Student)o).brIndeksa);
//        }
//        return false;
    }
   
    
    
}
