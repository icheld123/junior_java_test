package poo.implementation.problemaUno;

import poo.interfaces.problemaUno.FuenteDatos;
import poo.model.Documento;

import java.util.List;

/**
 * Implementación de la interfaz {@link FuenteDatos} que simula la obtención de documentos
 * desde páginas web.
 *
 * Esta clase actúa como una fuente ficticia de documentos provenientes de sitios web.
 * Los documentos son simulados y contienen títulos, contenido y enlaces representativos.
 *
 * Forma parte del ejercicio 2 de la prueba técnica.
 *
 * Ejemplo de documentos simulados:
 * <ul>
 *   <li>Blog Linux</li>
 *   <li>Noticias de Colombia</li>
 * </ul>
 *
 * @author Ichel Delgado
 */
public class FuenteWeb  implements FuenteDatos {

    /**
     * Simula la obtención de documentos desde páginas web.
     *
     * @return Lista de documentos con información simulada de fuentes web.
     */
    @Override
    public List<Documento> obtenerDocumentos() {
        System.out.println("\nObteniendo documentos desde fuentes web...");
        return List.of(
                new Documento("Blog Linux", "Últimas tendencias de Linux...", "https://blog-linux.com/blog"),
                new Documento("Noticias de Colombia", "Resumen de noticias del Colombia...", "https://noticias-actuales.com/colombia")
        );
    }

}