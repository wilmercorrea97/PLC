package com.Invertec.TEST.models;

import java.util.Date;

public class DatosJoin {
    private int id;
    private Date ServerTimestamp;
    private String Planta;
    private String group;
    private String Descripcion_Grupo;
    private String source;
    private String Descripcion_TAG;
    private String value;

    public DatosJoin(){

    }

    public DatosJoin(int id, Date serverTimestamp, String planta, String group, String descripcionGrupo, String source, String descripcion_TAG, String value) {
        this.id = id;
        ServerTimestamp = serverTimestamp;
        Planta = planta;
        this.group = group;
        Descripcion_Grupo = descripcionGrupo;
        this.source = source;
        Descripcion_TAG = descripcion_TAG;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getServerTimestamp() {
        return ServerTimestamp;
    }

    public void setServerTimestamp(Date serverTimestamp) {
        ServerTimestamp = serverTimestamp;
    }

    public String getPlanta() {
        return Planta;
    }

    public void setPlanta(String planta) {
        Planta = planta;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDescripcionGrupo() {
        return Descripcion_Grupo;
    }

    public void setDescripcionGrupo(String descripcionGrupo) {
        Descripcion_Grupo = descripcionGrupo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDescripcion_TAG() {
        return Descripcion_TAG;
    }

    public void setDescripcion_TAG(String descripcion_TAG) {
        Descripcion_TAG = descripcion_TAG;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
