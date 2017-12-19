/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose.zapatagom
 */
public class Equipo {
    
    
     enum Equipo1{
	BARÇA("FC Barcelona",1), REAL_MADRID("Real Madrid",2),
	SEVILLA("Sevilla FC",4), VILLAREAL("Villareal",7); 
	
	private String nombreClub;
	private int puestoLiga;
	
	private Equipo1 (String nombreClub, int puestoLiga){
		this.nombreClub = nombreClub;
		this.puestoLiga = puestoLiga;
	}

	public String getNombreClub() {
		return nombreClub;
	}

	public int getPuestoLiga() {
		return puestoLiga;
	}	
	
}
    
    public static void main(String[] args){
    
    
    // Instanciamos el enumerado
Equipo1 villareal = Equipo1.VILLAREAL;
Equipo1 barcelona = Equipo1.BARÇA;
		
// Devuelve un String con el nombre de la constante
System.out.println("villareal.name()= "+villareal.name());
		
// Devuelve el contenido de los atributos
System.out.println("villareal.getNombreClub()= "+villareal.getNombreClub());
System.out.println("villareal.getPuestoLiga()= "+villareal.getPuestoLiga());


//devuelve el contenido de los atributos
System.out.println("Barcelona: " + barcelona.getNombreClub());
System.out.println("Barcelona: " + barcelona.getPuestoLiga());

    
    }
    
    
}
