package segitiga;


import segitiga.Jajargenjang;
import segitiga.Segienam;
import segitiga.Segitiga;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class TemplatePattrenDemo {
    public static void main(String[] args) {
        Segitiga segitiga = new Jajargenjang();
        segitiga.segitigapascal();
        System.err.println();
        segitiga = new Segienam();
        segitiga.segitigapascal();
    }
    
}
