package poo.implementation.problemaDos;

import poo.interfaces.problemaDos.Salida;
import poo.model.Documento;

import java.util.List;

public class SalidaDashboard implements Salida {
    @Override
    public void mostrar(List<Documento> documentos) {
        System.out.println("\n=== Dashboard de Documentos ===");
        System.out.println("Total documentos: " + documentos.size());
        System.out.println("-------------------------------");
        documentos.forEach(doc ->
                System.out.printf("> %-20s | > %-30s%n",
                        doc.getTitulo(), doc.getFuenteOrigen()));
    }
}
