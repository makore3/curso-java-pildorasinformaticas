public class Arrays2D {

    public static void main(String[] args) {

        /*
        // Personal Practice
        int[][] years = new int[3][5];

        years[0][0] = 2000;
        years[0][1] = 2001;
        years[0][2] = 2002;
        years[0][3] = 2003;
        years[0][4] = 2004;
        years[1][0] = 2005;
        years[1][1] = 2006;
        years[1][2] = 2007;
        years[1][3] = 2008;
        years[1][4] = 2009;
        years[2][0] = 2010;
        years[2][1] = 2011;
        years[2][2] = 2012;
        years[2][3] = 2013;
        years[2][4] = 2014;

        for (int i = 0; i < years.length; i++) {
            for (int j = 0; j < years[i].length; j++) {
                System.out.println(years[i][j]);
            }
        }

         */

        // Tutorial Example
        int [][] matrix=new int[4][5];

        matrix[0][0]=15;
        matrix[0][1]=21;
        matrix[0][2]=18;
        matrix[0][3]=9;
        matrix[0][4]=15;

        matrix[1][0]=10;
        matrix[1][1]=52;
        matrix[1][2]=17;
        matrix[1][3]=10;
        matrix[1][4]=7;

        matrix[2][0]=92;
        matrix[2][1]=13;
        matrix[2][2]=29;
        matrix[2][3]=45;
        matrix[2][4]=69;

        matrix[3][0]=19;
        matrix[3][1]=2;
        matrix[3][2]=19;
        matrix[3][3]=17;
        matrix[3][4]=7;

        /*
        System.out.println(matrix[1][2]);
         */

        for(int i=0; i<4; i++) {
            for (int j=0; j<5; j++) {
                System.out.print((matrix[i][j])+" ");
            }
            System.out.println();
        }
    }
}
