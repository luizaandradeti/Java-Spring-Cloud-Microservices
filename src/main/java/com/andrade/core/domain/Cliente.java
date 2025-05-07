package com.andrade.core.domain;



public class Cliente {

        private String id;
        private String nome;
        private String documento;
        private Regiao regiao;
        private Boolean isValidDocumento;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public Regiao getRegiao() {
        return regiao;
    }
    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }
    public Boolean getValidDocumento() {
        return isValidDocumento;
    }
    public void setValidDocumento(Boolean validDocumento) {
        isValidDocumento = validDocumento;
    }
    public Cliente() {
        this.isValidDocumento = false;
    }
    public Cliente(String id, String nome, String documento, Regiao regiao, Boolean isValidDocumento) {
        this.id = id;
        this.nome = nome;
        this.documento = documento;
        this.regiao = regiao;
        this.isValidDocumento = isValidDocumento;
    }
}
