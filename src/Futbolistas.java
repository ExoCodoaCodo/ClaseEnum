/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose.zapatagom
 */

/*METODOS QUE SE USAN REGULARMENTE
Demarcacion delantero = Demarcacion.DELANTERO;    // Instancia de un enum de la clase Demarcación
delantero.name();    // Devuelve un String con el nombre de la constante (DELANTERO)
delantero.toString();    // Devuelve un String con el nombre de la constante (DELANTERO)
delantero.ordinal();    // Devuelve un entero con la posición del enum según está declarada (3).
delantero.compareTo(Enum otro);    // Compara el enum con el parámetro según el orden en el que están declarados lo enum
Demarcacion.values();    // Devuelve un array que contiene todos los enum
*/

public class Futbolistas {
    
    
    enum Demarcacion{PORTERO, DEFENSA,CENROCAMPISTA, DELANTERO  }
    
    
   public static void main(String[] args){
       
       
       Demarcacion delantero=Demarcacion.DELANTERO;
       Demarcacion defensa = Demarcacion.DEFENSA;
   
       //devuelve un String con el nombre de la constante
       System.out.println("delantero.name(): "+ delantero.name());
       System.out.println("defensa.toString(): "+ defensa.toString());
       
       //devuelve un entero de la posicion 
       System.out.println("delantero.ordinal(): "+ delantero.ordinal());
       
       // Compara el enum con el parámetro según el orden en el que están declaradas las constantes. 
        System.out.println("delantero.compareTo(portero)= "+delantero.compareTo(defensa));
        System.out.println("delantero.compareTo(delantero)= "+delantero.compareTo(delantero));
   
        for(Demarcacion d: Demarcacion.values()){
	System.out.println(d.toString()+" - ");
        }
   
   }
    
    
}
