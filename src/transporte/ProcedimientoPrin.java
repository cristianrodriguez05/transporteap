/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;

import java.util.Scanner;
import transporte.logica.Persona;
/**
 *
 * @author crist
 */
public class ProcedimientoPrin{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona p = new Persona();
        System.out.print("*****PROGRAMA PARA CALCULAR SU RUTA DE VIAJE*****\n");
        
        p.ingresarDatos();
        p.mostrarRuta();
        // TODO code application logic here
    }
    
}
