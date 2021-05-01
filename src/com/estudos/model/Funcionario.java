package com.estudos.model;

import com.estudos.enumerator.Cargo;

public class Funcionario {

    private String nomeFuncionario;
    private String nome;
    private String cpf;
    private double salario;
    private Cargo cargo;
    private int numero;

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Funcionario(String nomeFuncionario, double salario) {
        this.nomeFuncionario = nomeFuncionario;
        this.salario = salario;
    }

    public Funcionario(String nomeFuncionario, double salario, String cpf) {
        this.nomeFuncionario = nomeFuncionario;
        this.salario = salario;
        this.cpf = cpf;
        this.nome = nomeFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario * cargo.getBonus();
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
