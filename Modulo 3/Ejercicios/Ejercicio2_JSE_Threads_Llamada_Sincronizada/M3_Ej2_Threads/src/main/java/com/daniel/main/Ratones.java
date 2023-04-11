package com.daniel.main;

public class Ratones extends Thread{

    String nombreRaton;
    int cantComida;
    static int plato = 100;
    
    public Ratones(String nombre,int comida){
        nombreRaton = nombre;
        cantComida = comida;
    }
    
    public synchronized void comer(){
        if(plato>=cantComida){
            System.out.println(nombreRaton+" esta comiendo "+cantComida+" unidades de comida.");
            plato -= cantComida;
        }else{
            System.out.println(nombreRaton+" intentó comer pero no pudo.. no habia comida suficiente en el plato.");
            llenar();
        }
    }
    
    public synchronized void llenar(){
        plato = 100;
        System.out.println(nombreRaton+" ha llenado el plato.");
    }
    
    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep(1000); //Espera 1 segundo antes de comer
                comer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(plato == 0){
                llenar();
            }
        }
    }
    
    public static void main(String[] args) {
        Ratones r1 = new Ratones("Raton1", 5);
        Ratones r2 = new Ratones("Raton2", 10);
        
        r1.start();
        r2.start();
        
    }
}
