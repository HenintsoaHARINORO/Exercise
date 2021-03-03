import java.util.HashMap;
import java.util.Map;

public class Check_Voters {
    private static  Map<String,Boolean> voted= new HashMap<>();
    private static  void CheckVoter(String name){
        if(voted.containsKey(name)){
            System.out.println("Kick them out");

        }
        else{
            voted.put(name,true);
            System.out.println("Let them vote");
        }
    }

    public static  void main(String [] args){
       CheckVoter("mike");
       CheckVoter("John");
       CheckVoter("mike");

    }
}
