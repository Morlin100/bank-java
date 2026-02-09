package com.bank.study;

public class PessoaAtributos {
    private String nomePrivado;
    public String nomePublico;
    protected String nomeProtegido;
    public static String nomeEstatico;
    public final String nomeFinal = "Felippe";


    public String getNomePrivado() {
        return nomePrivado;

    }
    public void setNomePrivado( String nome) {
        this.nomePrivado = nome;
    }
}

