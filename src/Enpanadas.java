/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose.zapatagom
 */
public class Enpanadas {
    
    
    enum Provincia {SALTA,TUCUMAN,CATAMARCA,JUJUY};
    
    
    public static int promocionlocal(Provincia provincia, int salteñas,int tucumanas){
    
       int provincianumero=0;
       int cajasalta;
       int cajatucuman;
       int result;
       
        
       switch( provincianumero ) {
        case 1:
            provincia=Provincia.SALTA;
            
            cajasalta=salteñas/4;//10 enpanadas=2
            cajatucuman=tucumanas/2;//2 empandas=1
            
        case 2:
             provincia=Provincia.TUCUMAN;
            
            cajatucuman=salteñas/4;//10 enpanadas=2
            cajasalta=tucumanas/2;//2 empandas=1
            
        default: 
            cajatucuman=salteñas/3;//10 enpanadas=2
            cajasalta=tucumanas/3;//2 empandas=1
            
        break;
       }
         
      if(cajasalta<cajatucuman){
      
      result=cajasalta;
      }
      else{
      
          result=cajatucuman;
      
         }
      return result;
 
        }
        
        
    
    
    
    
    
    public static void main (String[] args){
    
    
   
    
        System.out.println(promocionlocal(Provincia.SALTA,10,13));
    
    
    
    }
    
    
}
