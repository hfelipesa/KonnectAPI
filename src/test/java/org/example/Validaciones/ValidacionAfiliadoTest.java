package org.example.Validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidacionAfiliadoTest {
    //Debo instaciar clase del objeto que voy a crear
    private ValidacionAfiliado validacionAfiliado;
    @BeforeEach //establecer condicones iniciales de cada prueba
       public void prepararPruebas(){
        this.validacionAfiliado=new ValidacionAfiliado();// cada vez que se arranca la prueba se iniciar en null
    }

    @Test
    public void validarIdCorrecto(){
        //preparar,ejecutar,verificar
        Integer idPrueba=50;
        //ejecutarlo
        boolean resultado= Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarId(idPrueba));
        // verifar
        Assertions.assertTrue(resultado);

    }
    @Test
    public void validarIdIncorrecto(){
        Integer idPrueba=-50;
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarId(idPrueba));
        Assertions.assertEquals(Mensajes.ID_NEGATIVO.getMensajes(),resultado.getMessage());
    }

    @Test
    public  void validarNombreCorrecto(){
        String nombreAfiliado="Hector Felipe";
        Boolean resultadoNombre= Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarNombre(nombreAfiliado));
        Assertions.assertTrue(resultadoNombre);
    }
    @Test
    public void validarNombreIncorrecto(){
        String nombreAfiliado="1222323@,;-()";
        Exception resultadoNombre=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarNombre(nombreAfiliado));
        Assertions.assertEquals(Mensajes.NOMBRE_FORMATO.getMensajes(),resultadoNombre.getMessage());

    }
    @Test
    public void validarNombreIncorrectoLongitud(){
        String nombreAfiliado="fe";
        Exception resultadoLongitud=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarNombre(nombreAfiliado));
        Assertions.assertEquals(Mensajes.NOMBRES_LONGITUD.getMensajes(),resultadoLongitud.getMessage());
    }
    @Test
    public  void validarApellidoCorrecto(){
        String apellidoAfiliado="Sanchez Arango";
        Boolean resultadoApellido= Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarApellidos(apellidoAfiliado));
        Assertions.assertTrue(resultadoApellido);
    }
    @Test
    public void validarApellidoIncorrecto(){
        String apellidoAfiliado="1222323@,;-()";
        Exception resultadoApellido=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarApellidos(apellidoAfiliado));
        Assertions.assertEquals(Mensajes.APELLIDO_FORMATO.getMensajes(),resultadoApellido.getMessage());

    }
    @Test
    public void validarApellidoIncorrectoLongitud(){
        String longitudApellido="sa";
        Exception resultadoLongitud=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarApellidos(longitudApellido));
        Assertions.assertEquals(Mensajes.APELLIDO_LONGITUD.getMensajes(),resultadoLongitud.getMessage());
    }

    @Test
    public  void validarDocumentoCorrecto(){
        String documentoAfiliado="12345678";
        Boolean resultadoDocumento= Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarDocuemento(documentoAfiliado));
        Assertions.assertTrue(resultadoDocumento);
    }
    @Test
    public void validarDocumentoIncorrecto(){
        String documentoAfiliado="felipe1223";
        Exception resultadoApellido=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarDocuemento(documentoAfiliado));
        Assertions.assertEquals(Mensajes.DOCUMENTO_FORMATO.getMensajes(),resultadoApellido.getMessage());

    }
    @Test
    public void validarDocumentoIncorrectoLongitud(){
        String longitudDocumento="sa";
        Exception resultadoLongitud=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarDocuemento(longitudDocumento));
        Assertions.assertEquals(Mensajes.DOCUMENTO_LOGITUD.getMensajes(),resultadoLongitud.getMessage());
    }
    @Test
    public void ciudadAfiliadoCorrecto(){
        Integer ciudadAfiliado=2;
        boolean resultadoCiudad= Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarCiudad(ciudadAfiliado));
        Assertions.assertTrue(resultadoCiudad);
    }
    @Test
    public void validarCiudadIncorrecto() {
        Integer ciudadAfiliado = -1;
        Exception resultadoCiudad = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarCiudad(ciudadAfiliado));
        Assertions.assertEquals(Mensajes.CIUDAD_FORMATO.getMensajes(), resultadoCiudad.getMessage());
    }
    @Test
    public void departamentoAfiliadoCorrecto(){
        Integer departamentoAfiliado=22;
        boolean resultadoDepartamento= Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarCiudad(departamentoAfiliado));
        Assertions.assertTrue(resultadoDepartamento);
    }
    @Test
    public void departamentoIncorrecto() {
        Integer departamentoAfiliado = -1;
        Exception resultadoDepartamento = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarDepartamento(departamentoAfiliado));
        Assertions.assertEquals(Mensajes.DEPARTAMENTO_FORMATO.getMensajes(), resultadoDepartamento.getMessage());
    }

    @Test
    public  void validarCorreoCorrecto(){
        String correoAfiliado="hfelipesa@";
        boolean resultadoCorreo=Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarCorreoElectronico(correoAfiliado));
        Assertions.assertTrue(resultadoCorreo);
    }
    @Test
    public void validarCorrectoIncorrecto(){
        String correoAfiliado="hfelipe";
        Exception resultadoCorreo=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarCorreoElectronico(correoAfiliado));
        Assertions.assertEquals(Mensajes.FORMATO_CORREO.getMensajes(),resultadoCorreo.getMessage());
    }

    @Test
    public  void validarTelefonoCorreto(){
        String telefonoAfiliado="3212675709";
        Boolean resultadoTelefono= Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarTelefonoAfiliado(telefonoAfiliado));
        Assertions.assertTrue(resultadoTelefono);
    }
    @Test
    public void validarTelefonoIncorrecto(){
        String telefonoAfiliado="!dddff2233";
        Exception resultadoTelefono=Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarTelefonoAfiliado(telefonoAfiliado));
        Assertions.assertEquals(Mensajes.FORMATO_TELEFONO.getMensajes(),resultadoTelefono.getMessage());

    }
    @Test
    public void validarTelefonoIncorrectoLongitud() {
        String telefonoAfiliado = "fe";
        Exception resultadoLongitud = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarTelefonoAfiliado(telefonoAfiliado));
        Assertions.assertEquals(Mensajes.LONGITUD_TELEFONO.getMensajes(), resultadoLongitud.getMessage());
    }

}