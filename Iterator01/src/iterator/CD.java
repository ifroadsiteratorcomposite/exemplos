/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author hoele
 */
public class CD implements Iterable<Musica> {
    
    
    private ArrayList<Musica> musicas;
    
    @Override
    public Iterator<Musica> iterator() { // metodo publico iterator para retornar o iterator
       return new CDIterator();
    }
    
    public CD(int qtdMusicas){    // Contrutor da Classe
        musicas = new ArrayList<>();
        
        for (int i = 1; i <= qtdMusicas; i++) {
            musicas.add(new Musica(i)); 
            
        }
     
   }
    
    private class CDIterator implements Iterator<Musica>{ //Subclasse
        
        
        private int posicaoAtual=0;
        @Override
        public boolean hasNext() {
            
        return posicaoAtual < musicas.size();
          
        }

        @Override
        public Musica next() {
            if(hasNext()){
                return musicas.get(posicaoAtual++);
            }
            else 
                return null;
        }
            
        }
    
    
    
}
      
