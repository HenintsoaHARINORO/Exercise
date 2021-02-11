import java.util.Scanner;

public class Char {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer le message");
        String mess = sc.nextLine();
        int n= mess.indexOf('x');

        if( n !=-1){
            System.out.println(mess + " contient le caractere 'x'");
        }
        else
            System.out.println(mess + " ne contient pas le caractere 'x'");

    }
}
