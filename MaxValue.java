import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhap size:");
            size = sc.nextInt();
            if (size > 20){
                System.out.println("số size khong vượt quá 20");
            }
        }while (size > 20);
        array = new int[size];
        for (int i = 0;i<array.length;i++){
            System.out.print("nhap vao phan tu " + (i + 1) + " :");
            array[i] = sc.nextInt();
        }
        System.out.println("các phần tử trong mảng là:");
        for (int j = 0;j <array.length;j++ ){
            System.out.print(array[j] + " , ");
        }
        System.out.println("giá trị lớn nhất trong mảng là:");
        int max = array[0];
        for (int k = 0;k < array.length;k++){
            if (array[k] > max){
                max = array[k];
            }
        }
        System.out.println("giá trị lớn nhất trong mảng là: " + max);
    }
}
