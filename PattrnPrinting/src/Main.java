public class Main {
    public static void main(String[] args) {
        pattern30(4);
    }

    static  void pattern30(int n ){
        for (int row = 1; row <=n ; row++) {
            for (int space = 0; space <n-row ; space++) {
                System.out.println(" ");

            }
            for (int col = row; col >=1 ; col--) {
                System.out.println(col);
            }
            for (int col = 2; col <=row ; col++) {
                System.out.println(col);

            }
            System.out.println( " ");

        }
        System.out.println( " ");
    }
    static void pattern28(int n) {
        for(int row = 0; row < 2* n; row ++) {
            int tottalColsInRow=row >n ? 2*n -row:row;

            int noOfSpacess= n- tottalColsInRow;
            for (int s = 0; s < noOfSpacess; s++) {
                System.out.println( " ");

            }

            for(int col = 0; col < tottalColsInRow; col++) {
                System.out.print(" * " );
            }

            System.out.println();
        }

    }


    static void pattern5(int n) {
        for(int row = 1; row < 2* n; ++row) {
            int tottalColsInRow=row >n ? 2*n -row-1:row;
            for(int col = 1; col <= tottalColsInRow; col++) {
                System.out.print(" * " );
            }

            System.out.println();
        }

    }
}