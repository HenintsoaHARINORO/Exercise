public class Conversion3 {
    public static void main(String [] args){
        int a = 1234;
        Integer A = new Integer(a);
        String strA= A.toString();

        System.out.println(strA);

        float b =1234.56f;
        Float B = new Float(b);
        String strB = B.toString();
        System.out.println(strB);

        double c = 123456.789d;
        Double C = new Double(c);
        String strC= C.toString();
        System.out.println(strC);

        byte d = 113;
        Byte D= new Byte(d);
        String strD = D.toString();
        System.out.println(strD);
    }
}
