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
public class Rutas {

    private int x1;//variables generales
    private int y1;
    private int x2;
    private int y2;
    private int cuadras;
    private int calle;
    private int carrera;
    private int neg = -1;
    private String bicicleta;

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

    public String getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(String bicicleta) {
        this.bicicleta = bicicleta;
    }

    public void mostrarRutasDisponibles() {//crear y mostrar rutas
        calle = x1 - x2;//calcular distancia entre calles
        if (calle < 0) {
            calle = calle * neg;//pasar valores a positivos
        }
        carrera = y1 - y2;//calcular distancia entre carreras
        if (carrera < 0) {
            carrera = carrera * neg;//pasar valores a positivos
        }
        cuadras = calle + carrera;//calcular cuadras totales
        Caminar c = new Caminar();//crear clase
        Taxi t = new Taxi();//crear clase
        Uber u = new Uber();//crear clase
        Bicicleta b = new Bicicleta();//crear clase
        System.out.println("Elegir el transporte que desee:");//imprimir mensaje
        c.setX1(x1);//metodos setters
        c.setX2(x2);
        c.setY1(y1);
        c.setY2(y2);
        System.out.println("    Ruta CAMINANDO:");//imprimir mensaje
        c.rutaCalculada();

        if (cuadras > 10) {//condicional
            t.setX1(x1);
            t.setX2(x2);
            t.setY1(y1);
            t.setY2(y2);
            System.out.println("    Ruta TAXI:");//imprimir mensaje
            t.rutaCalculada();
        }
        if (cuadras > 15) {//condicional
            u.setX1(x1);
            u.setX2(x2);
            u.setY1(y1);
            u.setY2(y2);
            System.out.println("    Ruta UBER:");//imprimir mensaje
            u.rutaCalculada();
        }
        if (bicicleta.equals("si")) {
            b.setX1(x1);
            b.setX2(x2);
            b.setY1(y1);
            b.setY2(y2);
            System.out.println("    Ruta EN BICICLETA:");//imprimir mensaje
            b.rutaCalculada();
        }

    }
}
