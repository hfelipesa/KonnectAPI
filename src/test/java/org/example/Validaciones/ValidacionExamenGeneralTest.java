package org.example.Validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidacionExamenGeneralTest {
    private ValidacionExamen validacionExamenGeneral;
    @BeforeEach
    public void testExamenGeneral(){
        this.validacionExamenGeneral=new ValidacionExamen();
    }
    @Test
    public void validarIdCorrecto(){
        Integer idExamenGeneral=1;
        boolean resultadoId= Assertions.assertDoesNotThrow(()->this.validacionExamenGeneral.validarIdExamen(idExamenGeneral));
        Assertions.assertTrue(resultadoId);
    }
    @Test
    public void validarIdIncorrecto(){
        Integer idExamenGeneral=-1;
        Exception resultadoId=Assertions.assertThrows(Exception.class,()->this.validacionExamenGeneral.validarIdExamen(idExamenGeneral));
        Assertions.assertEquals(Mensajes.ID_NEGATIVO.getMensajes(),resultadoId.getMessage());
    }

    @Test
    public void validarNombreCorrecto(){
        String nombreExamen="Examen Sangre";
        boolean resultadoNombreExamen=Assertions.assertDoesNotThrow(()->this.validacionExamenGeneral.validarNombreExamen(nombreExamen));
        Assertions.assertTrue(resultadoNombreExamen);
    }
    @Test
    public void validarNombreIncorrecto(){
        String nombreExamen="Examen1234";
        Exception resultadoNombre=Assertions.assertThrows(Exception.class,()->this.validacionExamenGeneral.validarNombreExamen(nombreExamen));
        Assertions.assertEquals(Mensajes.FORMATO_NOMBRESIGNOVITAL.getMensajes(),resultadoNombre.getMessage());
    }
    @Test
    public void validarLongitudNombre(){
        String nombreExamen="Exmen";
        Exception resultadoNombre=Assertions.assertThrows(Exception.class,()->this.validacionExamenGeneral.validarNombreExamen(nombreExamen));
        Assertions.assertEquals(Mensajes.LONGITUD_NOMBRESIGNOVITAL.getMensajes(),resultadoNombre.getMessage());
    }


    @Test
    public void validarDiagnosticoCorrecto(){
        String diagnosticoExamen="Diagnostico Examen Sangre";
        boolean resultadoDiagnosticoExamen=Assertions.assertDoesNotThrow(()->this.validacionExamenGeneral.validarDiagnostico(diagnosticoExamen));
        Assertions.assertTrue(resultadoDiagnosticoExamen);
    }
    @Test
    public void validarDiagnosticoIncorrecto(){
        String diagnosticoExamen="Diagnostico123";
        Exception resultadoDiagnostico=Assertions.assertThrows(Exception.class,()->this.validacionExamenGeneral.validarDiagnostico(diagnosticoExamen));
        Assertions.assertEquals(Mensajes.FORMATO_DIAGNOSTICO.getMensajes(),resultadoDiagnostico.getMessage());
    }
    @Test
    public void validarLongitudDiagnostico(){
        String diagnosticoExamen="error";
        Exception resultadoDiagnostico=Assertions.assertThrows(Exception.class,()->this.validacionExamenGeneral.validarDiagnostico(diagnosticoExamen));
        Assertions.assertEquals(Mensajes.LONGITUD_DIAGNOSTICO.getMensajes(),resultadoDiagnostico.getMessage());
    }


    @Test
    public void validarImagenCorrecto(){
        String imagenExamen="Imagen Examen General";
        boolean resultadoImagenExamen=Assertions.assertDoesNotThrow(()->this.validacionExamenGeneral.validarImagen(imagenExamen));
        Assertions.assertTrue(resultadoImagenExamen);
    }
    @Test
    public void validarImagenIncorrecto(){
        String imagenExamen="Img123";
        Exception resultadoImagen=Assertions.assertThrows(Exception.class,()->this.validacionExamenGeneral.validarImagen(imagenExamen));
        Assertions.assertEquals(Mensajes.FORMARTO_IMAGEN.getMensajes(),resultadoImagen.getMessage());
    }
    @Test
    public void validarLongitudImagen(){
        String imagenExamen="IM";
        Exception resultadoImagen=Assertions.assertThrows(Exception.class,()->this.validacionExamenGeneral.validarImagen(imagenExamen));
        Assertions.assertEquals(Mensajes.LOGITUD_IMAGEN.getMensajes(),resultadoImagen.getMessage());
    }

}
