/*Copyright (C) 2017 Cristian Rodriguez & David Franco & Daniel Ojeda
 * Universidad Distrital Francisco Jose de Caldas.2017.
 * Programacion Orientada a Objetos - Gr 020 - 85
 * Prohibida la reproduccion total o parcial de este codigo.
 */
package transporte.logica;

/**
 *
 * @author crist
 * version 1.0
 */
public class Bicicleta extends Transportes {

    private int cuadras;//variables generales
    private int calle;
    private int carrera;
    private int tiemposeg;

    public void rutaCalculada() {
        int callei = x1;//variables utilizadas en el metodo
        int callef = x2;
        int carrerai = y1;
        int carreraf = y2;
        int neg = -1;
        int min;
        int hora;

        calle = x1 - x2;//calcular distancia entre calles
        if (calle < 0) {
            calle = calle * neg;//pasar valores a positivos
        }
        carrera = y1 - y2;//calcular distancia entre carrera
        if (carrera < 0) {
            carrera = carrera * neg;//pasar valores a positivos
        }
        if (carrerai < 0) {
            carrerai = carrerai * neg;//pasar valores a positivos
        }
        if (carreraf < 0) {
            carreraf = carreraf * neg;//pasar valores a positivos
        }
        if (callei < 0) {
            callei = callei * neg;//pasar valores a positivos
        }
        if (callef < 0) {
            callef = callef * neg;//pasar valores a positivos
        }
        cuadras = calle + carrera;//calcular cuadras totales
        tiemposeg = cuadras * 40;//tiempo total segundos
        min = tiemposeg / 60;//minutos
        hora = min / 60;//horas

        System.out.println("      " + "Usar bicicleta desde la calle " + callei + " con carrera " + carrerai + " hasta la calle " + callef + " con carrera " + carreraf);//imprimir mensaje al usuario
        if (x1 < x2) {//condicional
            System.out.println("      " + "--Recorrer " + calle + " calles al norte");//imprimir mensaje al usuario
            if (y1 < y2) {//condicional
                System.out.println("      --y " + "recoreer " + carrera + " carreras al oeste");//imprimir mensaje al usuario
            }
            if (y1 > y2) {//condicional
                System.out.println("      --y " + "recoreer " + carrera + " carreras al este");//imprimir mensaje al usuario
            }
        }
        if (x1 > x2) {//condicional
            System.out.println("      " + "--Recoreer " + calle + " calles al sur");//imprimir mensaje al usuario
            if (y1 < y2) {//condicional
                System.out.println("      --y " + "recoreer " + carrera + " carreras al oeste");//imprimir mensaje al usuario
            }
            if (y1 > y2) {//condicional
                System.out.println("      --y " + "recoreer " + carrera + " carreras al este");//imprimir mensaje al usuario
            }
        }
        if (x1 == x2) {//condicional
            if (y1 < y2) {//condicional
                System.out.println("      " + "--Recoreer " + carrera + " carreras al oeste");//imprimir mensaje al usuario
            }
            if (y1 > y2) {//condicional
                System.out.println("      " + "--Recoreer " + carrera + " carreras al este");//imprimir mensaje al usuario
            }
        }
        System.out.println("      " + "Tiempo total de recorrido en bicicleta: " + hora + " hora " + min % 60 + " minutos " + tiemposeg % 60 + " segundos\n");//imprimir mensaje al usuario
    }

}
