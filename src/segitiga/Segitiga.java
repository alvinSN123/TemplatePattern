/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitiga;

/**
 *
 * @author USER
 */
public abstract class Segitiga {
    abstract void segitigasamasiku();
    abstract void segitigasamasisi();
    abstract void segitigalancip();
    
     //template method
   public final void play(){

 
      segitigasamasiku();

    
      segitigasamasisi();

     
      segitigalancip();
   }

    public void segitigapascal() {
    }
}

