import java.util.Scanner;

public class MinInTwoDimensionalArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng:");
        int width = sc.nextInt();
        System.out.println("Nhập vào độ rộng của mảng:");
        int height = sc.nextInt();
        int[][] arr = new int[height][width];
        System.out.println("nhập vào các phần tử của mảng");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("phần tử có chỉ số  [" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("mảng vừa nhập là:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("giá trị nhỏ nhất của mảng là: " + MinValue(arr));
    }

    static int MinValue(int[][] arrs) {
        int min = arrs[0][0];
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs[i].length; j++) {
                if (arrs[i][j] < min) {
                    min = arrs[i][j];
                }
            }
        }
        return min;
    }
}
