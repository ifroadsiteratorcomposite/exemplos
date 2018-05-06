/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.compositeexample;

import model.Funcionario;
import model.GerenteProjeto;
import model.Programador;

/**
 *
 * @author igorbueno
 */
public class BrComCompositeExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario gerente = new GerenteProjeto("Projetos fiscais", "Marcos", 5.800);
        gerente.addSubordinado(new Programador("Pleno", "Luiz", 5.500));
        gerente.addSubordinado(new Programador("Sênior", "Rogério", 4.500));
        gerente.addSubordinado(new Programador("Junior", "Fernando", 3.500));
        
        gerente.listarSubordinados();
        gerente.imprimirHolerith("Janeiro");
        
    }
    
}
