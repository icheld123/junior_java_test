package poo.model;

/**
 * Clase que representa un documento obtenido de alguna fuente de datos.
 * Contiene título, contenido e información sobre su origen.
 */
public class Documento {
    private String titulo;
    private String contenido;
    private String fuenteOrigen;

    /**
    * Constructor para crear un nuevo documento.
    *
    * @param titulo El título del documento
    * @param contenido El contenido/texto del documento
    * @param fuenteOrigen La fuente de donde proviene el documento
    */
    public Documento(String titulo, String contenido, String fuenteOrigen) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.fuenteOrigen = fuenteOrigen;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "titulo='" + titulo + '\'' +
                ", fuenteOrigen='" + fuenteOrigen + '\'' +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public String getFuenteOrigen() {
        return fuenteOrigen;
    }
}
