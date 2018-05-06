/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author igorbueno
 */
public class GerenteProjeto extends Funcionario{
    private String setor;

    public GerenteProjeto() {
    }

    public GerenteProjeto(String setor, String nome, double salario) {
        super(nome, salario);
        this.setor = setor;
    }  
    
}
