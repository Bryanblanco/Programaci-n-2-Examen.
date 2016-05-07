/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Bryam Blanco B44773
 */
public class ArrayPersonas {
    
    private ArrayList<Persona> arregloPersonas;
    
    
    public ArrayPersonas()
    {
        this.arregloPersonas = new ArrayList<Persona>();
    }
    
     public String agregarPersona(Persona persona) throws PersonaException {

        if (verificarPersona(persona.getId())) 
            throw new PersonaException("Ya se registró alguien con esa identificación.", false);
        
        arregloPersonas.add(persona);
        return "Se agrego con exito";
    }//Fin del método
     
     public boolean verificarPersona(String id) 
     {
        boolean retorna = false;
        if (arregloPersonas.size() != 0) {
            for (int i = 0; i < arregloPersonas.size(); i++) {
                if (arregloPersonas.get(i).getId().equalsIgnoreCase(id))
                {
                  retorna = true;
                  break;
                }
            }
        }
        return retorna;
    }//Fin del método
     
     public Persona buscarPersona(String id) 
     {
       Persona retorna = null;
        if (arregloPersonas.size() != 0) {
            for (Persona persona:arregloPersonas) {
                if (persona.getId().equalsIgnoreCase(id))
                {
                    retorna=persona;
                    break;
                }
            }

        }
        return retorna;
    }
    
     
   
    
    
    
}//Fin de la clase
