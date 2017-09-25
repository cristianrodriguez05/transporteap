/*Copyright (C) 2017 Cristian Rodriguez & David Franco & Daniel Ojeda
 * Universidad Distrital Francisco Jose de Caldas.2017.
 * Programacion Orientada a Objetos - Gr 020 - 85
 * Prohibida la reproduccion total o parcial de este codigo.
 */
package transporte;

import java.util.Scanner;
import transporte.logica.Persona;

/**
 *
 * @author crist
 * version 1.0
 */
public class ProcedimientoPrin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Declarar escaner
        Persona p = new Persona();//declarar nueva clase
        System.out.print("*****PROGRAMA PARA CALCULAR SU RUTA DE VIAJE*****\n");//imprimir rotulo

        p.ingresarDatos();//implementar metodos persona
        p.mostrarRuta();
  
    }

}
