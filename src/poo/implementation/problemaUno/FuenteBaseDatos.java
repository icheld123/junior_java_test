package poo.implementation.problemaUno;

import poo.interfaces.problemaUno.FuenteDatos;
import poo.model.Documento;

import java.util.List;

/**
 * Implementación de la interfaz {@link FuenteDatos} que simula la obtención de documentos
 * desde una base de datos.
 *
 * Esta clase representa una fuente de datos ficticia que retorna una lista de objetos
 * {@link Documento} con contenido simulado, como si provinieran de consultas en una base de datos.
 *
 * Forma parte del ejercicio 2 de la prueba técnica.
 *
 * Ejemplo de documentos simulados:
 * <ul>
 *   <li>Registro de Ventas</li>
 *   <li>Clientes 2024</li>
 * </ul>
 *
 * @author Ichel Delgado
 */
public class FuenteBaseDatos implements FuenteDatos {

    /**
     * Simula la obtención de documentos desde una base de datos.
     *
     * @return Lista de documentos con información simulada de origen en base de datos.
     */
    @Override
    public List<Documento> obtenerDocumentos() {
        System.out.println("\nObteniendo documentos desde la base de datos...");
        return List.of(
                new Documento("Registro de Ventas", "Histórico de ventas realizadas...", "BD_Ventas"),
                new Documento("Clientes 2024", "Histórico de clientes registrados en el año...", "BD_Clientes")
        );
    }
}