import java.util.Scanner;

public class Space {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer le message");
        String mess = sc.nextLine();
        int space = 0;
        for(int i = 0; i<mess.length();i++){
            if(mess.charAt(i)==' '){
                space++;
            }
        }
        System.out.println(space);
    }
}
