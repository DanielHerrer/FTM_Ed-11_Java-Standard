import java.util.Arrays;

public class ArrayEncapsulado {

    private int[] lista = new int[15];

    public ArrayEncapsulado(){

    }

    public void rellenar(int dato){
        for(int i=0; i<lista.length; i++){
            lista[i] = dato;
        }
    }

    public void rellenar(){
        int num, encontrado = 1;

        for(int i=0; i<lista.length; i++){
            
            do{
                num = (int)(Math.random()*50 + 1);
                for(int j=0; j<lista.length; j++){
                    if(lista[j] == num){
                        encontrado = j;
                        break;
                    }else{
                        encontrado = -1;
                    }
                }
                   
                if(!(encontrado >= 0)){
                    lista[i] = num;
                    break;
                }
            }while(encontrado > -1);
        }
    }

    public void ordenar(){
        Arrays.sort(lista);
    }

    public void visualizar(){
        for(int i: lista){
            System.out.print("["+i+"]");
        }
        System.out.println("");
    }
    
}