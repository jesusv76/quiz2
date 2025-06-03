package com.example.quiz2;

public class Noticia {
    private String imagen;
    private String nombre;
    private String desc;


    public Noticia(String imagen, String nombre, String curso) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.desc = curso;

    }

    public String getImagen() {
        return imagen;
    }



    public String getNombre() {
        return nombre;
    }



    public String getDesc() {
        return desc;
    }




}
