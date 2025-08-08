package poo.implementation.problemaDos;

import poo.interfaces.problemaDos.Salida;
import poo.model.Documento;

import java.util.List;

/**
 * Implementación de la interfaz {@link Salida} que simula una salida en una interfaz de usuario.
 *
 * Esta clase representa una forma alternativa de mostrar los documentos en pantalla,
 * imitando una visualización tipo "Search UI", con una lista simple de resultados.
 *
 * Forma parte del ejercicio 2 de la prueba técnica.
 *
 * Ejemplo de salida:
 * <pre>
 * === Interfaz de usuario ===
 * Total documentos: 3
 * -------------------------------
 * • Informe_A | Fuente: Archivo
 * • Noticia X | Fuente: Web
 * </pre>
 *
 * @author Ichel Delgado
 */
public class SalidaSearchUI implements Salida {
    /**
     * Muestra los documentos simulando una interfaz de usuario de búsqueda.
     *
     * @param documentos Lista de documentos a mostrar.
     */
    @Override
    public void mostrar(List<Documento> documentos) {
        System.out.println("\n=== Interfaz de usuario ===");
        System.out.println("Total documentos: " + documentos.size());
        System.out.println("-------------------------------");
        for (Documento doc : documentos) {
            System.out.println("• " + doc.getTitulo() + " | Fuente: " + doc.getFuenteOrigen());
        }
    }
}
