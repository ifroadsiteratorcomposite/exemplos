/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Iterator;

/**
 *
 * @author hoele
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Caixa sn = new Caixa(30);
   // Iterator<SenhaAtendimento> it = sn.iterator();
   
   for(SenhaAtendimento senha: sn){
       senha.Atendimento();
   }
   
   
}
}
