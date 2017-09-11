/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte.logica;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Datos {

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int cuadras;
    private int calle;
    private int carrera;
    public int getX1() {
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

    public void mostrarCuadras() {
    
        int neg=-1;
        calle = x1-x2;
        if(calle<0){
            calle=calle*neg;
        }
        carrera = y1-y2;
        if(carrera<0){
            carrera=carrera*neg;    
        }
        cuadras=calle+carrera;
        System.out.println("La distancia total a recorrer es  " + cuadras + " Cuadras");
        System.out.println("");
        System.out.println("");
    }

}

