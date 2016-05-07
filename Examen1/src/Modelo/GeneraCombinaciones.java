/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Modelo.ArrayPaises;
import Modelo.ArrayPersonas;
import java.util.Random;

/**
 *
 * @author Bryam Blanco B44773
 */
public class GeneraCombinaciones {
    
    private int intercambios = 0;
    
    ArrayPaises arrayPaises = new ArrayPaises();
    ArrayPersonas arrayPersonas = new ArrayPersonas();
    
    Random r=new Random();
   
          
     //La idea de este método es que pueda generar dos valores aleatorios(los cuales se usarán para recorrer ambos Arrays.
     //Deben ser inferiores al Array.length y cuando encuentre este indice se extraerán los atributos que contenga en ambos
     //En el caso del Array Personas el id y en el caso del país el nombre. Posteiormente, cada vez que se se efectue este
    //método y la capacidad del país sea mayor a cero la variable intercambios aumentará. Al final se imprimen el último 
    //intercambio y la cantidad de intercambios.
    
          public String Combinar()            
          {
              int cantidadPaises = arrayPaises.size();
              int numeroAleatorio = r.nextInt(cantidadPaises-1);
              int cantidadPersonas = arrayPersonas.size();
              int numeroAleatorio2 = r.nextInt(cantidadPersonas-1);
             
          for(int i=0; i<numeroAleatorio; i++)
          {
              for(int j=0; j<numeroAleatorio2; j++)
              {
                  if(arrayPaises(i).getCapacidad()>=0)
                  {
                      intercambios++;
                  }
              }
              
          }
             
          return "País: "+arrayPaises(i).getNombre+"\nPersona id:"+arrayPersonas(j).getId()+"\n"+intercambios;
        }//Fin de combinar.
  
    
}//Fin de la clase.
