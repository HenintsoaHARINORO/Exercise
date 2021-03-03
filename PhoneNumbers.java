import java.util.HashMap;
import java.util.Map;

public class PhoneNumbers {
    public static void main(String [] args){
        Map<String,Integer> phone= new HashMap<>();
        phone.put("Jenny",236958);
        phone.put("Kylle",238);
        phone.put("Jhon",2014);
        System.out.println(phone.get("Jhon"));
    }
}
