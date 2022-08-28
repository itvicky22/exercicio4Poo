package entidades;

public class ConversorMoeda {

    public static double IOF = 0.06;
    
    public static double dolarReal(double quantia,double precoDolar) {
        return quantia*precoDolar*(1.0+IOF);
        
    }
}