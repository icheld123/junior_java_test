package poo.implementation.problemaDos;

import poo.interfaces.problemaDos.Salida;
import poo.model.Documento;

import java.util.List;

/**
 * Implementación de la interfaz {@link Salida} que simula la salida de documentos en un formato de tipo "Dashboard".
 *
 * Esta clase presenta una vista resumida de los documentos obtenidos, mostrando el total y listando
 * cada documento con su título y fuente de origen.
 *
 * Forma parte del ejercicio 2 de la prueba técnica.
 *
 * Ejemplo de salida:
 * <pre>
 * === Dashboard de Documentos ===
 * Total documentos: 3
 * -------------------------------
 * > Informe_A            | > Archivo
 * > Noticia X            | > Web
 * </pre>
 *
 * @author Ichel Delgado
 */
public class SalidaDashboard implements Salida {
    /**
     * Muestra los documentos simulando una presentación tipo dashboard.
     *
     * @param documentos Lista de documentos a mostrar.
     */
    @Override
    public void mostrar(List<Documento> documentos) {
        System.out.println("\n=== Dashboard de Documentos ===");
        System.out.println("Total documentos: " + documentos.size());
        System.out.println("-------------------------------");
        documentos.forEach(doc ->
                System.out.printf("> %-20s | > %-30s%n",
                        doc.getTitulo(), doc.getFuenteOrigen()));
    }
}
