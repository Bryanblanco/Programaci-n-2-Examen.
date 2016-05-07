/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author User
 */
public class ControladorPais {
    
     private final static String validarId = "[P]\\d{2}";
             
    public boolean validaId(String id)
    {
        Pattern pat = Pattern.compile(validarId, Pattern.CASE_INSENSITIVE);
        Matcher mat = pat.matcher(validarId);
        return mat.find();
    }
    
}
