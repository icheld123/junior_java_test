package poo.implementation.problemaUno;

import poo.interfaces.problemaUno.FuenteDatos;
import poo.model.Documento;

import java.util.List;

/**
 * Implementación de FuenteDatos que simula obtener documentos desde archivos del sistema.
 */
public class FuenteArchivo implements FuenteDatos {

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
