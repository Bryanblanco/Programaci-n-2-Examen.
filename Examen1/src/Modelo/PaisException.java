/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author User
 */
public class PaisException extends Exception
{
    private boolean limpiarInterfaz;

    public PaisException(String message, boolean limpiarInterfaz) 
    {
        super(message);
        this.limpiarInterfaz = limpiarInterfaz;
    }

    public boolean isLimpiarInterfaz() 
    {
        return limpiarInterfaz;
    }
    
}//Fin de la clase

