package comunicacion;

public class Fabula extends Escrito{
    private String ensenanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

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
