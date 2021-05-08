import java.util.Scanner;

public class ValueArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 tên sinh viên :");
        String name = sc.nextLine();
        boolean check = false;
        for (int i = 0;i < students.length;i++){

            if (name.equals(students[i])){
                System.out.println("sinh viên" + name + " ở vị trí thứ: " + (i +1) + " trong danh sách");
                check = true;
                break;
            }
        }
        if(check == false){
            System.out.println("sinh viên " + name + " không có trong danh sách");
        }
    }
}
