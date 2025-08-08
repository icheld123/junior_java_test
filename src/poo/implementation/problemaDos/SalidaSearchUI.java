package poo.implementation.problemaDos;

import poo.interfaces.problemaDos.Salida;
import poo.model.Documento;

import java.util.List;

public class SalidaSearchUI implements Salida {
    @Override
    public void mostrar(List<Documento> documentos) {
        System.out.println("\n=== Interfaz de usuario ===");
        System.out.println("Total documentos: " + documentos.size());
        System.out.println("-------------------------------");
        for (Documento doc : documentos) {
            System.out.println("• " + doc.getTitulo() + " | Fuente: " + doc.getFuenteOrigen());
        }
    }
}
