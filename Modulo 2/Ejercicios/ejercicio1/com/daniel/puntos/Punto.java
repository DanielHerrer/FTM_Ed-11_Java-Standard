package com.daniel.puntos;

public class Punto {

    int x, y;
        
    public Punto(){
        x = 0;
        y = 0;
    }

    public Punto(int paramX, int paramY){
        x = paramX;
        y = paramY;
    }

    public Punto(Punto var){
        x = var.x;
        y = var.y;
    }

    public void pintar(){
        System.out.println("Coordenada X / Y : " + x + " / " + y );
    }

}