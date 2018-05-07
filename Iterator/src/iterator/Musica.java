/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;


public class Musica {
    
    
    private int numeroMusica;

    public Musica(int numeroMusica) { // Construtor 
        this.numeroMusica = numeroMusica;
    }
    
    public void Tocar(){
        System.out.println("Tocando musica Numero: "+this.numeroMusica);
    }
}
