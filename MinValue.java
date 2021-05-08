import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao số size:");
        size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("nhap vào các phần tử của mảng:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("phần tử " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        System.out.println("các phần tử trong mảng là:");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + " , ");
        }

        int min = array[0];
        for (int k = 0; k < array.length; k++) {
            if (array[k] < min) {
                min = array[k];
            }
        }
        System.out.println("giá trị nhỏ nhất là " + min);
    }
}
