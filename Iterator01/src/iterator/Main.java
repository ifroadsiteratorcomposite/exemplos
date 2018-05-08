/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.Iterator;

/**
 *
 * @author hoele
 */
public class Main {

 
    public static void main(String[] args) {
        
        CD cdXuxa = new CD(20);
        
        Iterator<Musica> it = cdXuxa.iterator();
        while(it.hasNext()){
            Musica m = it.next();
            m.Tocar();
        }
        
    }
    
}
