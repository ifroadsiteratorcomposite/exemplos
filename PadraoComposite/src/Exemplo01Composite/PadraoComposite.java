/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplo01Composite;

/**
 *
 * @author Rodrigo
 */
public class PadraoComposite {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Composto c1 =  new Composto("Composto 1");
        Composto c2 =  new Composto("Composto 2");
        Composto c3 =  new Composto("Composto 3");
        Folha f3 =  new Folha("Folha 1");
        
        c2.add(c3);
        c1.add(c2);
        c2.add(f3);
        
        c1.getTexto();
        
    }
    
}
