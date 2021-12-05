package comunicacion;

public class Libro extends Escrito{
    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;


    // constructor + getter and setter
    public Libro(String origen, String titulo, String autor, int paginas,
                 String co_autor, String editorial, String edicion, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.co_autor = co_autor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.interpretacion = interpretacion;
    }



    //fin getter and setter

    @Override
    int palabrasTotales(int palabrasPagina) {
        return 0;
    }

    @Override
    String interpretacion() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

}
