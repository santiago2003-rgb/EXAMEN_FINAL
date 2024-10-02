package org.example;

import org.example.MODELOS.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);
        Asegurado aseguradoLleno = new Asegurado(1l,"santiago", "mejia", 21, "cr 42# 21 b 68", "3003352594", "santiago@gmail.com", "sura", "2", LocalDate.of(2024, 10, 24), LocalDate.of(2028, 10, 24), 340.000, "casado", 2, "enfermera");
        Asegurado asegurado = new Asegurado();

        System.out.println("\nINGRESE LOS DATOS DEL ASEGURADO");
        System.out.print("Nombre: ");
        asegurado.setNombre(lea.nextLine());

        System.out.print("Apellido: ");
        asegurado.setApellido(lea.nextLine());

        System.out.print("Dirección: ");
        asegurado.setDireccion(lea.nextLine());

        System.out.print("Teléfono: ");
        asegurado.setTelefono(lea.nextLine());

        System.out.print("Email: ");
        asegurado.setEmail(lea.nextLine());

        System.out.print("Tipo de Seguro: ");
        asegurado.setTipoSeguro(lea.nextLine());

        System.out.print("Número de Póliza: ");
        asegurado.setNumeroPoliza(lea.nextLine());

        System.out.print("\nFecha de Inicio: ");
        asegurado.setFechaInicio(LocalDate.now());

        System.out.print("\nFecha de Fin: ");
        asegurado.setFechaFin(LocalDate.now());

        System.out.print("\nEstado Civil: ");
        asegurado.setEstadoCivil(lea.nextLine());

        System.out.print("Ocupación: ");
        asegurado.setOcupacion(lea.nextLine());

        System.out.print("Número de Hijos: ");
        asegurado.setNumeroHijos(lea.nextInt());

        System.out.print("Edad: ");
        asegurado.setEdad(lea.nextInt());

        System.out.print("Monto Asegurado: ");
        asegurado.setMontoAsegurado(lea.nextDouble());

        lea.nextLine();

        System.out.println(asegurado);
        System.out.println(aseguradoLleno.toString());

        //INMUEBLE
        Scanner lea1 = new Scanner(System.in);
        Inmueble inmuebleLleno = new Inmueble(2l, "Cr 42 cll 34", "viviendas", 1200000f, 24.50f, 12, "true", 5, "nuevo", "los mejores en lo que hacesmos");
        Inmueble inmueble = new Inmueble();

        System.out.println("\nDATOS DEL INMUBLE:");
        System.out.print("Dirección: ");
        inmueble.setDireccion(lea1.nextLine());

        System.out.print("Tipo: ");
        inmueble.setTipo(lea1.nextLine());

        System.out.print("Estado (Nuevo/Usado): ");
        inmueble.setEstado(lea1.nextLine());

        System.out.print("Descripción: ");
        inmueble.setDescripcion(lea1.nextLine());

        System.out.print("Antigüedad en años: ");
        inmueble.setAntiguedad(lea.nextInt());

        System.out.print("Número de habitaciones: ");
        inmueble.setHabitaciones(lea1.nextInt());

        System.out.print("Precio: ");
        inmueble.setPrecio(lea1.nextDouble());

        System.out.print("Metros cuadrados: ");
        inmueble.setMetrosCuadrados(lea1.nextDouble());

        System.out.print("¿Tiene garaje? (true/false): ");
        inmueble.setTieneGaraje(lea1.nextBoolean());

        lea.nextLine();

        System.out.println(inmueble);
        System.out.println(inmuebleLleno.toString());

        //BENEFICIARIO
        Scanner lea4 = new Scanner(System.in);
        Beneficiario beneficiarioLleno = new Beneficiario(5l, "heidy", "usuga", 18, "hija", "cr 42", "30222122", "heidy@gmail.com", 28.00f, "bancolombia");
        Beneficiario beneficiario = new Beneficiario();

        System.out.println("\nDATOS DEL BENEFICIARIO");
        System.out.print("Nombre: ");
        beneficiario.setNombre(lea.nextLine());

        System.out.print("Apellido: ");
        beneficiario.setApellido(lea.nextLine());

        System.out.print("Parentesco: ");
        beneficiario.setParentesco(lea.nextLine());

        System.out.print("Dirección: ");
        beneficiario.setDireccion(lea.nextLine());

        System.out.print("Teléfono: ");
        beneficiario.setTelefono(lea.nextLine());

        System.out.print("Email: ");
        beneficiario.setEmail(lea.nextLine());

        System.out.print("Cuenta Bancaria: ");
        beneficiario.setCuentaBancaria(lea.nextLine());

        System.out.print("Edad: ");
        beneficiario.setEdad(lea.nextInt());

        System.out.print("Porcentaje de Beneficio: ");
        beneficiario.setPorcentajeBeneficio(lea.nextDouble());

        lea4.nextLine();

        System.out.println(beneficiario);
        System.out.println(beneficiarioLleno.toString());

        //ASESOR
        Asesor asesorLleno = new Asesor(3l, "sebastian", "garcia", "3225454", "sebas0133@gmail.com", "guarda", 23, "estrella", "siempre", "mejor");
        Asesor asesor = new Asesor();

        System.out.println(asesorLleno);
        System.out.println(asesor);

        //AGENCIA
        Agencia agenciaLlena = new Agencia(4l, "century21", "Calle 24 cr 54 #", "6043254678", "century@gmail.com", 100, 10, "bogota", "inmubles", "centuri.com" );
        Agencia agencia = new Agencia();

        System.out.println(agenciaLlena);
        System.out.println(agencia);
    }
}