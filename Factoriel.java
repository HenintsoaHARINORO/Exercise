public class Factoriel {
    int n,res;
    Factoriel(int u){
        this.n = u ;
    }
    void factoriel(){
        int i;
        for (res = 1,i = 2;i <= n; i++){
            res = res *i;
        }
    }
    public static void main(String [] args){
        Factoriel obj = new Factoriel(3);
        obj.factoriel();
        System.out.println(obj.res);
    }
}
