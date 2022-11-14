public class Perceptron2x1 {
    private double Alpha;
    private double salidaDeseada;
    private Parametros p = new Parametros(
            0.006480125,
            2.064352182,0.920944267, 4.913871551, 4.203783998, -1.720689577, 3.864602363,
            -2.128147045, -3.650379833,-4.596615185,
            1,0.930483919,0.452251841
    );
    public Perceptron2x1() {}
    double[] entradas = new double[] {p.E0, p.E1, p.E2};
    private Neurona N01 = new Neurona(entradas, new double[]{p.W011, p.W111, p.W211});
    private Neurona N02 = new Neurona(entradas, new double[] {p.W021, p.W121, p.W221});
    double[] entradas2 = new double[] {p.E0, N01.Salida, N02.Salida};
    private Neurona N11 = new Neurona(entradas2, new double[] {p.W012, p.W112, p.W212});

    public void propagacion(){
        p.S01 = p.E1;
        p.S02 = p.E2;
        p.S11 = N01.Salida;
        p.S21 = N02.Salida;
        p.S12 = N11.Salida;
        System.out.println("Salida neurona 1: "+N01.Salida+" Salida neurona 2: "+N02.Salida);
        System.out.println("Salida neurona 3: "+N11.Salida);
    }
    public void retropropagacion(){
        System.out.println();
        p.Lambda21 = (p.Sd-p.S12)*(p.S12)*(1-p.S12);
        p.V21 = (p.W212*p.Lambda12);
        p.V11 = (p.W112*p.Lambda12);
        p.Lambda21 = p.V21*p.S21*(1-p.S21);
        p.Lambda11 = p.V11*p.S11*(1-p.S11);

        p.AW011 = p.alpha;
        p.AW012 = p.alpha;
        p.AW021 = p.alpha;

        p.AW111 = p.alpha * p.S01 * p.Lambda11;
        p.AW112 = p.alpha * p.S11 * p.Lambda12;
        p.AW211 = p.alpha * p.S02 * p.Lambda11;
        p.AW212 = p.alpha * p. * ;
        p.AW221 = p.alpha * ;
        p.AW121 = p.alpha * ;

        p.W011_prima = p.W011 + p.AW011;
        p.W012_prima = p.W012 + p.AW012;
        p.W021_prima = p.W021 + p.AW021;

        p.W111_prima = p.W111 + p.AW111;
        p.W112_prima = p.W112 + p.AW112;
        p.W211_prima = p.W211 + p.AW221;
        p.W212_prima = p.W212 + p.AW212;
        p.W221_prima = p.W221 + p.AW221;
        p.W121_prima = p.W121 + p.AW121;
    }
/*
    public void showData(){
        double[][] capa1 = {
                {p.W011, p.W021},
                {p.W111, p.W121},
                {p.W211, p.W221}
        };
        for (int i = 0; i < capa1.length; i++) {
            for (int j = 0; j < capa1[0].length; j++) {
                System.out.println(capa1[i][j]);
            }
        }
    }

    public void funcionActivacion(double[] valores, int comienzo){
        for (int i=comienzo; i< valores.length; i++) {
            valores[i]=1/(1+Math.pow(Math.E, -valores[i]));
        }
    }

    public void CalculaSalida(double[][] capa, double[] entradas, double[] s, int comienzo){ // Para capas ocultas el comienzo ha de ser 1
        double aux=0;
        for (int i = 0; i < capa[0].length; i++) {
            aux=0;
            for(int j = 0; j< capa.length; j++){
                aux+=entradas[j]*capa[j][i];
                System.out.println(" entradas["+j+"]: " + entradas[j] + " capa["+j+"]["+i+"]: " + capa[j][i] + " resultado: " + aux );
            }
            if(comienzo==1) s[i+1]=aux; // Conservamos el 1 para calculos posteriores si es una capa oculta, esto se indica con comienzo, si es 1 es una capa oculta
            else s[i]=aux;
        }
        funcionActivacion(s, comienzo);
        System.out.println("EL VECTOR SALIDA ES: ");
        for (int i=0; i<s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }
*/
}

