package comunicacion;

public class Periodico extends Escrito{
    private String fecha;
    private String primicia;
    private String interpretacion;
    public Periodico(String origen, String titulo, String autor, int paginas,
                     String fecha, String primicia, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
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
