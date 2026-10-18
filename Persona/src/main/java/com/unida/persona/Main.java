package com.unida.persona;

class Persona {
    private String nombre; 
    private int edad; 
    
   
    public void setNombre(String nombre){
        this.nombre = nombre; 
    }
    
    
    public String getNombre(){
        return nombre; 
    }
    
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
   
    public int getEdad(){
        return edad; 
    }
}

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        
  
        persona.setNombre("Derlis el mejor profe Caballero");
        persona.setEdad(15);
        
       
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}
