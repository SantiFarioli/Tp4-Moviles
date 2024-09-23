package com.example.menuconmapa.model;

import java.io.Serializable;

public class Farmacia implements Serializable {
    private String nombre;
    private String direccion;
    private int foto;
    private String info;
    private double lat;
    private double lng;

    public Farmacia() {
    }

    public Farmacia(String nombre, String direccion, int foto, String info, double lat, double lng) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.foto = foto;
        this.info = info;
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}