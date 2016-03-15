package model;

import java.util.Date;

public class Livro {

    private int id_livro;
    private String nm_livro;
    private String ds_livro;
    private Date dt_lancamento;
    private String cd_isbn;
    private Date dt_registrado;
    private Date dt_alterado;
    private Boolean fl_status;

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public String getNm_livro() {
        return nm_livro;
    }

    public void setNm_livro(String nm_livro) {
        this.nm_livro = nm_livro;
    }

    public String getDs_livro() {
        return ds_livro;
    }

    public void setDs_livro(String ds_livro) {
        this.ds_livro = ds_livro;
    }

    public Date getDt_lancamento() {
        return dt_lancamento;
    }

    public void setDt_lancamento(Date dt_lancamento) {
        this.dt_lancamento = dt_lancamento;
    }

    public String getCd_isbn() {
        return cd_isbn;
    }

    public void setCd_isbn(String cd_isbn) {
        this.cd_isbn = cd_isbn;
    }

    public Date getDt_registrado() {
        return dt_registrado;
    }

    public void setDt_registrado(Date dt_registrado) {
        this.dt_registrado = dt_registrado;
    }

    public Date getDt_alterado() {
        return dt_alterado;
    }

    public void setDt_alterado(Date dt_alterado) {
        this.dt_alterado = dt_alterado;
    }

    public Boolean getFl_status() {
        return fl_status;
    }

    public void setFl_status(Boolean fl_status) {
        this.fl_status = fl_status;
    }
    
    @Override
    public String toString() {
        
        return "Id: %d\n" + this.getId_livro() +
               "Nome: %s\n" + this.getNm_livro() +
               "Descrição: %s\n" + this.getDs_livro() +
               "Data lançamento: %s\n" + this.getDt_lancamento() +
               "ISBN: %s\n\n" + this.getCd_isbn();
        
    }
    
}
