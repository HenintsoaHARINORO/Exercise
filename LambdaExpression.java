public class LambdaExpression {
    public static void main(String [] args){
        String name= "Charlie";
        Runnable greeter= ()->System.out.println("Hi"+ name);
        greeter.run();
    }
}
