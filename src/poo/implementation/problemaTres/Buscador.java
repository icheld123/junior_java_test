package poo.implementation.problemaTres;

import poo.model.Documento;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Clase que simula un motor de búsqueda de documentos.
 *
 * Realiza una búsqueda simple sobre los títulos de los documentos proporcionados,
 * filtrando aquellos que contienen la cadena de búsqueda (ignorando mayúsculas/minúsculas).
 *
 * Forma parte del ejercicio 2 de la prueba técnica.
 *
 * Ejemplo de uso:
 * <pre>
 * Buscador buscador = new Buscador();
 * List&lt;Documento&gt; resultados = buscador.buscar("informe", documentos);
 * </pre>
 *
 * La búsqueda es simulada y no realiza análisis de contenido, solo coincidencias parciales en el título.
 *
 * @author Ichel Delgado
 */
public class Buscador {
    /**
     * Realiza una búsqueda de documentos cuyo título contenga la cadena consultada.
     *
     * @param consulta   Texto a buscar dentro de los títulos de los documentos.
     * @param documentos Lista de documentos donde realizar la búsqueda.
     * @return Lista de documentos que coinciden con la consulta.
     */
    public List<Documento> buscar(String consulta, List<Documento> documentos) {
        System.out.printf("%nBuscando: '%s'...%n", consulta);

        List<Documento> resultados = documentos.stream()
                .filter(doc -> doc.getTitulo().toLowerCase().contains(consulta.toLowerCase()))
                .collect(Collectors.toList());

        System.out.printf("%d resultados encontrados:%n", resultados.size());
        resultados.forEach(doc ->
                System.out.printf("   ✔ %s (Fuente: %s)%n",
                        doc.getTitulo(), doc.getFuenteOrigen()));

        return resultados;
    }
}

