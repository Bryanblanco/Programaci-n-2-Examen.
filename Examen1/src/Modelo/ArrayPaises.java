/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ArrayPaises {
    
    private ArrayList<Pais> arregloPaises;
   
    
     public ArrayPaises()
    {
        this.arregloPaises = new ArrayList<Pais>();
    }
     
     public String agregarPais(Pais pais) throws PersonaException {

        if (verificarPais(pais.getId())) 
            throw new PersonaException("Ya se registro un pais con esa identificación.", false);
        
        arregloPaises.add(pais);
        return "Se agrego con exito";
    }//Fin del método
     
     public boolean verificarPais(String id) 
     {
        boolean retorna = false;
        if (arregloPaises.size() != 0)
        {
            for (int i = 0; i < arregloPaises.size(); i++) {
                if (arregloPaises.get(i).getId().equalsIgnoreCase(id))
                {
                  retorna = true;
                  break;
                }
            }
        }
        return retorna;
    }//Fin del método
     
     public Pais buscarPais(String id) 
     {
       Pais retorna = null;
        if (arregloPaises.size() != 0) {
            for (Pais pais:arregloPaises) {
                if (pais.getId().equalsIgnoreCase(id))
                {
                    retorna=pais;
                    break;
                }
            }
        }
        return retorna;
    }//Fin del método.


    
}//Fin de la clase 
