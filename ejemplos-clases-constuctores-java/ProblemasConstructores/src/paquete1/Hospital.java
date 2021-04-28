/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Hospital {
    private String nombre;
    private String ciudad;
    private int numeroDoctores;
    private int numeroEnfermeros;
    
    /*
        Crear un constructor que no tenga parámetros
        y que asigne valores ya establecidos a todos 
        los atributos.
    nombre: Isidro Ayora
    ciudad: Loja
    numeroDoctores: 100
    numeroEnfermeros: 200
    
    */
    public Hospital (){
        this.nombre = "Isidro Ayora";
        this.ciudad = "Loja";
        this.numeroDoctores = 100;
        this.numeroEnfermeros = 200;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerCiudad(String n){
        ciudad = n;
    }
    
    public void establecerNumeroDoctores(int n){
        numeroDoctores = n;
    }
    
    public void establecerNumeroEnfermeros(int n){
        numeroEnfermeros = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerCiudad(){
        return ciudad;
    }
    
    public int obtenerNumeroDoctores(){
        return numeroDoctores;
    }
    
    public int obtenerNumeroEnfermeros(){
        return numeroEnfermeros;
    }
    
   public String toString(){
       return "Nombre: " + this.nombre + "\nCiudad: "+this.ciudad + "\nnumero Doctores: "+this.numeroDoctores + "\nnumero enfermos: "+this.numeroEnfermeros;
   }
}
