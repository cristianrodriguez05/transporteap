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
public class Persona {

    Datos d = new Datos();//declarar nueva clase
    Rutas r = new Rutas();//declarar nueva clase
    Scanner sc = new Scanner(System.in);//Declarar escaner
    private String bicicleta;//variable

    public void ingresarDatos() {
        System.out.print("Si la Calle es sur ingrese numeros negativos      Calle de Origen: ");
        d.setX1(sc.nextInt());//leer calle inicio
        r.setX1(d.getX1());
        System.out.print("Si la Carrera es este ingrese numeros negativos       Carrera de Origen: ");
        d.setY1(sc.nextInt());//leer carrera inicio
        r.setY1(d.getY1());
        System.out.print("Si la Calle es sur ingrese numeros negativos      Calle de Destino: ");
        d.setX2(sc.nextInt());//leer calle destino
        r.setX2(d.getX2());
        System.out.print("Si la Carrera es este ingrese numeros negativos       Carrera de Destino: ");
        d.setY2(sc.nextInt());//leer carrera destino
        r.setY2(d.getY2());
        System.out.print("¿Tiene bicicleta? Responda si o no en minusculas:  ");//imprimir pregunta al usuario
        bicicleta = sc.next();//guardar respuesta
        r.setBicicleta(bicicleta);//pasar parametro con respuesta
    }

    public void mostrarRuta() {
        d.mostrarCuadras();//metodo mostrar cuadras totales
        r.mostrarRutasDisponibles();//mostrar todas las rutas
    }
}
