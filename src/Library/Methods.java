package Library;

public class Methods {


//    public void min(int a,int b){
//        if (a > b){
//            System.out.println(b);
//        }else{
//            System.out.println(a);
//        }
//    }


//    public void arrayMathOperation(int[]arrOne,int[]arrTwo){
//        int sum1 = 0;
//        int sum2 = 0;
//        for (int j = 0; j < arrOne.length; j++)
//            sum1 = sum1 + arrOne[j];
//        int result1 = sum1 / arrOne.length;
////        System.out.println(result1);
//        for (int i = 0; i < arrTwo.length; i++)
//            sum2 = sum2 + arrTwo[i];
//        int result2 = sum2 / arrTwo.length;
////        System.out.println(result2);
//        if (result1 < result2){
//            System.out.println("Большее среднее арифметическое воторого массива " + result2);
//        }else{
//            System.out.println("Большее среднее арифметическое первого массива " + result1);
//        }
//    }


    public int[] parrInt (int[]arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }return arr;
        }
        int[] result2 = new int[count];
        for (int j = 0; j < result2.length; j++) {
            result2[j] = arr[j];

        }
        System.out.println("Count is "+count);
            return result2;
    }



}
