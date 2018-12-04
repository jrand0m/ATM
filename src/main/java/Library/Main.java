package Library;

public class Main {


    public static int[] parredArred(int[] oldArray) {
        int length = 0;
        int[] midArray = new int[length];
        for (int i = 0; i < oldArray.length; i++) {
            if (oldArray[i] % 2 == 0) {
                System.out.print(oldArray[i] + " ");
                length++;
                midArray[i] = oldArray[i];
                System.out.print(midArray[i]);
            }
        }
        return oldArray;
    }


    public static void main(String[] args) {
        int[] oldArr = new int[50];
        for (int i = 0; i < oldArr.length; i++) {
            if (oldArr[i] % 2 == 0) {
                oldArr[i] = i;
            }
        }
        //int[] wwww = parredArred(oldArr);
        //System.out.println(Arrays.toString(wwww));

//        Methods methods = new Methods();
//
//        int[] array = {1,2,3,4,5,6,7,8,9,0};
//
//        methods.parrInt(array);


//
//        int newNumber = 15;
//int[][] oldAray = {{1,2,3},{4,5,6},{7,8,9}};

//oldAray[0][2] = 12;
//        for (int i = 0; i < oldAray.length; i++) {
//            for (int j = 0; j < oldAray[i].length; j++) {
//                int ints = oldAray[i][j];
//                System.out.print(ints + " ");
//            }
//            System.out.println(" ");
//        }


//
//        int[][]newArray = new int[oldAray.length][oldAray.length + 1];
//        for (int i = 0; i < oldAray.length; i++) {
//            for (int j = 0; j < oldAray.length; j++) {
//                newArray[i][j] = oldAray[i][j];
//                System.out.print(newArray[i][j] + " ");
//            }
//            System.out.println(" ");
//        }
//        for (int i = 0; i < newArray.length; i++) {
//            for (int j = 0; j < newArray[i].length; j++) {
//                int x = newArray[i][j];
//                System.out.print(x + " ");
//newArray[0][newArray.length - 1] = newNumber;
//            }
//            System.out.println(" ");
//        }


//
//        System.out.println("---------------------------------");
//
//        //methods.min(7,3);
//
//        System.out.println("---------------------------------");
//
//       int[] arrFirst = new int[5];
//        for (int i = 0; i < arrFirst.length; i++) {
//            arrFirst[i] = ((int)Math.floor(Math.random()*5));
//            System.out.println(arrFirst[i]);
//        }
//        System.out.println("---------------------------------");
//
//        int[] arrSecond = new int[5];
//        for (int j = 0; j < arrFirst.length; j++) {
//            arrSecond[j] = ((int)Math.floor(Math.random()*5));
//            System.out.println(arrSecond[j]);
//        }
//        methods.arrayMathOperation(arrFirst,arrSecond);
//
//        System.out.println("---------------------------------");


//        int [][] i = new int[5][5];
//        for (int j = 0; j < i.length; j++) {
//            for (int k = 0; k < i[j].length; k++) {
//                i[j][k]=random.nextInt(100);
//                System.out.print(i[j][k] + " ");
//            }
//            System.out.println("");
//        }


        // int[] arr = {2,17,13,6,22,31,45,66,100,-18};
//        int a = 0;
//        while (a < arr.length){
//            System.out.print(arr[a]+" ");
//            a++;
//        }


//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];             //everytime sum in loop is ZERO!!!!!
//            //System.out.println(sum);   //
//        }System.out.println(sum);   //
//
//
//
//        System.out.println("------------------------------");
//
//             int sum1 = 0;
//        for (int i = 0; i < arr.length; i++)   // without brackets only first row bellow loop is working
//            sum1 = sum1 + arr[i];
//            System.out.println(sum1);


//        int array[] = {3, 5, 7, 12};
//        int sum = 0;
//        for (int i = 0; i < array.length; ++i)   //sum array - for - WITHOUT BRACKETS!!!!!!!!!!!!
//            sum += array[i];
//            System.out.println(sum);


//        int array[] = {3, 5, 7, 12};
//        int sum1 = 0;
//        for (int element : array)   //array sum - for each
//            sum1 += element;
//        System.out.print(sum1);


    }
}
