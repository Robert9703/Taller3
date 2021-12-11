package taller3.decimal;
/**
 *
 * @author alexander
 */
public class CResta {
    private float num1,num2,resta;

    public void setDatos(float num1, float num2){
        this.num1 = num1;
        this.num2 = num2;

    }

    private float resta(){
        resta = num1 - num2;
        return resta;
    }

    public float getResta(){
        return resta();
    }
    
}