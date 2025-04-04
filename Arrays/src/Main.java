public class Main {
    public static void main(String[] args) {
//        int [] arr = {1, 2, 3, 4, 5};
//
//        // Getting the array length
//        int n = arr.length;
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.println();
//
//        int [] numbers = new int[5];
//
//        // Accessing an element from array
//        int secondNumber = arr[1];
//        System.out.println(secondNumber);
//
//        System.out.println();
//
//        // Change ne element in array
//        arr[1] = 10;
//        secondNumber = arr[1];
//        System.out.println(secondNumber);
//
//        // declaring an array
//        int intArray[];
//
//        // allocating memory to array
//        intArray = new int[20];
//
//        // combining both statements in one
//        int[] intArrayTwo = new int[20];

        // Multi-Dimensional Arrays

        int [][] multiDimArrray = {
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10}
        };

        for (int i = 0; i < multiDimArrray.length; i++) {
            System.out.println();
            for (int j = 0; j < multiDimArrray[i].length; j++) {
                System.out.print(multiDimArrray[i][j] + " ");
            }
        }

        System.out.println();

        Student[] array = new Student[] {
                new Student(1, "Jan"),
                new Student(2,"Goran"),
                new Student(3,"Marko"),
                new Student(4,"Frane"),
                new Student(5,"Ivan"),
        };


        for (Student element : array) {
            System.out.println(element.roll_no + " " + element.name);
        }
//        array = new Student[5];
//
//        array[0] = new Student(1, "Jan");
//        array[1] = new Student(2, "Goran");
//        array[2] = new Student(3, "Marko");
//        array[3] = new Student(4, "Ivo");
//        array[4] = new Student(5, "mateo");
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i].roll_no + " " + array[i].name );
//        }

        System.out.println();

        // 3D array
        int [][][] threeDArray = {
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                },
                {
                        {13, 14, 15, 16},
                        {17, 18, 19, 20},
                        {21, 22, 23, 24}
                }
        };

        System.out.println(threeDArray[0][1][2]);  // Output: 7 (Layer 0, Row 1, Column 2)

        System.out.println();


//        for (int i = 0; i < threeDArray.length; i++) {  // Loop through layers
//            for (int j = 0; j < threeDArray[i].length; j++) {  // Loop through rows
//                for (int k = 0; k < threeDArray[i][j].length; k++) {  // Loop through columns
//                    System.out.print(threeDArray[i][j][k] + " ");  // Print the element
//                }
//                System.out.println();  // Move to the next row
//            }
//            System.out.println();  // Add an empty line between layers
//        }


        // Example of deep copy single dimensional array
        int arrayTest[] = {1, 2, 3, 4, 5};
        int cloneArray[] = arrayTest.clone();

        System.out.println(arrayTest == cloneArray);

        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i] + " ");
        }

        System.out.println();

        // Cloning Multidimensional Array
        int twoDArray[][] = {{1,2,3},{4,5,6}};

        int cloneTwoDArray[][]= twoDArray.clone();

        System.out.println(cloneTwoDArray == twoDArray);
        System.out.println(twoDArray[0] == cloneTwoDArray[0]);
        System.out.println(twoDArray[1] == cloneTwoDArray[1]);


        Array
    }
}