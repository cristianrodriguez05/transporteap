/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte.logica;

/**
 *
 * @author crist
 */
public class Taxi extends Transportes{
    private int cuadras;
    private int calle;
    private int carrera;
    private int tiemposeg;
    
    
    public void rutaCalculada(){
        int callei=x1;
        int callef=x2;
        int carrerai=y1;
        int carreraf=y2;
        int neg=-1;
        int min;
        int hora;
        int costo=0;
        
        calle = x1-x2;
        if(calle<0){
            calle=calle*neg;
        }
        carrera = y1-y2;
        if(carrera<0){
            carrera=carrera*neg;    
        }
        if(carrerai<0){
            carrerai=carrerai*neg;    
        }
        if(carreraf<0){
            carreraf=carreraf*neg;    
        }
        if(callei<0){
            callei=callei*neg;    
        }
        if(callef<0){
            callef=callef*neg;    
        }
        cuadras=calle+carrera;
        tiemposeg=cuadras*25;
        min=tiemposeg/60;
        hora=min/60;
        
        System.out.println("      "+"--Pedir taxi al telefono 9111111 o por la aplicacion Tappsi o Easy taxi"); 
        System.out.println("      "+"Iniciar recorrido en Taxi desde la calle "+callei+" con carrera "+carrerai+" hasta la calle "+callef+" con carrera "+carreraf);
        if(cuadras<=40){
            costo=5000;
        }
        if(cuadras>40){
            int unidad=cuadras-40;
            costo=5000+(unidad*100);
        }
        System.out.println("      "+"Costo aproximado carrera de Taxi: "+costo+" pesos");
        System.out.println("      "+"Tiempo total de recorrido: "+hora+" hora "+min%60+" minutos "+tiemposeg%60+" segundos\n");
    }
    
    
}
