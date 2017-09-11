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
public class Rutas {

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int cuadras;
    private int calle;
    private int carrera;
    private int neg = -1;
    private String bicicleta;
  
    
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

    public String getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(String bicicleta) {
        this.bicicleta = bicicleta;
    }

    public void mostrarRutasDisponibles() {
        calle = x1 - x2;
        if (calle < 0) {
            calle = calle * neg;
        }
        carrera = y1 - y2;
        if (carrera < 0) {
            carrera = carrera * neg;
        }
        cuadras = calle + carrera;
        Caminar c = new Caminar();
        Taxi t = new Taxi();
        Uber u = new Uber();
        Bicicleta b = new Bicicleta(); 
        System.out.println("Elegir el transporte que desee:");
        c.setX1(x1);
        c.setX2(x2);
        c.setY1(y1);
        c.setY2(y2);
        System.out.println("    Ruta CAMINANDO:");
        c.rutaCalculada();

        if (cuadras > 10) {
            t.setX1(x1);
            t.setX2(x2);
            t.setY1(y1);
            t.setY2(y2);
            System.out.println("    Ruta TAXI:");
            t.rutaCalculada();
        }
        if (cuadras > 15) {
            u.setX1(x1);
            u.setX2(x2);
            u.setY1(y1);
            u.setY2(y2);
            System.out.println("    Ruta UBER:");
            u.rutaCalculada();
        }
        if(bicicleta.equals("si")){
        b.setX1(x1);
        b.setX2(x2);
        b.setY1(y1);
        b.setY2(y2);
        System.out.println("    Ruta EN BICICLETA:");
        b.rutaCalculada();
        }

    }
}
