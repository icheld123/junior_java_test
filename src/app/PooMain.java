package app;
import poo.implementation.problemaDos.SalidaDashboard;
import poo.implementation.problemaDos.SalidaSearchUI;
import poo.implementation.problemaTres.Buscador;
import poo.implementation.problemaUno.FuenteBaseDatos;
import poo.implementation.problemaUno.FuenteArchivo;
import poo.interfaces.problemaDos.Salida;
import poo.interfaces.problemaUno.FuenteDatos;
import poo.implementation.problemaUno.FuenteWeb;
import poo.model.Documento;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal que demuestra el uso del sistema de obtención de documentos.
 */
public class PooMain {
    public static void main(String[] args) {
        FuenteDatos[] fuentes = {
                new FuenteArchivo(),
                new FuenteWeb(),
                new FuenteBaseDatos()
        };

        List<Documento> todosDocumentos = new ArrayList<>();

        for (FuenteDatos fuente : fuentes) {
            List<Documento> documentos = fuente.obtenerDocumentos();
            todosDocumentos.addAll(documentos);

            System.out.println("\nDocumentos obtenidos de " + fuente.getClass().getSimpleName() + ":");
            documentos.forEach(System.out::println);
        }

        System.out.println("\n=== RESUMEN FINAL ===");
        System.out.println("Total de documentos obtenidos: " + todosDocumentos.size());
        System.out.println("\nLista completa de documentos:");
        todosDocumentos.forEach(doc -> System.out.println("• " + doc));

        Salida[] salidas = {
                new SalidaSearchUI(),
                new SalidaDashboard()
        };

        for (Salida salida : salidas) {
            salida.mostrar(todosDocumentos);
        }

        Buscador buscador = new Buscador();
        List<Documento> resultados = buscador.buscar("Informe", todosDocumentos);

        System.out.println("\nResultados de la búsqueda:");
        resultados.forEach(System.out::println);
    }
}
