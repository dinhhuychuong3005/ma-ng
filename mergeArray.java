import java.util.Scanner;

public class mergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số size mảng 1:");
        int size1 = sc.nextInt();
        System.out.println("nhập vào số size mảng 2:");
        int size2 = sc.nextInt();
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        if (size1 < 1 || size2 < 1) {
            System.out.println("nhập lại số size");
        } else {
            System.out.println("nhập vào các phần tử của mảng 1:");
            for (int i = 0; i < arr1.length; i++) {
                System.out.println("phần tử " + (i + 1) + ":");
                arr1[i] = sc.nextInt();
            }
            System.out.println("nhập vào các phần tử của mảng 2:");
            for (int i = 0; i < arr2.length; i++) {
                System.out.println("phần tử " + (i + 1) + ":");
                arr2[i] = sc.nextInt();
            }
            System.out.println("mảng 1 là:");
            for (int i = 0; i < arr1.length; i++) {
                System.out.println(arr1[i] + ", ");
            }
            System.out.println("mảng 2 là:");
            for (int i = 0; i < arr2.length; i++) {
                System.out.println(arr2[i] + ", ");
            }
        }
int [] arr4 = merge(arr1,arr2);
        System.out.println("mảng 3 sau khi gộp là:");
        for (int i = 0;i<arr4.length;i++){
            System.out.print(arr4[i] + ", ");
        }
    }
    static int[] merge(int[]arr,int []arrs){
        int[]arr3 = new int[arr.length + arrs.length];
        for (int i = 0;i<arr3.length;i++){
            if (i<arr.length){
                arr3[i] = arr[i];
            }else {
                arr3[i] = arrs[i - arr.length];
            }
        }
return arr3;
    }
}
