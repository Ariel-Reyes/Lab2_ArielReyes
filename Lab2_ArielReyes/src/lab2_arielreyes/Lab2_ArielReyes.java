/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_arielreyes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ariel
 */
public class Lab2_ArielReyes {

    static ArrayList detec = new ArrayList();
    static Scanner leer = new Scanner(System.in);
 static Scanner caso = new Scanner(System.in);
    public static void main(String[] args) {

        int opcion = 0;
        while (opcion != 10) {

            System.out.println("----Menu----");
            System.out.println("1) Agregar Detective");
            System.out.println("2) Eliminar Detective");
            System.out.println("3) Modificar Detectives");
            System.out.println("4) Listar Detectives");
            System.out.println("5) Registrar casos");
            System.out.println("6) Modificar casos");
            System.out.println("7) Listar casos");
            System.out.println("8) Listar casos resueltos");
            System.out.println("9) Listar casos pendientes");
            System.out.println("10) salir");
            
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del detective: ");
                    String nombre = leer.next();
                    System.out.println("Ingrese la edad: ");
                    int edad = leer.nextInt();
                    while (edad <= 0) {
                        System.out.println("Ingreso algo mal,Ingrese la edad: ");
                        edad = leer.nextInt();
                    }
                    System.out.println("Ingrese la nacionalidad: ");
                    String nacionalidad = leer.next();
                    System.out.println("Years laborales: ");
                    int year_labo = leer.nextInt();
                    System.out.println("Nivel de rango: ");
                    int nivel = leer.nextInt();
                    while (nivel <= 0 || nivel > 10) {
                        System.out.println("Ingreso algo incorrecto, Ingrese nivel de rango: ");
                        nivel = leer.nextInt();
                    }
                    detectives H = new detectives(nombre, edad, nacionalidad, year_labo, nivel);
                    detec.add(H);

                    break;
                case 2:
                    if (detec.size() == 0) {
                        System.out.println("Aun no hay detectives registrados");
                    } else {
                        String acu = "";
                        for (int i = 0; i < detec.size(); i++) {
                            acu += i + ")" + detec.get(i) + "\n";
                        }
                        System.out.println(acu);
                        System.out.println("Ingrese el detective que desea eliminar: ");
                        int eliminar = leer.nextInt();
                        while (eliminar < 0 || eliminar > detec.size()) {
                            System.out.println("Ingrese un numero muy bajo o alto, Ingrese el detective que desea eliminar: ");
                            eliminar = leer.nextInt();
                        }
                        detec.remove(eliminar);
                        System.out.println("Se a elimnado exitosamente");

                    }
                    break;

                case 3:
                    if (detec.size() == 0) {
                        System.out.println("Aun no hay detectives registrados");
                    } else {
                        String acu = "";
                        for (int i = 0; i < detec.size(); i++) {
                            acu += i + ")" + detec.get(i) + "\n";
                        }
                        System.out.println("--Modificar Detectives--");
                        System.out.println(acu);
                        System.out.println("Ingrese el indice del que desea modificar: ");
                        int indice = leer.nextInt();

                        System.out.println("Ingrese el que desea modificar " + "\n" + "1) Nombre" + "\n" + "2) edad" + "3) Nacionalidad" + "\n" + "4) años laborales" + "\n" + "5) Nivel de rango" + "\n" + "Ingrese la opcion que desea modificar: ");
                        int mod = leer.nextInt();
                        switch (mod) {
                            case 1:
                                System.out.println("Ingrese un nombre: ");
                                nombre = leer.next();
                                ((detectives) detec.get(indice)).setNombre(nombre);
                                break;
                            case 2:
                                System.out.println("Ingrese la edad: ");
                                edad = leer.nextInt();
                                while (edad <= 0) {
                                    System.out.println("Ingreso algo malo,Ingrese la edad: ");
                                    edad = leer.nextInt();
                                }
                                ((detectives) detec.get(indice)).setEdad(edad);
                                break;
                            case 3:
                                System.out.println("Ingrese la nacionalidad: ");
                                nacionalidad = leer.next();
                                ((detectives) detec.get(indice)).setNacionalidad(nacionalidad);

                                break;
                            case 4:
                                System.out.println("Ingrese los años laborales: ");
                                year_labo = leer.nextInt();
                                while (year_labo <= 0) {
                                    System.out.println("Ingreso algo malo,Ingrese los años laborales: ");
                                    year_labo = leer.nextInt();
                                }
                                ((detectives) detec.get(indice)).setYears_labora(year_labo);
                                break;
                            case 5:
                                System.out.println("Ingrese el nivel de rango: ");
                                nivel = leer.nextInt();
                                while (nivel <= 0) {
                                    System.out.println("Ingreso algo mal,Ingrese el nivel de rango: ");
                                    nivel = leer.nextInt();
                                }
                                ((detectives) detec.get(indice)).setNivel(nivel);
                                break;
                        }

                    }

                    break;

                case 4:
                    if(detec.size()==0){
                        System.out.println("La lista aun esta vacia :( ");
                    } else {

                        System.out.println("--Listar--");
                        String acu = "";
                        for (int i = 0; i < detec.size(); i++) {
                            acu += i + ")" + detec.get(i) + "\n";
                        }
                        System.out.println(acu);
                    }
                    break;

                case 5:
                    System.out.println("--Registro de casos--");

                    break;

            }

        }

    }

}
