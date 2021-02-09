import java.util.Scanner;

public class Fact {
     static int Factoriel(int u){
         if(u==1)
             return 1;
          else
              return u*Factoriel(u-1);
    }
    public static  void main(String [] args){
         int res;
         System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
       int a= sc.nextInt();
       res=Factoriel(a);
       System.out.println(a+"! ="+res);
    }
}
