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
    static ArrayList caso = new ArrayList();
  static String go = "";
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
                    if (detec.size() == 0) {
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

                    System.out.println("Ingrese el lugar: ");
                    leer.nextLine();
                    String lugar = leer.nextLine();
                    System.out.println("Ingrese la descripcion: ");

                    String descrip = leer.nextLine();
                    System.out.println("Ingrese el tipo (1) Homicidio, 2) Robo, 3) Secuestro): ");
                    int tipo = leer.nextInt();
                    while (tipo <= 0 || tipo > 3) {
                        System.out.println("Hubo un error al ingresar el tipo,Ingrese el tipo (Homicidio, Robo, Secuestro): ");
                        tipo = leer.nextInt();
                    }

                    String tipo_v2 = "";
                    if (tipo == 1) {
                        tipo_v2 = "HOMICIDIO";
                    }
                    if (tipo == 2) {
                        tipo_v2 = "ROBO";
                    }
                    if (tipo == 3) {
                        tipo_v2 = "SECUESTRO";
                    }
                    String detec_nom ="";
                    if (detec.size() == 0) {
                        System.out.println("No hay detectives disponible");
                    } else {
                        String acu = "";
                        for (int i = 0; i < detec.size(); i++) {
                            go += i + ")" + detec.get(i) + "\n";
                        }
                        System.out.println("---Detectives----");
                        System.out.println(go);
                        System.out.println("No existe ese detective,Ingrese el nombre del detective desea para este caso: ");
                        detec_nom = leer.next();


                         while(!(go.contains(detec_nom))){
                             System.out.println("Ingrese el nombre del detective desea para este caso: ");
                         detec_nom = leer.next();
                         }
                      
                    }
                    System.out.println("Ingrese el estado (1) proceso,2) resuelto)");
                    int estado = leer.nextInt();
                    while (estado <= 0 || estado > 2) {
                        System.out.println("Ingreso un estado mal, Ingrese el estado (1) proceso,2) resuelto)");
                        estado = leer.nextInt();
                    }
                    String estado_v2 = "";
                    if (estado == 1) {
                        estado_v2 = "PROCESO";
                    }
                    if (estado == 2) {
                        estado_v2 = "RESUELTO";
                    }

                    casos C = new casos();
                    C.setCargo(detec_nom);
                    C.setEstado(estado_v2);
                    C.setTipo(tipo_v2);
                    C.setLugar(lugar);
                    C.setDescrip(descrip);
                    caso.add(C);
                    System.out.println(caso);

                    break;

                case 6:
                    if (caso.size() == 0) {
                        System.out.println("Aun no hay casos");
                    } else {
                        System.out.println("--MODIFICAR CASOS--");
                        String ac = "";
                        for (int i = 0; i < caso.size(); i++) {
                            ac += i + ")" + caso.get(i) + "\n";
                        }
                        System.out.println("--casos--");
                        System.out.println(ac + "\n" + "Ingrese el indice a modificar: ");
                         int indice = leer.nextInt();

                        System.out.println("Ingrese donde desea modificar: " + "\n" + "1) Lugar" + "\n" + "2) Descripcion" + "\n" + "3) tipo" + "\n" + "4) Detective a cargo" + "\n" + "5) Estado" + "\n" + "Ingrese la opcion : ");
                       
                        

                        int op = leer.nextInt();
                        switch (op) {
                            case 1:
                                System.out.println("Ingrese el lugar: ");
                                leer.nextLine();
                                lugar = leer.nextLine();
                                ((casos) caso.get(indice)).setLugar(lugar);
                                break;
                            case 2:
                                leer.nextLine();
                                System.out.println("Ingrese la descripcion: ");
                                descrip = leer.nextLine();
                                ((casos) caso.get(indice)).setDescrip(descrip);

                                break;
                            case 3:
                                System.out.println("Ingrese el tipo (1) Homicidio, 2) Robo, 3) Secuestro): ");
                                tipo = leer.nextInt();
                                while (tipo <= 0 || tipo > 3) {
                                    System.out.println("Hubo un error al ingresar el tipo,Ingrese el tipo (1) Homicidio, 2)Robo, 3)Secuestro): ");
                                    tipo = leer.nextInt();
                                }
                                tipo_v2 = "";
                                if (tipo == 1) {
                                    tipo_v2 = "HOMICIDIO";
                                }
                                if (tipo == 2) {
                                    tipo_v2 = "ROBO";
                                }
                                if (tipo == 3) {
                                    tipo_v2 = "SECUESTRO";
                                }
                                ((casos) caso.get(indice)).setTipo(tipo_v2);

                                break;
                            case 4:
                                detec_nom = "";
                                if (detec.size() == 0) {
                                    System.out.println("No hay detectives disponible");
                                } else {
                                    String acu = "";
                                    for (int i = 0; i < detec.size(); i++) {
                                        go += i + ")" + detec.get(i) + "\n";
                                    }
                                    System.out.println("---Detectives----");
                                    System.out.println(go);
                                    System.out.println("Ingrese el nombre del detective desea para este caso: ");
                                    detec_nom = leer.next();
                                    
                                    while (!(go.contains(detec_nom))) {
                                        System.out.println("No existe ese detective,Ingrese el nombre del detective desea para este caso: ");
                                        detec_nom = leer.next();
                                    }
                                    ((casos) caso.get(indice)).setCargo(detec_nom);

                                }

                                break;
                            case 5:
                                System.out.println("Ingrese el estado (1) proceso,2) resuelto)");
                                estado = leer.nextInt();
                                while (estado <= 0 || estado > 2) {
                                    System.out.println("Ingreso un estado mal, Ingrese el estado (1) proceso,2) resuelto)");
                                    estado = leer.nextInt();
                                }
                                estado_v2 = "";
                                if (estado == 1) {
                                    estado_v2 = "PROCESO";
                                }
                                if (estado == 2) {
                                    estado_v2 = "RESUELTO";
                                }
                                  ((casos) caso.get(indice)).setEstado(estado_v2);

                                break;
                        }

                    }
                    break;
                case 7:
                    if (caso.size() == 0) {
                        System.out.println("Aun no hay casos ");
                    } else {
                        System.out.println("--LISTAR CASOS--");
                        String acux = "";
                        for (int i = 0; i < caso.size(); i++) {
                            acux += i + ")" + caso.get(i) + "\n";
                        }
                        System.out.println(acux);
                    }
                    break;

                case 8:
                    String cade = "";
                    String re = "";
                    for (int i = 0; i < caso.size(); i++) {

                        cade = ((casos) caso.get(i)).getEstado();
                        if (cade.equals("RESUELTO")) {
                            re += re + caso.get(i);
                        }

                    }
                    System.out.println("--Casos resueltos--");
                    System.out.println(re);

                    break;

                case 9:
                    String cadex = "";
                    String pr = "";
                    for (int i = 0; i < caso.size(); i++) {

                        cadex = ((casos) caso.get(i)).getEstado();
                        if (cadex.equals("PROCESO")) {
                            pr += pr + caso.get(i);
                        }

                    }
                    System.out.println("--Casos en Proceso--");
                    System.out.println(pr);

                    break;

            }

        }

    }

}
