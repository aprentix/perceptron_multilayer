public class Neurona {
    public double[] Entradas = new double[3];
    public double[] Pesos= new double[3];
    public double Salida = 0;

    public Neurona(double[] entradas, double[] pesos) {
        Entradas = entradas;
        Pesos = pesos;
        Salida = CalculaSalida();
    }
    public double CalculaSalida(){
        double aux = 0;
        for (int i = 0; i < Entradas.length; i++) {
            aux+=Entradas[i]*Pesos[i];
        }
        return 1/(1+Math.pow(Math.E, -aux));
    }
}
