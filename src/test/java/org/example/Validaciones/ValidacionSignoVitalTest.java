package org.example.Validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidacionSignoVitalTest {
    private ValidacionSignoVital validacionSignoVital;
    @BeforeEach
    public void prepararPruebasSignoVital(){
        this.validacionSignoVital=new ValidacionSignoVital();
    }// cada vez que se arranca la prueba se iniciar en null

    @Test
    public void validarIdCorrecto(){
        //preparar,ejecutar,verificar
        Integer idSignoVital=50;
        //ejecutarlo
        boolean resultado= Assertions.assertDoesNotThrow(()->this.validacionSignoVital.validarIdSigno(idSignoVital));
        // verifar
        Assertions.assertTrue(resultado);

    }
    @Test
    public void validarIdIncorrecto(){
        Integer idSignoVital=-50;
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionSignoVital.validarIdSigno(idSignoVital));
        Assertions.assertEquals(Mensajes.ID_NEGATIVO.getMensajes(),resultado.getMessage());
    }

    @Test
    public void validarNombreCorrecto(){
        String nombreExamen="Examen general";
        boolean resultadoNombreExamen=Assertions.assertDoesNotThrow(()->this.validacionSignoVital.validarExamen(nombreExamen));
        Assertions.assertTrue(resultadoNombreExamen);
    }
    @Test
    public void  validarNombreIncorrecto(){
        String nombreExamen="Examen1general";
        Exception resutadoNombreExamen=Assertions.assertThrows(Exception.class,()->this.validacionSignoVital.validarExamen(nombreExamen));
        Assertions.assertEquals(Mensajes.FORMATO_NOMBRESIGNOVITAL.getMensajes(),resutadoNombreExamen.getMessage());
    }
    @Test
    public  void validarLongitudNombreExamen(){
        String nombreExamen="exam";
        Exception resultadoNombreExamen=Assertions.assertThrows(Exception.class,()->this.validacionSignoVital.validarExamen(nombreExamen));
        Assertions.assertEquals(Mensajes.LONGITUD_NOMBRESIGNOVITAL.getMensajes(),resultadoNombreExamen.getMessage());
    }
    @Test
    public void validarMedidadCorrecto(){
        Integer UnidadMedida=30;
        boolean resultadoUnidadMedida=Assertions.assertDoesNotThrow(()->this.validacionSignoVital.validacionUnidadMedida(UnidadMedida));
        Assertions.assertTrue(resultadoUnidadMedida);
    }
    @Test
    public void validarMedidaIncorrecta(){
        Integer unidadMedida=-4;
        Exception resultadoMedida=Assertions.assertThrows(Exception.class,()->this.validacionSignoVital.validacionUnidadMedida(unidadMedida));
        Assertions.assertEquals(Mensajes.FORMATO_UNIDADMEDIDA.getMensajes(),resultadoMedida.getMessage());
    }
    @Test
    public void validarMedidaMaxCorrecto(){
        Integer UnidadMedidaMax=20;
        boolean resultadoUnidadMedidaMax=Assertions.assertDoesNotThrow(()->this.validacionSignoVital.validacionUnidadMedida(UnidadMedidaMax));
        Assertions.assertTrue(resultadoUnidadMedidaMax);
    }
    @Test
    public void validarMedidaMaxIncorrecta(){
        Double unidadMedidaMax=-4.0;
        Exception resultadoMedidaMax=Assertions.assertThrows(Exception.class,()->this.validacionSignoVital.validacionMaximoNormal(unidadMedidaMax));
        Assertions.assertEquals(Mensajes.FORMATO_UNIDADMEDIDA.getMensajes(),resultadoMedidaMax.getMessage());
    }
    @Test
    public void validarMedidaMinCorrecto(){
        Double UnidadMedidaMin=2.0;
        boolean resultadoUnidadMedidaMin=Assertions.assertDoesNotThrow(()->this.validacionSignoVital.validacionMinimoNormal(UnidadMedidaMin));
        Assertions.assertTrue(resultadoUnidadMedidaMin);
    }
    @Test
    public void validarMedidaMinIncorrecta(){
        Double unidadMedidaMin=-4.0;
        Exception resultadoMedidaMin=Assertions.assertThrows(Exception.class,()->this.validacionSignoVital.validacionMinimoNormal(unidadMedidaMin));
        Assertions.assertEquals(Mensajes.FORMATO_UNIDADMEDIDA.getMensajes(),resultadoMedidaMin.getMessage());
    }

}

