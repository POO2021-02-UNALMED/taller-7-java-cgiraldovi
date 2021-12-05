package comunicacion;

public class Tesis extends Escrito{
    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;
    public Tesis(String origen, String titulo, String autor, int paginas,
                 String idea, String[] argumentos, String conclusion, String referencias,
                 String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
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
