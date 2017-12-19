/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose.zapatagom
 */

import java.util.Scanner;

public class Uso_tallas {
    
    
    //enum Talla {MINI, MEDIANO,GRANDE,MUYGRANDE};
    
    
    enum Talla{MINI("S");
   
    private Talla(String abreviatura){
    
    this.abreviatura=abreviatura;
    
  
    }
    private String abreviatura;
    
    public String dameabreviatura(){
    
    return abreviatura;
    }
    
    }
    
    
    
    public static void main(String[] args){
    
    /*
    Talla s = Talla.MINI;
    Talla m = Talla.MEDIANO;
    Talla l = Talla.GRANDE;
    Talla xl=Talla.MUYGRANDE;
    */
    
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("escribe una talla: MINI,MEDIANO,GRANDE,MUYGRANDE");
        String entradadatos = entrada.next().toUpperCase();
        
        Talla la_talla = Enum.valueOf(Talla.class, entradadatos);
        
        System.out.println("Talla: "+ la_talla);
        
        System.out.println("Abreviatura: "+la_talla.dameabreviatura());
    
        
        
    }
    
    
    
}
