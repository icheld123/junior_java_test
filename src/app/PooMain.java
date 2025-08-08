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
 * Clase principal que ejecuta el ejercicio 2 de la prueba técnica.
 *
 * Esta clase demuestra el uso de un sistema orientado a objetos que simula:
 * - Obtención de documentos desde múltiples fuentes de datos.
 * - Presentación de los documentos mediante diferentes tipos de salida.
 * - Ejecución de una búsqueda simulada sobre los documentos obtenidos.
 *
 * <p>El flujo principal incluye:</p>
 * <ul>
 *     <li>Instanciación de fuentes de datos (archivo, web, base de datos)</li>
 *     <li>Recopilación y visualización de todos los documentos</li>
 *     <li>Salida de los documentos mediante dos métodos distintos</li>
 *     <li>Simulación de búsqueda con resultados fijos</li>
 * </ul>
 *
 * @author Ichel Delgado
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
