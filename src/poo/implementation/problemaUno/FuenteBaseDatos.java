package poo.implementation.problemaUno;

import poo.interfaces.problemaUno.FuenteDatos;
import poo.model.Documento;

import java.util.List;

/**
 * Implementación de FuenteDatos que simula obtener documentos desde una base de datos.
 */
public class FuenteBaseDatos implements FuenteDatos {

    @Override
    public List<Documento> obtenerDocumentos() {
        System.out.println("\nObteniendo documentos desde la base de datos...");
        return List.of(
                new Documento("Registro de Ventas", "Histórico de ventas realizadas...", "BD_Ventas"),
                new Documento("Clientes 2024", "Histórico de clientes registrados en el año...", "BD_Clientes")
        );
    }
}