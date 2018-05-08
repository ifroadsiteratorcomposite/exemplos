/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author hoele
 */
public class Caixa implements Iterable<SenhaAtendimento> {

    
    ArrayList <SenhaAtendimento> senhaTotal;
    
    
    @Override
    public Iterator<SenhaAtendimento> iterator() {
      return new SenhaIterator();
    }

    public Caixa(int qtdSenha) {
        senhaTotal = new ArrayList<>();
        
        for (int i = 1; i <= qtdSenha; i++) {
            senhaTotal.add(new SenhaAtendimento(i));
            
        }
        
        
    }
    
    
   private class SenhaIterator implements Iterator<SenhaAtendimento>{
       
       
       int posicao = 0;

        @Override
        public boolean hasNext() {
            
            return posicao<senhaTotal.size();
          
        }

        @Override
        public SenhaAtendimento next() {
            if(hasNext()){
                return senhaTotal.get(posicao++);
                
            }
            else 
                return null;
        }
       
       
   }
    
    
}
