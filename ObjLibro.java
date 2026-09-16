public class ObjLibro {

    int Isbn;
    String Titulo;
    String Autor;
    String AnioPublicacion;

    public ObjLibro() {
    }

    public ObjLibro(int isbn, String titulo, String autor, String anioPublicacion) {
        Isbn = isbn;
        Titulo = titulo;
        Autor = autor;
        AnioPublicacion = anioPublicacion;
    }

    public int getIsbn() {
        return Isbn;
    }

    public void setIsbn(int isbn) {
        Isbn = isbn;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getAnioPublicacion() {
        return AnioPublicacion;
    }

    public void setAnioPublicacion(String anioPublicacion) {
        AnioPublicacion = anioPublicacion;
    }

    
    
}