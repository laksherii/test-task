package convertValues;

public class ConvertValues {
    double value;
    public ConvertValues(double value){
        this.value = value;
    }
    private static final double BYN_TO_USD = 0.306;
    private static final double BYN_TO_EUR = 0.281;
    private static final double BYN_TO_RUB = 29.150;
    private static final double BYN_TO_KZT = 148.277;
    private static final double BYN_TO_JPY = 45.717;

    public double getBynToUsd(){
       return value * BYN_TO_USD;
    }
    public double getBynToEur(){
        return value * BYN_TO_EUR;
    }
    public double getBynToRub(){ return value * BYN_TO_RUB; }
    public double getBynToKzt(){
        return value * BYN_TO_KZT;
    }
    public double getBynToJpy(){
        return value * BYN_TO_JPY;
    }
}
