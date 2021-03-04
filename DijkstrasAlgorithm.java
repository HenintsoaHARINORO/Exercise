import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DijkstrasAlgorithm {
    private static Map<String ,Map<String,Double>> graph= new HashMap<>();
    private static List<String> processed= new ArrayList<>();
    private static  String findLowestCostNode(Map<String,Double> costs){
        Double lowestCost=Double.POSITIVE_INFINITY;
        String lowestCostNode= null;
        for(Map.Entry<String,Double> node:costs.entrySet()){
            Double cost= node.getValue();
            if(cost<lowestCost && !processed.contains())
        }
    }
}
