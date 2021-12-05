package comunicacion;

public class Alfabeto extends Pictograma{
    private String[] letras;
    private String interpretacion;

    //constructor + getter and setter

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
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
        return letras.length;
     }

     public String interpretacion(){
        return this.interpretacion;
     }

     public String toString(){
        String resultado = "";

        for (int i = 0; i < letras.length; i ++){
            if (i!= letras.length-1){
                resultado = resultado + letras[i] + ", ";
            } else{
                resultado = resultado + letras[i];
            }
        }
        return resultado;
     }


}
