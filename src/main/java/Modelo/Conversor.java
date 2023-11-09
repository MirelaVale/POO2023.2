package Modelo;

import javax.swing.JOptionPane;

public class Conversor {
    
    
    private double quantReal;
    private double cambioDolar;
    private double cambioEuro;
    private double valor;
    
    public Conversor(){
        
    }
    
    public double converter(double r, String moeda){
         quantReal = r;
         if (moeda == "dolár"){
             
         }
         if (moeda == "euro"){
             
         }
         switch(moeda){
             case "Dolár":
                 valor = quantReal*cambioDolar;
                 break;
             case "Euro":
                 valor = quantReal*cambioEuro;
                 break;
         }
         
        
        
       return valor; 
    }
    
}
