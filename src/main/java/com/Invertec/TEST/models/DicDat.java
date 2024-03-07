package com.Invertec.TEST.models;


import jakarta.persistence.*;

@Entity
@Table(name = "DicDat")
public class DicDat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="Planta")
    private String Planta;
    @Column(name ="Grupo")
    private String Grupo;
    @Column(name ="Descripcion_Grupo")
    private String Descripcion_Grupo;
    @Column(name ="Fuente")
    private String Fuente;
    @Column(name ="Descripcion_TAG")
    private String Descripcion_TAG;

    public DicDat(Long id, String planta, String grupo, String descripcion_Grupo, String fuente, String descripcion_TAG) {
        this.id = id;
        Planta = planta;
        Grupo = grupo;
        Descripcion_Grupo = descripcion_Grupo;
        Fuente = fuente;
        Descripcion_TAG = descripcion_TAG;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlanta() {
        return Planta;
    }

    public void setPlanta(String planta) {
        Planta = planta;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String grupo) {
        Grupo = grupo;
    }

    public String getDescripcion_Grupo() {
        return Descripcion_Grupo;
    }

    public void setDescripcion_Grupo(String descripcion_Grupo) {
        Descripcion_Grupo = descripcion_Grupo;
    }

    public String getFuente() {
        return Fuente;
    }

    public void setFuente(String fuente) {
        Fuente = fuente;
    }

    public String getDescripcion_TAG() {
        return Descripcion_TAG;
    }

    public void setDescripcion_TAG(String descripcion_TAG) {
        Descripcion_TAG = descripcion_TAG;
    }
}
