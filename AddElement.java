import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 8, 7};
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào vị trí cần chèn:");
        int index = sc.nextInt() - 1;

        if (index <= -1 || index > array.length) {
            System.out.println("không chèn được phần tử vào mảng");
        } else {
            array = addElement(array,index);
            System.out.println("mang sau khi chèn là:");
            for (int i = 0;i<array.length;i++){
                System.out.print(array[i] + ",");
            }
        }
    }

    static int[] addElement(int[] arr, int vitri ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số cần chèn:");
        int x = sc.nextInt();
        int[] arrays = new int[arr.length + 1];
        for (int i = 0; i < arrays.length; i++) {
            if (i < vitri) {
                arrays[i] = arr[i];
            } else if (i == vitri) {
                arrays[i] = x;
            }else {
                arrays[i] = arr[i - 1];
            }
        }
        return arrays;
    }

}

