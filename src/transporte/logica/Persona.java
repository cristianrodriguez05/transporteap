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
public class Persona {
    Datos d = new Datos();
    Rutas r = new Rutas();
    Scanner sc = new Scanner (System.in);
    private String bicicleta;

 public void ingresarDatos() {
        System.out.print("Si la Calle es sur ingrese numeros negativos      Calle de Origen: ");
        d.setX1(sc.nextInt());
        r.setX1(d.getX1());
        System.out.print("Si la Carrera es este ingrese numeros negativos       Carrera de Origen: ");
        d.setY1(sc.nextInt());
        r.setY1(d.getY1());
        System.out.print("Si la Calle es sur ingrese numeros negativos      Calle de Destino: ");
        d.setX2(sc.nextInt());
        r.setX2(d.getX2());
        System.out.print("Si la Carrera es este ingrese numeros negativos       Carrera de Destino: ");
        d.setY2(sc.nextInt());
        r.setY2(d.getY2());
        System.out.print("¿Tiene bicicleta? Responda si o no en minusculas:  ");
        bicicleta = sc.next(); 
        r.setBicicleta(bicicleta);
    }

public void mostrarRuta(){
    d.mostrarCuadras();
    r.mostrarRutasDisponibles();
}
}
