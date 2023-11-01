package org.example;


import org.example.Validaciones.ValidacionAfiliado;
import org.example.entidades.Afiliado;
import org.example.entidades.Examengeneral;
import org.example.entidades.Signovital;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
      /*Afiliado afiliado = new Afiliado();
        afiliado.setId(teclado.nextInt());*/

        ValidacionAfiliado validacionAfiliado=new ValidacionAfiliado();
        validacionAfiliado.trabajarFechas();
    }

}

