package comunicacion;

public class Periodico extends Escrito {
    private String fecha;
    private String primicia;
    private String interpretacion;


    //constructor + getter and setter

    public Periodico(String origen, String titulo, String autor, int paginas,
                     String fecha, String primicia, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrimicia() {
        return primicia;
    }

    public void setPrimicia(String primicia) {
        this.primicia = primicia;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    //fin constructor getter and setter

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return 10 * palabrasPagina * getPaginas();
    }

    @Override
    public String interpretacion() {
        return this.interpretacion;
    }

    @Override
    public String toString() {

        return getOrigen()+"\n" + getTitulo()+"\n" + getAutor()+"\n" + String.valueOf(getPaginas())+"\n"
                + getFecha()+"\n" + getPrimicia();
    }
}
