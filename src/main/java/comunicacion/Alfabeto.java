package comunicacion;

public class Alfabeto {
    private String[] letras;
    private String interpretacion;

    //constructor + getter and setter

    public Alfabeto(String interpretacion, String[] letras) {
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    //fin constructor getter and setter


     public int cantidadLetras(){
        return 1;
     }

     public String interpretacion(){
        return "";
     }

     public String toString(){
        return "";
     }


}
