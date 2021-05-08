import java.util.Scanner;

public class CountStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        if (size <= 0 || size > 30) {
            System.out.println("nhập lại số size lớn hơn 0 và nhỏ hơn 30");
        }else {
            System.out.println("số lượng học sinh đạt điểm đỗ là: " + count(arr));
        }
        System.out.println("nhập vào số điểm của sinh viên");
        for (int i = 0;i<arr.length;i++){
            System.out.print("số điểm" + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println("danh sách điểm vừa nhập vào là:");
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + ", ");
        }
    }
    static int count(int[]array){
        int count = 0;
        for (int i = 0;i<array.length;i++){
            if (array[i]>=5 && array[i]<=10){
                count ++;
            }
        }
        return count;
    }
}
