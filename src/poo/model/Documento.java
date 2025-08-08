package poo.model;

/**
 * Clase que representa un documento obtenido desde alguna fuente de datos.
 *
 * Un documento contiene un título, contenido textual y una referencia a su fuente de origen
 * (por ejemplo, un archivo, una URL o una base de datos).
 *
 * Esta clase se utiliza en el ejercicio 2 de la prueba técnica como parte del modelo de datos.
 *
 * Ejemplo de uso:
 * <pre>
 * Documento doc = new Documento("Informe 2024", "Contenido del informe...", "BD_Ventas");
 * </pre>
 *
 * @author Ichel Delgado
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

    /**
     * Devuelve una representación en texto del documento, mostrando el título y su origen.
     *
     * @return Cadena representando brevemente el documento.
     */
    @Override
    public String toString() {
        return "Documento{" +
                "titulo='" + titulo + '\'' +
                ", fuenteOrigen='" + fuenteOrigen + '\'' +
                '}';
    }


    /**
     * Obtiene el título del documento.
     *
     * @return Título como cadena de texto.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene el contenido del documento.
     *
     * @return Contenido completo como texto.
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * Obtiene la fuente de origen del documento.
     *
     * @return Nombre o enlace a la fuente del documento.
     */
    public String getFuenteOrigen() {
        return fuenteOrigen;
    }
}
