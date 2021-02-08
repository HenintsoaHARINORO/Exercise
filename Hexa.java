public class Hexa {

    public static void main(String [] args){
        double a =255;
       
        double hexa= a/16;
       int HEXA= (int)hexa;
       double hexa1= hexa -HEXA;
       double hexa12= hexa1*16;
       int hexa123=(int)hexa12;
       System.out.println(hexa);
       System.out.println(HEXA);
       System.out.println(hexa1);
        System.out.println(hexa123);


Convert nbr= new Convert();
String res,res1;
res= nbr.Conver(HEXA);
res1=nbr.Conver(hexa123);

System.out.println("#"+res+res1);



    }
    static class Convert{
        String Conver(int num){
            String s="";
            char hex[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
            String str2="";
            str2=hex[num]+s;
            return str2;
        }
    }
}
