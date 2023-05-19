public class Matrix {
    
    private double[][] matrix;
    private final int rows;
    private final int columns;
    private boolean isSquare;

    public Matrix(double[][] array){
        this.matrix = array;
        rows = array.length;
        columns = array[0].length;
        
        if (rows == columns){
            isSquare = true;
        }
        else{
            isSquare = false;
        }
    }

    public static Matrix IdentityMatrix(int size){
        // Creates an Identity Matrix 'size' x 'size'
        double[][] array = new double[size][size];

        for(int i = 0; i < size; i++){
            for( int j = 0; j < size; j++){
                if (j == i){
                    array[i][j] = 1;
                }
                else{
                    array[i][j] = 0;
                }
            }
        }
        Matrix out = new Matrix(array);
        return out;
    }


    public String toString(){

        String out = "";

        out += "Matrix:\n";
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                out += matrix[i][j] + "\t";
            }
            out += "\n";
        }
        out += "\nNumber of rows: " + rows + "\nNumber of columns: " + columns;
        out += "\n--------------------";

        return out;
    }

    public static Matrix sumMatrix (Matrix A, Matrix B){

        if(!((A.rows == B.rows) && A.columns == B.columns)){
            return null;
        }
        double[][] array = new double[A.rows][A.columns];
        Matrix out = new Matrix(array);

        for(int i = 0; i < A.rows; i++){
            for(int j = 0; j < A.columns; j++){
                out.matrix[i][j] = A.matrix[i][j] + B.matrix[i][j];
            }
        }
        return out;
    }

    public void multByScalar(double scalar){

        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.columns; j++){
                this.matrix[i][j] *= scalar;
            }
        }

    }

    public static double determinant (double[][] matrix){
        // Gets the determinant of a 2D or 3D matrix
        double determinant = 0;
        int matrixSize = matrix.length;


        if (matrixSize == 2){
            determinant = matrix[0][0] * matrix[1][1] - (matrix[0][1] * matrix[1][0]);
        }
        else if (matrixSize == 3){

            double main = 0;
            double secondary = 0;
 
            main = matrix[0][0] * matrix[1][1] * matrix[2][2] + matrix[0][1] * matrix[1][2] * matrix[2][0] + matrix[0][2] * matrix[1][0] * matrix[2][1];
            secondary = matrix[0][2] * matrix[1][1] * matrix[2][0] + matrix[0][1] * matrix[1][2] * matrix[2][0] + matrix[0][2] * matrix[1][0] * matrix[2][1];            

            determinant = main - secondary;
        }

        return determinant;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public boolean isSquare() {
        return isSquare;
    }


    public void setSquare(boolean isSquare) {
        this.isSquare = isSquare;
    }

}
