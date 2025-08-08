package poo.implementation.problemaUno;

import poo.interfaces.problemaUno.FuenteDatos;
import poo.model.Documento;

import java.util.List;

/**
 * Implementación de FuenteDatos que simula obtener documentos desde páginas web.
 */
public class FuenteWeb  implements FuenteDatos {

    @Override
    public List<Documento> obtenerDocumentos() {
        System.out.println("\nObteniendo documentos desde fuentes web...");
        return List.of(
                new Documento("Blog Linux", "Últimas tendencias de Linux...", "https://blog-linux.com/blog"),
                new Documento("Noticias de Colombia", "Resumen de noticias del Colombia...", "https://noticias-actuales.com/colombia")
        );
    }

}