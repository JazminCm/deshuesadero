/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deshuesadero;


/**
 *
 * @author rafaelm
 */
public class Deshuesadero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciamor el coche1 y el coche2 con parametros en constructor 
        Coche coche1 = new Coche("Ferrari","Deportivo",300);
        Coche coche2 = new Coche("Audi","Deportivo",300);
        
        //declaramos una CONSTANTE llamada distancia (no podrÃ¡ cambiar su valor)
        final int DISTANCIA = 100;
        
        //Primer forma para resolver nuestro goal... 
        // calculamos el tiempo que tarda cada coche con un mÃ©todo 
        //que envÃ­a la distancia y la velocidad y nos retorna y double de tiempo
        double tiempo1 = calcularTiempo(DISTANCIA,coche1.getVelocidad());
        double tiempo2 = calcularTiempo(DISTANCIA,coche2.getVelocidad());
        
        //comparamos tiempo 1 y tiempo 2 (ambos double) y el mÃ©todo nos imprime si el 
        //tiempo1 es mayor al tiempo2 o viceversa
        compararTiempo(tiempo1,tiempo2);
        
        //Segunda forma de resolver nuestro goal...
        //comparar los dos objetos en un mÃ©todo (notese que se envÃ­a como 
        //parametro el objeto coche1 y el objeto coche2 asÃ­ como la distancia que recorrerÃ¡n ambos)
        //este mÃ©todo estÃ¡tico nos retornarÃ¡ el objeto ganador
        Coche cocheganador = compararTiempoDeObjetos(coche1,coche2,DISTANCIA);
        
        //al final se imprime la marca del coche ganador que retornÃ³ el mÃ©todo anterior
        System.out.println("El coche ganador es " + cocheganador.getMarca());
    
    }

    
    //este mÃ©todo nos sirve para calcular el tiempo danda una distancia y velocidad
    public static double calcularTiempo(int DISTANCIA, int velocidad) {
        double tiempo = (double) DISTANCIA / (double) velocidad;
        
        return tiempo;
        
        //de otra forma podemos solo escribir:
        //return (double) DISTANCIA / (double) velocidad;
    }
    
    //El mÃ©todo compararTiempo nos sirve para comparar el tiempo1 y tiempo2 
    //(notese que no comparas tiempo sino solo dos datos de tipo double
    //este mÃ©todo no retorna nada por lo que solo imprime cÃºal de los dos fue mÃ¡s rÃ¡pido
    public static void compararTiempo(double tiempo1,double tiempo2){
        if(tiempo1<tiempo2)
            System.out.println("El coche má¡s rápido es el primer coche");
        else
            System.out.println("El coche más rápido es el segundo");
        
    }

    //Este mÃ©todo recibe el coche1 y coche2 asÃ­ como la distancia que deben recorrer
    //retorna el Coche ganador C:
    private static Coche compararTiempoDeObjetos(Coche coche1, Coche coche2, int DISTANCIA) {
        //obtenemos el tiempo de coche1 y tiempo de coche2 para lo cual mandamos llamar 
        //el mÃ©todo de calcularTiempo previamente declarado
        double tiempo1 = calcularTiempo(DISTANCIA,coche1.getVelocidad());
        double tiempo2 = calcularTiempo(DISTANCIA,coche2.getVelocidad());
        
        //evaluamos el tiempo1 y tiempo2 y dado el resultado, retornamos el coche1 o coche2 segÃºn corresponda
        if(tiempo1<tiempo2)
            return coche1;
        else
            return coche2;
    }

    
    
}