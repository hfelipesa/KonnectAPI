package org.example.Validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Utilidad;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidacionSignoVital {
    Utilidad utlidad=new Utilidad();

    public ValidacionSignoVital() {
    }

    public boolean validarIdSigno(Integer idSignoVital)throws Exception {
        if(idSignoVital<0){
            throw new Exception(Mensajes.ID_NEGATIVO.getMensajes());
        }
        return true;
    }
    public boolean validarExamen(String validarExamen)throws Exception {
        if (validarExamen.length()<10 || validarExamen.length()>100){
            throw new Exception(Mensajes.LONGITUD_NOMBRESIGNOVITAL.getMensajes());
        }
        String expresionRegular= "^[a-zA-Z ]+$";
        if(!this.utlidad.buscarCoincidencia(expresionRegular,validarExamen)){
            throw new Exception(Mensajes.FORMATO_NOMBRESIGNOVITAL.getMensajes());
        }
        return true;
    }
    public boolean validacionUnidadMedida(Integer validarMedida)throws Exception{
        if (validarMedida<0){
            throw new Exception(Mensajes.FORMATO_UNIDADMEDIDA.getMensajes());
        }
        return true;
    }
    public boolean validacionMaximoNormal(Double validarMaximoNormal)throws Exception{
        if(validarMaximoNormal<0){
            throw new Exception(Mensajes.FORMATO_UNIDADMEDIDA.getMensajes());
        }
        return true;
    }

    public boolean validacionMinimoNormal(Double validarMinimoNormal)throws Exception{
        if (validarMinimoNormal<0){
            throw new Exception(Mensajes.FORMATO_UNIDADMEDIDA.getMensajes());
        }
        return true;
    }
}
