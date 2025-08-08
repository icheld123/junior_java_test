package poo.implementation.problemaTres;

import poo.model.Documento;

import java.util.List;
import java.util.stream.Collectors;

public class Buscador {
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

