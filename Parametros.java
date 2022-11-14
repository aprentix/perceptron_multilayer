public class Parametros {
    double alpha;
    /// AW NEURONAS
    double AW011;
    double AW012;
    double AW021;
    /// AW
    double AW111;
    double AW112;
    double AW211;
    double AW212;
    double AW221;
    double AW121;
    // ENTRADAS
    double E0;
    double E1;
    double E2;
    /// LAMBDA
    double Lambda11;
    double Lambda12;
    double Lambda21;
    /// SALIDA
    double S01;
    double S02;
    double S11;
    double S12;
    double S21;
    double Sd;
    double V11;
    double V21;
    double W011;
    double W011_prima;
    double W012;
    double W012_prima;
    double W021;
    double W021_prima;
    double W111;
    double W111_prima;
    double W112;
    double W112_prima;
    double W121;
    double W121_prima;
    double W211;
    double W211_prima;
    double W212;
    double W212_prima;
    double W221;
    double W221_prima;


    public Parametros(double alpha, double Sd, double W011, double W111, double W211, double W021, double W121, double W221, double W012, double W112, double W212, double e0, double e1, double e2) {
        this.alpha = alpha;
        this.Sd = Sd;
        this.W011 = W011;
        this.W111 = W111;
        this.W211 = W211;
        this.W021 = W021;
        this.W121 = W121;
        this.W221 = W221;
        this.W012 = W012;
        this.W112 = W112;
        this.W212 = W212;
        E0 = e0;
        E1 = e1;
        E2 = e2;
    }
}
