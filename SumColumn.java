import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height:");
        int height = sc.nextInt();
        System.out.println("Enter width:");
        int width = sc.nextInt();
        int[][] arr = new int[height][width];
        System.out.println("Enter array element:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter element [" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("mảng vừa nhập là:" + "\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("nhập vào số côt cần tính tổng:");
        int column = sc.nextInt() - 1;
        if (column <= 0 || column > width) {
            System.out.println("số cột không được vượt quá độ dài của mảng");
        } else {
            System.out.println("tổng các phần tử của cột " + column + "là:" + sum(arr, column));
        }
    }

    static int sum(int[][] arrs, int x) {
        int sum = 0;
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs[i].length; j++) {
                if (j == x) {
                    sum += arrs[i][j];
                }
            }
        }
        return sum;
    }
}
