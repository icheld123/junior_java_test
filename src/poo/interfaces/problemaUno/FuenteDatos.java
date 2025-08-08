package poo.interfaces.problemaUno;
import poo.model.Documento;
import java.util.List;

/**
 * Interfaz que define el contrato para cualquier fuente de datos capaz de proporcionar documentos.
 *
 * Esta interfaz forma parte del ejercicio 2 de la prueba técnica y permite abstraer
 * diferentes orígenes de documentos, como archivos locales, bases de datos o fuentes web.
 *
 * Las clases que implementan esta interfaz deben encargarse de simular la obtención de datos
 * y devolver una lista de instancias de {@link Documento}.
 *
 * Implementaciones comunes:
 * <ul>
 *   <li>{@link poo.implementation.problemaUno.FuenteArchivo}</li>
 *   <li>{@link poo.implementation.problemaUno.FuenteWeb}</li>
 *   <li>{@link poo.implementation.problemaUno.FuenteBaseDatos}</li>
 * </ul>
 *
 * @author Ichel Delgado
 */
public interface FuenteDatos {
    /**
     * Obtiene una lista de documentos desde la fuente de datos simulada.
     *
     * @return Lista de documentos disponibles en la fuente.
     */
    List<Documento> obtenerDocumentos();
}