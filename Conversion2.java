public class Conversion2 {
    public static void main(String [] args){
        char a = 'a';
        int A =(int)a;
        System.out.println(A);

        char b = '\u0062';
        System.out.println(((int)b));

        char c = 'c';
        char C= (char)(c - 0x20);
        System.out.println(C);

        char d= 'D';
        char D = (char)(d+ 0x20);
        System.out.println(D);

    }
}
