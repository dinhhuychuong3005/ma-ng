import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số size của mảng:");
        size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("nhập vào các phần tử của mảng:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("phần tử " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        System.out.println("các phần tử của mảng là: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " , ");
        }
        int x;

        System.out.println("nhập vào số cần tìm:");
        x = sc.nextInt();
        System.out.println("các phần tử sau khi xóa x là");
        boolean check = false;
        for (int k = 0; k < array.length; k++) {

            if (x == array[k]) {
                int[] arrays = new int[array.length - 1];
                for (int j = 0; j < k; j++) {
                    arrays[j] = array[j];
                }
                for (int i = k + 1; i < array.length; i++) {
                    arrays[i - 1] = array[i];
                }
                for (int e = 0;e<arrays.length;e++){
                    System.out.println(arrays[e] + ",");
                }
                check = true;
                break;
            }else check = false;
            }
        if (check == false){
            System.out.println("số nhập vào không có trong mảng");
        }
    }
}
