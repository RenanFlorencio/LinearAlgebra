public class Main {
    
    public static void main(String[] args) {
        
        double[][] salve = {{1, 0, 0,},{0, 1, 0},{0, 0, 1}};
        double[][] salve2 = {{1, 0, 0,},{0, 1, 0},{0, 0, 1}};

        Matrix m1 = new Matrix(salve);
        Matrix m2 = new Matrix(salve2);
        Matrix out = null;

        Matrix id = Matrix.IdentityMatrix(2);
        System.out.println(id);

        id.multByScalar(2);
        System.out.println(id);

        Conic conic = new Conic(5, -4, 8, 0, 0, -36);
        
        double[] sol = conic.caractPolynomial();

        out = Matrix.sumMatrix(m1, m2);
        System.out.println(out);

    }

}
