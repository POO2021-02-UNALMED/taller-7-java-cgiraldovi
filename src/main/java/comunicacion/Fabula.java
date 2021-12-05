package comunicacion;

public class Fabula extends Escrito{
    private String ensenanza;
    private String interpretacion;

    //constructor + getter and setter

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    //fin constructor getter and setter

    @Override
    int palabrasTotales(int palabrasPagina) {
        return 1 * palabrasPagina;
    }

    @Override
    String interpretacion() {
        return this.interpretacion;
    }

    @Override
    public String toString() {
        return getOrigen() + getTitulo() + getAutor() + String.valueOf(getPaginas()) + getEnsenanza();
    }
}
