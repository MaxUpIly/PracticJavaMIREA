package mirea.pr4_1;


class Matrix {
    private double[][] matrix;
    public int i;
    public int j;

    public Matrix(int i, int j) {
        this.i = i;
        this.j = j;
        this.matrix = new double[i][j];
        for (int str = 0; str < i; str++) {
            for (int slb = 0; slb < j; slb++) {
                matrix[str][slb] = Math.random() * 10;
            }
        }
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public void printMatrix() {
        for (int str = 0; str < i; str++) {
            for (int slb = 0; slb < j; slb++) {
                System.out.print(String.format(" %.3f ", matrix[str][slb]));
            }
            System.out.println();
        }
    }

    public void plusMatrix(Matrix m2) {
        if (i!= m2.i || j!= m2.j){
            System.out.println("Матрицы нельзя сложить!");
            return;
        }
        for (int str = 0; str < i; str++) {
            for (int slb = 0; slb < j; slb++) {
                matrix[str][slb] += m2.getMatrix()[str][slb];
            }
        }
    }
    public void multiplyMatrix(double x){
        for (int str = 0; str < i; str++) {
            for (int slb = 0; slb < j; slb++) {
                matrix[str][slb] *= x;
            }
        }
    }
}

public class work_4 {
    public static void main(String[] args) {
        Matrix m = new Matrix(3, 4);
        Matrix m2 = new Matrix(3, 4);
        System.out.println("Первая матрица:");
        m.printMatrix();
        System.out.println("Вторая матрица:");
        m2.printMatrix();
        System.out.println("Сложение матриц:");
        m.plusMatrix(m2);
        m.printMatrix();
        System.out.println("Умножение (второй) матрицы на число:");
        m2.multiplyMatrix(2);
        m2.printMatrix();
    }
}
