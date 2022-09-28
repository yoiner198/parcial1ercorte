/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ESTUDIANTE
 */
public class Participante {
    private String nombre;
    private String apellido;
    private int numero;
    Llanta llanta = new Llanta(2);

    public Participante(String nombre, String apellido, int numero, Llanta llanta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.llanta = llanta;
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
