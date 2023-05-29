public class LinAlg {
    
    public static double[] solveLinearIPS(Matrix lins){
        // Solves an Intermined Possible System 2x2

        double[][] sys = lins.getMatrix();

        double divisor = - (sys[0][0] / sys[0][1]);

        if (divisor % 2 != 0){
            divisor = 1 / divisor;
        }

        double[] out = {1, divisor};
        return out;
    }

    public static double getModule(double[] vector){

        int sum = 0;
        for (int i = 0; i < vector.length; i ++){
            sum += Math.pow(vector[i], 2);
        }
        return Math.sqrt(sum);
    }

    public static double[] vectorByScalar(double scalar, double[] vector){

        double[] out = new double[vector.length];
        for (int i = 0; i < vector.length; i++){
            out[i] = scalar * vector[i];
        }
        return out;
    }

}
