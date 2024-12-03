package com.futbolmanagement.model;

public class Jugador {
    private int idJugador;
    private String nombre;
    private int edad;
    private String posicion;
    private String telefono;
    private String email;


    public Jugador() {}


    public Jugador(int idJugador, String nombre, int edad, String posicion, String telefono, String email) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.telefono = telefono;
        this.email = email;
    }


    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Jugador [ID=" + idJugador + ", Nombre=" + nombre + ", Edad=" + edad + 
               ", Posición=" + posicion + ", Teléfono=" + telefono + ", Email=" + email + "]";
    }
}
