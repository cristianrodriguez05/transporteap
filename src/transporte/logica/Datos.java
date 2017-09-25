/*Copyright (C) 2017 Cristian Rodriguez & David Franco & Daniel Ojeda
 * Universidad Distrital Francisco Jose de Caldas.2017.
 * Programacion Orientada a Objetos - Gr 020 - 85
 * Prohibida la reproduccion total o parcial de este codigo.
 */
package transporte.logica;

import java.util.Scanner;

/**
 *
 * @author crist
 * version 1.0
 */
public class Datos {

    private int x1;//variables generales
    private int y1;
    private int x2;
    private int y2;
    private int cuadras;
    private int calle;
    private int carrera;

    public int getX1() {//metodos setters y getters
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void mostrarCuadras() {//mostrar distancia entre cuadras

        int neg = -1;//variable convertir a positivo
        calle = x1 - x2;//calcular distancia entre calles
        if (calle < 0) {
            calle = calle * neg;//pasar valores a positivos
        }
        carrera = y1 - y2;//calcular distancia entre carreras
        if (carrera < 0) {
            carrera = carrera * neg;//pasar valores a positivos
        }
        cuadras = calle + carrera;//calcular cuadras totales
        System.out.println("La distancia total a recorrer es  " + cuadras + " Cuadras");//imprimir mensaje al usuario
        System.out.println("");//imprimir mensaje al usuario
        System.out.println("");//imprimir mensaje al usuario
    }

}
