import java.util.Scanner;

public class SumElementOfDiagonalLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào độ dài của ma trận vuông:");
        int width= sc.nextInt();
        int height = width;
        int [][] arr = new int[width][height];
        System.out.println("nhập vào các phần tử của ma trận:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter element [" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("ma trận vừa nhập là:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("tổng các phần tư của đường chéo chính ma trận vuông là: " + sum(arr));
    }
    static int sum (int[][]arrs){
        int sum = 0;
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs[i].length; j++) {
                if (i == j){
                    sum += arrs[i][j];
                }
            }
        }
        return sum;
    }
}
