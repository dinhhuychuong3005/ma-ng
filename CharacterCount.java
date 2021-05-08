import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        char a = 'b';
        int count = 0;
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i) == a){
                count++;
            }
        }
        System.out.println("số lần xuất hiện kí tự " + a + " trong chuỗi là: " + count);
    }
}
