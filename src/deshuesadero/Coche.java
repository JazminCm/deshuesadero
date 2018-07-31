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
public class Coche {
    //Atributos de coche
    private String marca;
    private String tipo;
    private int velocidad;
    
    //constructor de coche sin parametros
    public Coche(){}
    
    //constructor con parametros
    public Coche(String marca, String tipo, int velocidad){
        this.marca=marca;
        this.tipo = tipo;
        this.velocidad = velocidad;
               
    }
    
    //mÃ©todo avanzar que una vez instanciado el objeto podremos hacerlo avanzar n kilometros
    public void avanzar(int n_kilometros){
        System.out.println("el " + this.getMarca() + " avanzÃ³ " + n_kilometros );
    }
    
    //paramos el auto con Ã©ste mÃ©todo
    public void parar(){
        System.out.println("el " + this.getMarca() + " se detuvo");
    }

    //getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    
}