import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your sentence");
        String mess = sc.nextLine();
        System.out.println("Please enter the character you want to check:");
        String x = sc.nextLine();
        int n = mess.indexOf(x);

        if (n != -1) {
            System.out.println(mess + " contains " + x);
        } else
            System.out.println(mess + "does not contain" + x);

    }
}
