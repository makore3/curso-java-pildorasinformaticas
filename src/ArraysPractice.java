public class ArraysPractice {

    public static void main(String[] args) {

        /*
        // Example of arrays
        int [] myArray = new int[5];

        myArray[0] = 5;
        myArray[1] = 15;
        myArray[2] = 51;
        myArray[3] = 53;
        myArray[4] = 95;


        // Manual
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);
        System.out.println(myArray[3]);
        System.out.println(myArray[4]);

        // IDE Recommendation
        for (int j : myArray) {
            System.out.println(j);
        }
         */

        // Example of reduced syntax for arrays
        int [] myArray2 = {5, 15, 51, 53, 95, 45, 91, 32, 14, 87, 453, 31, 8, 96, 99};

        // Personal code
        for(int i = 0; i < myArray2.length; i++) {
            System.out.println("Index: " + i + " = " + myArray2[i]);
        }

    }
}
