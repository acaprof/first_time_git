package classes;

import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Java 1
 */
/* automobil
    atributi
        kubikaza
        model
        marka
        godina prozivodnje
        potrosnja
    metode
        get - vraca vrednosti atributa klase
        set - postalja vrednosti atributa klase
        constructor - sluzi za kreiranje novog objekta
        toString - sluzi da ispise u nekom redosledu vrednosti atributa objekta
        izracunajPotrosnju(km, l)
        metoda koja vraca boolean vrednost - starijiOd1990()
        izracunajRegistraciju
            // ako je kubikaza manja od 1000 onda je koeficijent 500
            // ako je kub izmedju 1000 i 1500 onda je koef 600
               ako je kub veca od 1500 onda je koef 700
            ako je godina proizvodnje manja od 1990 onda na cenu za registraciju dodaj 2000
            ako je god proiz izmedju 1990 i 2005 dodaj na cenu registracije 1300
            ako je god proizvodnje 2021 odzumi od cene registracije 200
*/

/*
    

*/

public class Covek {
    String ime;
    String prezime;
    int godine;
    char pol; // 'm' / 'z'
    String jmbg;

    public Covek() {
    }

    public Covek(String ime, String prezime, String jmbg) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
    }
    
    public double vrati_penziju(int godine_radnog_staza, double koeficijen) {
        return godine_radnog_staza * koeficijen;
    }
    
    public Covek(String ime, String prezime, int godine, char pol, String jmbg) {
        setIme(ime);
        this.prezime = prezime;
//        this.godine = godine;
        setGodine(godine);
        this.pol = pol;
        this.jmbg = jmbg;
//        System.out.println("Konstruktor klase Covek");
    }

    public String getIme() {
        return ime;
    }

//    public void setIme() {
//        this.ime = "DEFAULT IME";
//    }
    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        if(godine < 0) {
            System.out.println("Godine ne mogu biti negativan broj, iako su godine samo broj, dodeljena je vrednost 10");
            return;
        } else if (godine > 120) {
            System.out.println("Unesite manji broj godina");
            return;
        }   
        this.godine = godine;
    }

    public char getPol() {
        return pol;
    }

    public void setPol(char pol) {
        this.pol = pol;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }
    
    
    
    //      povratnaVrednost imeMetode()
    public void jede() {
        System.out.println("Covek " + ime + " jede.");
    }
    
    //      povratnaVrednost imeMetode(Argument(i))
    public boolean uci(String daLiUci) {
        if(daLiUci.equalsIgnoreCase("uci")) {
            return true;
        } else {
            return false;
        }
    }    
    public String spava() {
        return "Covek " + ime + " " + prezime + " spava";
    }
    
    // public = modifikator pristupa - naredni cas
    // double = POVRATNA VREDNOST METODE
    // plata = IME METODE
    // (double cenaPoSatu, int brojSati) - ARGUMENTI METODE
    public double plata(double cenaPoSatu, int brojSati) {
        return cenaPoSatu * brojSati;
    }

    @Override
    public String toString() {
        return "jmbg: " + jmbg + ", ime: " + ime + ", prezime: " + prezime + ", godine: " + godine + ", pol: " + pol;
    }
   
    /**
     * ova funckija sluzi da poredi 2 osobe, 
     * vraca true ako osobe imaju isti jmbg
     * u suprotnom vraca false
     */
    public boolean porediOsobe(Covek covekZaPoredjenje) {
        if(this.jmbg == covekZaPoredjenje.getJmbg()) {
            System.out.println("osobe imaju isti jmbg, znaci radi se o istoj osobi");
            return true;
        }  
        return false;
    }

    public static Covek napraviCoveka() {
        String nc_ime;
        String nc_prez;
        int nc_god;
        char nc_pol;
        String nc_jmbg="";
        
        Scanner scanner = new Scanner(System.in);
        
        /* \n - specijalni znak za novi red */
        System.out.print("\nUnesite ime osobe: ");
        nc_ime = scanner.nextLine();
        
        System.out.print("\nUnesite prezime osobe: ");
        nc_prez = scanner.nextLine();
        
        boolean flag = true;
        String proba_god = "-1";
        while(flag) {
            System.out.println("\nUnesite broj godina osobe: ");
    //        nc_god = scanner.nextInt();
            try {
                proba_god = scanner.nextLine();
                Integer.parseInt(proba_god);
                flag = false;
            } catch(NumberFormatException nfe) {
                System.out.println("Molimo unesite broj! ");
            }
        }
        nc_god = Integer.parseInt(proba_god);
        System.out.print("\nUnesite pol osobe(m/z): ");
//        
        String nc_pol_str = scanner.nextLine();
        nc_pol = nc_pol_str.charAt(0);
//        
        System.out.print("\nUnesite jmbg osobe: ");
        nc_jmbg = scanner.nextLine();
        
        scanner.close();
//        Covek covek = new Covek(nc_ime, nc_prez, nc_god, nc_pol, nc_jmbg);
//        return covek;
        return (new Covek(nc_ime, nc_prez, nc_god, nc_pol, nc_jmbg));
    }
        
    
}
