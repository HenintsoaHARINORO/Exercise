import java.util.*;

public class BreadFirstSearch {
    private static Map<String, List<String >> graph= new HashMap<>();

    private static boolean search(String name){
        Queue<String> searchQueue= new ArrayDeque<>(graph.get(name));
        List<String> searched= new ArrayList<>();
        while(!searchQueue.isEmpty()){
            String person= searchQueue.poll();
            if(!searched.contains(person)){
                if(person_is_seller(person)){
                    System.out.println(person+ " is a mango seller!");
                    return true;
                }else{
                    searchQueue.addAll(graph.get(person));
                    searched.add(person);
                }
            }
        }
        return  false;
    }
    private static boolean person_is_seller(String name){
        return  name.endsWith("m");
    }
    public static void main(String [] args){
        graph.put("you",Arrays.asList("alice","bob","claire"));
        graph.put("bob",Arrays.asList("anuj","peggy"));
        graph.put("alice",Arrays.asList("peggy"));
        graph.put("claire",Arrays.asList("thom","jhonny"));
        graph.put("anuj",Collections.emptyList());
        graph.put("peggy",Collections.emptyList());
        graph.put("thom",Collections.emptyList());
        graph.put("jhonny",Collections.emptyList());

        search("you");
    }
}
