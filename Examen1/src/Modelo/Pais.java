/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Pais {
    
    private String id;
    private String nombre;
    private int capacidad;
    private int cuotaRefugiados;
    
    
    public String getDatos(int i)
      {   //Para obtener los datos llamo al método y le doy un valo 0-2.
        switch (i) 
        {
            case 0:
                return nombre;
                
            case 1:
                return ""+capacidad;
                
            case 2: 
                return ""+cuotaRefugiados;
        }
        return null;
     }
    
    public void reducirCapacidad()
    {
        if(capacidad ==0)
        {
            JOptionPane.showMessageDialog(null, "No se permitira que ingrese nadie mas al pais.");
        }
        else
        capacidad --;
    }
    
    public void reducirCuotaRefugiados()
    {
       if(capacidad ==0)
        {
            JOptionPane.showMessageDialog(null, "No se permitira que ingrese nadie mas al pais.");
        }
       else
        if(cuotaRefugiados ==0)
        {
            JOptionPane.showMessageDialog(null, "No se permitira que ingrese nadie mas al pais.");
        }
       else
        capacidad --;
        cuotaRefugiados --;
    }
    

    public Pais(String id, String nombre, int capacidad, int cuotaRefugiados) { //Constructor
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.cuotaRefugiados = cuotaRefugiados;
    }

    public String getId(){
        return id;
    }
    
    public void setId(String id)
    {
        this.id= id;
    }
            
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCuotaRefugiados() {
        return cuotaRefugiados;
    }

    public void setCuotaRefugiados(int cuotaRefugiados) {
        this.cuotaRefugiados = cuotaRefugiados;
    }
    
    public String getInformacion()
    {
        return " ID: "+getId()+" Nombre: "+getNombre()+" Capacidad: "+getCapacidad()+" Couta maxima de rfugiados: "+getCuotaRefugiados();
    }
    
    
}//Fin de la clase
