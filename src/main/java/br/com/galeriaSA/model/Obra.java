package br.com.galeriaSA.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity(name = "obra")
public class Obra {

    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max=80)
    @NotNull
    private String nomeObra;

    @Size(max=80)
    @NotNull
    private String nomeArtista;

    @Size(max=50)
    @NotNull
    private String tipo;

    @NotNull
    private Date dataObra;

    @Size(max=150)
    @NotNull
    private String descricao;

    //GETTERS E SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeObra() {
        return nomeObra;
    }

    public void setNomeObra(String nomeObra) {
        this.nomeObra = nomeObra;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getDataObra() {
        return dataObra;
    }

    public void setDataObra(Date dataObra) {
        this.dataObra = dataObra;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Obra =" +
                " id:" + id +
                ", nomeObra:" + nomeObra +
                ", nomeArtista:" + nomeArtista +
                ", tipo:" + tipo +
                ", dataObra:" + dataObra +
                ", descricao:" + descricao + ';';
    }
}
