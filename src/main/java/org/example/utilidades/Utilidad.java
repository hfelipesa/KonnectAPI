package org.example.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilidad {
     public boolean buscarCoincidencia(String expresionRegular, String cadenataexto ) {
          Pattern patron = Pattern.compile(expresionRegular);
          Matcher coincidencia = patron.matcher(cadenataexto);
          if (coincidencia.matches()) {
               return true;
          } else {
               return false;
          }
     }
}
