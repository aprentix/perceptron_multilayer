public class P2x1 {
    public static void main(String[] args) {
        Perceptron2x1 p1 = new Perceptron2x1();
        //p1.showData();
        System.out.println("////////////// PROPAGACION //////////////");
        p1.propagacion();
        System.out.println("////////////////////////////////////////");
        System.out.println("////////////// RETROPROPAGACION //////////////");
        p1.retropropagacion();
        System.out.println("////////////////////////////////////////");

    }


}
