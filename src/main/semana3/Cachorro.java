package main.semana3;

import java.io.Serializable;

public class Cachorro implements Serializable {

    private Integer idade;
    private Double peso;
    private String nome;

    public Cachorro(Integer idade, Double peso, String nome) {
        this.idade = idade;
        this.peso = peso;
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
