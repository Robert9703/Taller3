package taller3;

public class cMultiplicacion {
    private float num1,num2,multiplicacion;

    public void setDatos(float num1, float num2){
        this.num1 = num1;
        this.num2 = num2;

    }

    private float multiplicacion(){
        multiplicacion = num1 * num2;
        return multiplicacion;
    }

    public float getMultiplicacion(){
        return multiplicacion();
    }
    
}
