package com.daniel.puntos;

public class PruebaPunto {
    public static void main(String[] args){

        Punto objeto1 = new Punto();
        Punto objeto2 = new Punto(25,86);
        Punto objeto3 = new Punto(objeto2);
        int x, y;

        objeto1.pintar();
        objeto2.pintar();
        objeto3.pintar();

        int numAleat20 = (int) (Math.random() * 19) + 1;

        //tipo_dato nombre_array[]; nombre_array = new tipo_dato[tamanio];
        Punto listaPuntos[];
        listaPuntos = new Punto[numAleat20];
        
        // SIZE = CANTIDAD DE ELEMENTOS EN ARRAY
        // LENGTH = CANTIDAD MAXIMA DE INDEX EN ARRAY

        System.out.println("Dimension del array: "+ numAleat20);
             
        for(int i=0 ; i < listaPuntos.length ; i++){
            x = (int) (Math.random() * 100);
            y = (int) (Math.random() * 100);
            Punto objeto = new Punto(x,y);
            listaPuntos[i] = objeto;
        }

        for(int i=0;i<listaPuntos.length;i++){
            listaPuntos[i].pintar();
        }

    }

}