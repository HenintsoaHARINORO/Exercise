public class sum1 {
    public static void main(String [] args){
        String a="1234";
        int b= 42;
        int integerA =Integer.parseInt(a);
        int c = integerA+ b;
        System.out.println(c);

        String e ="12.50";
        String f= "13.50";
        double E = Double.parseDouble(e);
        double F = Double.parseDouble(f);
        int EF = (int)(E+F);
        System.out.println(EF);

        int g= 12;
        int h = 34;
        Integer nbrG = g;
        String numG = nbrG.toString();
        Integer nbrH = h;
        String numH = nbrH.toString();

        String GH = numG+numH;

        System.out.println(GH);

        String i= "1234.56";
        int  j = 42;
       double nbrI = Double.parseDouble(i);
       double nbrIJ = j + nbrI;

        Double J =nbrIJ;
        String IJ = J.toString();
        System.out.println(IJ);

        int nbrIJ1 = (int)(j+ nbrI);
        System.out.println(nbrIJ1);

        double nbr= Double.parseDouble(IJ);

        System.out.println(nbr);




    }
}
