 
public class Conic {

    private Matrix caracMatrix;
    private final double a_xsqrd;
    private final double b_xy;
    private final double c_ysqrd;
    private final double d_x;
    private final double e_y;
    private final double f;

    public Conic(double a, double b, double c, double d, double e, double f){

        this.a_xsqrd = a;
        this.b_xy = b;
        this.c_ysqrd = c;
        this.d_x = d;
        this.e_y = e;
        this.f = f;
        double[][] array = {{a, b/2},{b/2, c}};
        this.caracMatrix = new Matrix(array);
    }

    public double[] caractPolynomial(){
        // Getting the solutions  for the chacaracteristic polinomyal trough Bhasksara
        double a = 1;
        double b = -(a_xsqrd + c_ysqrd);
        double c = -(Math.pow(b_xy, 2) / 4) + a_xsqrd * c_ysqrd;

        double s1 = 1/(2*a) * (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c));
        double s2 = 1/(2*a) * (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c));

        double[] solution = {s1, s2};
        return solution;
    }


    public double getA_xsqrd() {
        return a_xsqrd;
    }

    public double getB_xy() {
        return b_xy;
    }

    public double getC_ysqrd() {
        return c_ysqrd;
    }

    public double getD_x() {
        return d_x;
    }

    public double getE_y() {
        return e_y;
    }

    public double getF() {
        return f;
    }
    
    public Matrix getCaracMatrix() {
        return caracMatrix;
    }

}
