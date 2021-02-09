public class Multi {
    static int multi(int u) {
        int i = 0;
        int res=0;
        for (; i < 11; i++) {
             res = i * u;
            System.out.println(i + " " + "*"+u + "=" + res);
        }

        return res;
    }
    public static void main(String [] args){
     int a=4;
     int res=0;
     res=multi(a);

    }
}
