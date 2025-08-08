package poo.implementation.problemaUno;

import poo.interfaces.problemaUno.FuenteDatos;
import poo.model.Documento;

import java.util.List;

/**
 * Implementación de la interfaz {@link FuenteDatos} que simula la obtención de documentos
 * desde archivos almacenados en el sistema local.
 *
 * Esta clase representa una fuente de datos ficticia, donde se crean instancias
 * de {@link Documento} con contenido simulado al momento de llamarse el método.
 *
 * Forma parte del ejercicio 2 de la prueba técnica.
 *
 * Ejemplo de documentos simulados:
 * <ul>
 *   <li>Informe Ventas 2024</li>
 *   <li>Políticas de Privacidad</li>
 *   <li>Manual de Usuario</li>
 * </ul>
 *
 * @author Ichel Delgado
 */
public class FuenteArchivo implements FuenteDatos {


    /**
     * Simula la obtención de documentos desde archivos locales.
     *
     * @return Lista de documentos simulados con título, contenido y fuente de archivo.
     */
    @Override
    public List<Documento> obtenerDocumentos() {
        System.out.println("\nObteniendo documentos desde archivos locales...");
        return List.of(
                new Documento("Informe Ventas 2024", "Contenido del informe de ventas...", "archivos/ventas_2024.txt"),
                new Documento("Políticas de Privacidad", "Texto de políticas...", "archivos/politicas_privacidad.pdf"),
                new Documento("Manual de Usuario", "Instrucciones para el usuario...", "archivos/manual_usuario.docx")
        );
    }

}
