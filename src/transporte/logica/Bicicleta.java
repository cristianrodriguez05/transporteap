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
public class Bicicleta extends Transportes{
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
        tiemposeg=cuadras*40;
        min=tiemposeg/60;
        hora=min/60;
        
        System.out.println("      "+"Usar bicicleta desde la calle "+callei+" con carrera "+carrerai+" hasta la calle "+callef+" con carrera "+carreraf);
        if(x1<x2){
            System.out.println("      "+"--Recorrer "+calle+" calles al norte");
            if(y1<y2){
                System.out.println("      --y "+"recoreer "+carrera+" carreras al oeste");
            }
            if(y1>y2){
                System.out.println("      --y "+"recoreer "+carrera+" carreras al este");
            }
        }
        if(x1>x2){
            System.out.println("      "+"--Recoreer "+calle+" calles al sur");
            if(y1<y2){
                System.out.println("      --y "+"recoreer "+carrera+" carreras al oeste");
            }
            if(y1>y2){
                System.out.println("      --y "+"recoreer "+carrera+" carreras al este");
            }
        }
        if(x1==x2){
            if(y1<y2){
                System.out.println("      "+"--Recoreer "+carrera+" carreras al oeste");
            }
            if(y1>y2){
                System.out.println("      "+"--Recoreer "+carrera+" carreras al este");
            }
        }
        System.out.println("      "+"Tiempo total de recorrido en bicicleta: "+hora+" hora "+min%60+" minutos "+tiemposeg%60+" segundos\n");
    }
    
}
