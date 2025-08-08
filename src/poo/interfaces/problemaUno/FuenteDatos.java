package poo.interfaces.problemaUno;
import poo.model.Documento;
import java.util.List;

/**
* Interfaz que define el contrato para cualquier fuente de datos que pueda proporcionar documentos.
*/
public interface FuenteDatos {
    /**
    * Obtiene una lista de documentos desde la fuente de datos.
    *
    * @return Lista de documentos obtenidos
    */
    List<Documento> obtenerDocumentos();
}