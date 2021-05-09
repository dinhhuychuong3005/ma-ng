import java.util.Scanner;

public class ArrayExercises {
    public static void main(String[] args) {
        int choice = -1;
        int size;
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("\n========MENU===========");
            System.out.println("1. Nhập mảng có kích thước N (0<N<100)");
            System.out.println("2. Hiển thị mảng vừa nhập");
            System.out.println("3. Tìm số chẵn lớn nhất trong mảng");
            System.out.println("4. Liệt kê danh sách các số chẵn trong mảng");
            System.out.println("5. Tính tổng các số chẵn trong mảng");
            System.out.println("6. Chèn giá trị vào mảng");
            System.out.println("7. Xoá tất cả các phần tử có giá trị bằng X (được nhập từ bàn phím) khỏi mảng ");
            System.out.println("8. Đảo ngược mảng ban đầu");
            System.out.println("9. Hiển thị danh sách các số nguyên tố trong mảng");
            System.out.println("10. Sắp xếp mảng theo thứ tự giảm dần");
            System.out.println("11.Thoát");
            System.out.println("Nhập lựa chọn");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    size = inputsize();
                    inputArray(arr, size);
                    break;
                case 2:
                    size = inputsize();
                    inputArray(arr, size);
                    displayArray(arr, size);
                    break;
                case 3:
                    size = inputsize();
                    inputArray(arr, size);
                    displayArray(arr, size);
                    int max = findMaxEven(arr, size);
                    if (max == -1) {
                        System.out.print("\n" + "không có số chẵn trong mảng");
                    } else {
                        System.out.print("\n" + "số chẵn lớn nhất trong mảng là: " + max);
                    }
                    break;
                case 4:
                    size = inputsize();
                    inputArray(arr, size);
                    displayArray(arr, size);
                    findEven(arr, size);
                    break;
                case 5:
                    size = inputsize();
                    inputArray(arr, size);
                    displayArray(arr, size);
                    int sum = sumEven(arr, size);
                    if (sum == 0) {
                        System.out.println("không có số chẵn trong mảng");
                    } else {
                        System.out.println("tổng các số chẵn trong mảng là: " + sum);
                    }
                    break;
                case 6:
                    size = inputsize();
                    inputArray(arr, size);
                    displayArray(arr, size);
                    addElement(arr, size);
                    break;
                case 7:
                    size = inputsize();
                    inputArray(arr, size);
                    displayArray(arr, size);
                    deleteElement(arr, size);
                    break;
                case 8:
                    size = inputsize();
                    inputArray(arr, size);
                    displayArray(arr, size);
                    reverseArray(arr, size);
                    break;
                case 9:
                    size = inputsize();
                    inputArray(arr, size);
                    displayArray(arr, size);
                    PrintPrime(arr, size);
                    break;
                case 10:
                    size = inputsize();
                    inputArray(arr, size);
                    displayArray(arr, size);
                    sort(arr,size);
                    break;
                case 11:
                    System.exit(0);
            }
        }
    }

    static int inputsize() {
        int N;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập mảng có kích thước N (0<N<100)");
            N = sc.nextInt();
        } while (N <= 0 || N > 100);
        return N;
    }

    static void inputArray(int[] arrs, int N) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào các phần tử của mảng có kích thước N");
        for (int i = 0; i < N; i++) {
            System.out.println("Phần tử " + (i + 1) + ":");
            arrs[i] = sc.nextInt();
        }
    }

    static void displayArray(int[] arrs, int N) {
        System.out.println("Mảng vừa nhập là:");
        for (int i = 0; i < N; i++) {
            System.out.print(arrs[i] + ", ");
        }
    }

    static int findMaxEven(int[] arr, int N) {
        int max = -1;
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0 && arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void findEven(int[] arr, int N) {
        boolean check = false;
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print("\n" + "Các số chẵn trong mảng là: " + arr[i]);
                check = true;
            }
        }
        if (check == false) {
            System.out.println("\n" + "không có số chẵn trong mảng");
        }
    }

    static int sumEven(int[] arr, int N) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    static void addElement(int[] arr, int N) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nnhập vào vị trí cần chèn:");
        int index = sc.nextInt();
        if (index <= -1 || index > arr.length) {
            System.out.println("\nkhông chèn được phần tử vào mảng");
        } else {
            System.out.println("nhập vào số cần chèn:");
            int x = sc.nextInt();
            int[] arrays = new int[N + 1];
            for (int i = 0; i < arrays.length; i++) {
                if (i < index) {
                    arrays[i] = arr[i];
                } else if (i == index) {
                    arrays[i] = x;
                } else {
                    arrays[i] = arr[i - 1];
                }
            }
            System.out.println("\nmảng sau khi chèn là:");
            for (int i = 0; i < arrays.length; i++) {
                System.out.print(arrays[i] + ",");
            }
        }
    }

    static void deleteElement(int[] arr, int N) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nnhập vào số cần xóa:");
        int x = sc.nextInt();
        int[] arrays = new int[N - 1];
        boolean check = false;
        for (int k = 0; k < N; k++) {

            if (x == arr[k]) {

                for (int j = 0; j < k; j++) {
                    arrays[j] = arr[j];
                }
                for (int i = k + 1; i < N; i++) {
                    arrays[i - 1] = arr[i];
                }
                check = true;
            } else check = false;
        }
        if (check == false) {
            System.out.println("\nsố nhập vào không có trong mảng");
        } else {
            System.out.println("\ncác phần tử sau khi xóa x là:");
            for (int i = 0; i < arrays.length; i++) {
                System.out.print(arrays[i] + ",");
            }
        }
    }

    static void reverseArray(int[] arr, int N) {
        for (int i = 0; i < N / 2; i++) {
            int x = arr[i];
            arr[i] = arr[N - 1 - i];
            arr[N - 1 - i] = x;
        }
        System.out.println("\ncac phan tu sau khi đảo ngược là:");
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i] + " , ");
        }
    }

    static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void PrintPrime(int[] arr, int N) {
        System.out.println("\ncác số nguyên tố trong mảng là: ");
        for (int i = 0; i < N; i++) {
            if (checkPrime(arr[i])) {
                System.out.print(arr[i] + ",");
            }
        }
    }

    static void sort(int[] arr, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] < arr[j]) {
                    int x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }
        System.out.println("\nmảng sau khi sắp xếp theo thứ tự giảm dần là:");
        for (int i = 0;i<N;i++){
            System.out.print(arr[i] + ",");
        }
    }
}


