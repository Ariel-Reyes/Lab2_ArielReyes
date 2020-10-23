/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_arielreyes;

/**
 *
 * @author Ariel
 */
public class detectives {
// variables

    String nombre;
    int edad;
    String nacionalidad;
    int years_labora;
    int nivel;
// constructor 

    public detectives(String nombre, int edad, String nacionalidad, int years_labora, int nivel) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.years_labora = years_labora;
        this.nivel = nivel;

    }
    // mutadores 

    //setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setYears_labora(int years_labora) {
        this.years_labora = years_labora;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    // getters

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getYears_labora() {
        return years_labora;
    }

    public String toString(){
        return "El nombre es: " + nombre + " La edad: " + edad + " La nacionalidad: " + nacionalidad + " Años laborales: "+years_labora +" Nivel: "+nivel ; 
    }
}
