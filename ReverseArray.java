import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter size:");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("size không vượt quá 20");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Phan tu " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.println("cac phan tu trong mang là:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " , ");
        }
        for (int i = 0; i < array.length / 2; i++) {
            int x = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = x;
        }
        System.out.println("cac phan tu sau khi đảo ngược là:");
        for (int i = 0;i<array.length;i++){
            System.out.println(array[i] + " , ");
        }
    }
}
