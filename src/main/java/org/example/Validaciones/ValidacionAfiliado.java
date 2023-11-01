package org.example.Validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Utilidad;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidacionAfiliado  {

    Utilidad utilidad=new Utilidad();// inyeccion de dependecia

    public ValidacionAfiliado() {
    }


    public boolean validarId(Integer idAfiliado) throws  Exception{
        if(idAfiliado<0){
            throw  new Exception(Mensajes.ID_NEGATIVO.getMensajes());
        }
        return true; // PASO DE VALIDACIONES
    }


    public boolean validarNombre(String nombreAfiliado)throws  Exception {
        //logintud sea menor de 3 y o mayor de 40
        if (nombreAfiliado.length() < 3 || nombreAfiliado.length() > 40) {
            throw new Exception(Mensajes.NOMBRES_LONGITUD.getMensajes());
        }
        //formato del nombre tiene o caracteres especiales
        String expresionRegular = "^[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular, nombreAfiliado)) {
            throw new Exception(Mensajes.NOMBRE_FORMATO.getMensajes());
        }
        return true;
    }
    public boolean validarApellidos(String apellidosAfilidado)throws Exception {
            if(apellidosAfilidado.length()<10 || apellidosAfilidado.length()>40) {
                throw  new Exception(Mensajes.APELLIDO_LONGITUD.getMensajes());
            }
        String expresionRegular = "^[a-zA-Z ]+$";
            if (!this.utilidad.buscarCoincidencia(expresionRegular,apellidosAfilidado)){
                throw new Exception(Mensajes.APELLIDO_FORMATO.getMensajes());
            }
            return true;
    }
    public boolean validarDocuemento(String documentoAfiliado)throws Exception {
        if (documentoAfiliado.length() < 7 || documentoAfiliado.length() > 10) {
            throw new Exception(Mensajes.DOCUMENTO_LOGITUD.getMensajes());
        }
        String expresionRegular = "^[0-9]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular, documentoAfiliado)) {
            throw new Exception(Mensajes.DOCUMENTO_FORMATO.getMensajes());
        }
        return true;
    }

    public Boolean validarCiudad(Integer ciudadAfiliado)throws Exception {
        if (ciudadAfiliado<0 || ciudadAfiliado>1123){
            throw new Exception(Mensajes.CIUDAD_FORMATO.getMensajes());
        }
        return true;

    }

    public Boolean validarDepartamento(Integer departamentoAfiliado)throws Exception {
        if (departamentoAfiliado<0 || departamentoAfiliado>32){
            throw new Exception(Mensajes.DEPARTAMENTO_FORMATO.getMensajes());
        }
        return true;

    }
    public boolean validarCorreoElectronico(String correoEletronico)throws Exception {
        String expresionRegular = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@";
        if (!this.utilidad.buscarCoincidencia(expresionRegular, correoEletronico)) {
            throw new Exception(Mensajes.FORMATO_CORREO.getMensajes());
        }
        return true;
    }
    public boolean validarTelefonoAfiliado(String telefonoAfiliado)throws Exception {
        if (telefonoAfiliado.length() !=10) {
            throw new Exception(Mensajes.LONGITUD_TELEFONO.getMensajes());
        }
        String expresionRegular = "^[0-9]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,telefonoAfiliado)) {
            throw new Exception(Mensajes.FORMATO_TELEFONO.getMensajes());
        }
        return true;
    }

    public void trabajarFechas(){
        //fecha mas simple
        LocalDate fechaDelSistema=LocalDate.now();
        System.out.println(fechaDelSistema);

        //configurar manuelamente una fecha.
        LocalDate fechaNacimiento=LocalDate.of(1987,11,12);
        System.out.println(fechaNacimiento);

        //Diferencia entre dos fechas

        Long diferenciaFechas= ChronoUnit.MONTHS.between(fechaNacimiento,fechaDelSistema);
    }
}




