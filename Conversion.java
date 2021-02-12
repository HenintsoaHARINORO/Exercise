public class Conversion {
    public static void main(String [] args){
    String strA= "1234";
    int A= Integer.parseInt(strA);
    System.out.println(A);

    String strB = "1234.56";
    float B = Float.parseFloat(strB);
    System.out.println(B);

    String strC = "123456.789";
    double C = Double.parseDouble(strC);
    System.out.println(C);

    String strD = "113";
    byte D = Byte.parseByte(strD);
    System.out.println(D);

    String strE = "12345678910";
    long E = Long.parseLong(strE);
    System.out.println(E);

    String strF = "F";
    char ef = strF.charAt(0);
    int EF = (int)ef;
    System.out.println(EF);
    }
}
