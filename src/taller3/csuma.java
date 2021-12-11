package taller3;

public class csuma {
    private float num1,num2,suma;

    public void setDatos(float num1, float num2){
        this.num1 = num1;
        this.num2 = num2;

    }

    private float suma(){
        suma = num1 + num2;
        return suma;
    }

    public float getSuma(){
        return suma();
    }
    
}
