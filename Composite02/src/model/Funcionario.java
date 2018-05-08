/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author igorbueno
 */
public abstract class Funcionario {
    private String nome;
    private double salario;
    private List<Funcionario> funcionarios = new ArrayList<>();
    
    public Funcionario() {
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public void addSubordinado(Funcionario func) {
        this.funcionarios.add(func);
    }
    
    public Funcionario getSubordinado(int indice) {
        return this.funcionarios.get(indice);
    }
    
    public void removerSubordinado(int indice) {
        this.funcionarios.remove(indice);
    }

    public void listarSubordinados() {
        Iterator<Funcionario> funcIterator = this.funcionarios.iterator();
        StringBuilder mensagem = new StringBuilder();
        String quebraLinha = System.getProperty("line.separator");
                
        mensagem.append(String.format("Subordinados de %s", this.getNome()));
        mensagem.append(quebraLinha);

        while(funcIterator.hasNext()){
            Funcionario func = funcIterator.next();
            func.listarFuncionario();           
        }
        
        System.out.println(mensagem.toString());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public StringBuilder imprimirHolerith(String mes){
        StringBuilder message = new StringBuilder();
        String quebraLinha = System.getProperty("line.separator");
        
        message.append(quebraLinha);
        message.append("Holerith -> /n");
        message.append(quebraLinha);
        message.append(String.format("Nome: %s", this.getNome()));
        message.append(quebraLinha);
        message.append(String.format("Mês: %s", mes));
        message.append(quebraLinha);
        message.append(String.format("Salário: %f", this.getSalario()));
        message.append(quebraLinha);
        
        return message;
    }
    
    public void listarFuncionario(){
        StringBuilder message = new StringBuilder();
        String quebraLinha = System.getProperty("line.separator");
        
        message.append(quebraLinha);
        message.append("Dados do funcionário ->");
        message.append(quebraLinha);
        message.append(String.format("Nome: %s", this.getNome()));
        message.append(quebraLinha);
        message.append(String.format("Salário: %f", this.getSalario()));
        message.append(quebraLinha);
        
        System.out.println(message.toString());
    }
}
