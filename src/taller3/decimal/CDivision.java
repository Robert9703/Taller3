package taller3.decimal;
/**
 *
 * @author alexander
 */
public class CDivision {
    private float num1,num2,division;

    public void setDatos(float num1, float num2){
        this.num1 = num1;
        this.num2 = num2;

    }

    private float division(){
        division = num1 / num2;
        return division;
    }

    public float getDivision(){
        return division();
    }
    
}