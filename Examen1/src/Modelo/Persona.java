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
public class Persona 
{
    private String id;  
    private String procedencia;
    private int diasPermanencia;  


    public String getDatos(int j)
      {   //Para obtener los datos llamo al método y le doy un valo 0-2.
        switch (j) 
        {
            case 0:
                return id;
                
            case 1:
                return procedencia;
                
            case 2: 
                return ""+diasPermanencia;
        }
        return null;
     }

    public Persona(String id, String procedencia, int diasPermanencia) { //Constructor.
        this.id = id;
        this.procedencia = procedencia;
        this.diasPermanencia = diasPermanencia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public int getDiasPermanencia() {
        return diasPermanencia;
    }

    public void setDiasPermanencia(int diasPermanencia) {
        this.diasPermanencia = diasPermanencia;
    }
    
    public String getInformacion()
    {
        return "Identifiación: "+getId()+" Procendencia/Origen: "+getProcedencia()+" Dias de permanencia: "+getDiasPermanencia();
    }
    
    
    
}//Fin de la clase 