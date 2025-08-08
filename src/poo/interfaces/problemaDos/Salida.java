package poo.interfaces.problemaDos;

import poo.model.Documento;

import java.util.List;

/**
 * Interfaz que define el contrato para las clases encargadas de mostrar
 * una lista de documentos por medio de distintas formas de salida o visualización.
 *
 * Esta interfaz forma parte del ejercicio 2 de la prueba técnica y permite
 * aplicar polimorfismo para simular diferentes tipos de presentación de resultados,
 * como dashboards o interfaces de búsqueda.
 *
 * Implementaciones conocidas:
 * <ul>
 *   <li>{@link poo.implementation.problemaDos.SalidaDashboard}</li>
 *   <li>{@link poo.implementation.problemaDos.SalidaSearchUI}</li>
 * </ul>
 *
 * @author Ichel Delgado
 */
public interface Salida {

    /**
     * Muestra la lista de documentos según el formato definido por la implementación.
     *
     * @param documentos Lista de documentos a presentar.
     */
    void mostrar(List<Documento> documentos);
}
