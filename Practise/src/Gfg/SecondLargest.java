package Gfg;

public class SecondLargest {

    public static void thirdLargest(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int i = 0; i< arr.length; i++){
            if(arr[i] > first){
                third = second;
                second =  first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i]>third) {
                third = arr[i];
            }
        }
        System.out.println("Three largest numbers are :" + first + " " + second + " " + third);
    }

    public static int secondLargest(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }else if(arr[i]>second && arr[i]!=first){
                second = arr[i];
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,77,21,40,90,3};
        int i = secondLargest(arr);
        System.out.println(i);

        thirdLargest(arr);
    }
}
