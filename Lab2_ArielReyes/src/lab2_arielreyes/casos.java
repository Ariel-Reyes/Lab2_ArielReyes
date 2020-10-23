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
public class casos {

    // variables 
    private String lugar;
    private String descrip;
    private String tipo;
    private String cargo;
    private String estado;
// constructor

    public casos() {
    }

    // mutadores 
// setter
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setTipo(String tipo) {
        if (tipo.equals("HOMICIDIO") || tipo.equals("ROBO") || tipo.equals("SECUESTRO")) {
            this.tipo = tipo;
        }

    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setEstado(String estado) {
        if (estado.equals("PROCESO") || estado.equals("RESUELTO")) {
            this.estado = estado;
        }

    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    // getter 
    public String getEstado() {
        return estado;
    }

    public String getLugar() {
        return lugar;
    }

    public String getDescrip() {
        return descrip;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCargo() {
        return cargo;
    }

    public String toString() {
        return "Lugar: " + lugar + " Descripcion: " + descrip + " tipo: " + tipo + " Cargo: " + cargo + " estado: " + estado;
    }

}
