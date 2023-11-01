package org.example.Validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Utilidad;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidacionExamen {
    Utilidad utilidad=new Utilidad();

    public ValidacionExamen() {
    }

    public boolean validarIdExamen(Integer validarIdExamen)throws Exception{
        if (validarIdExamen<0){
            throw new Exception(Mensajes.ID_NEGATIVO.getMensajes());
        }
        return true;
    }

    public boolean validarNombreExamen(String validarNombreExamen)throws Exception{
        if (validarNombreExamen.length()<10 || validarNombreExamen.length()>100){
            throw new Exception(Mensajes.LONGITUD_NOMBRESIGNOVITAL.getMensajes());
        }
        String expresionRegular="^[a-zA-Z ]+$";
        if(!utilidad.buscarCoincidencia(expresionRegular,validarNombreExamen)){
            throw new Exception(Mensajes.FORMATO_NOMBRESIGNOVITAL.getMensajes());
        }
        return true;
    }

    public boolean validarDiagnostico(String validarDiagnostico)throws Exception{
        if (validarDiagnostico.length()<10 || validarDiagnostico.length()>1000){
            throw new Exception(Mensajes.LONGITUD_DIAGNOSTICO.getMensajes());
        }
        String expresionRegular= "^[a-zA-Z ]+$";
        if (!utilidad.buscarCoincidencia(expresionRegular,validarDiagnostico)){
            throw new Exception(Mensajes.FORMATO_DIAGNOSTICO.getMensajes());
        }
        return true;
    }

    public boolean validarImagen(String validarImagen)throws Exception{
        if (validarImagen.length()<5 || validarImagen.length()>200){
            throw new Exception(Mensajes.LOGITUD_IMAGEN.getMensajes());
        }
        String expresionRegular="^[a-zA-Z ]+$";
        if (!utilidad.buscarCoincidencia(expresionRegular,validarImagen)){
            throw new Exception(Mensajes.FORMARTO_IMAGEN.getMensajes());
        }
        return true;
    }
}
