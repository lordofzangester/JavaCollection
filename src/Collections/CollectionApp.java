package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<Integer> ages = new ArrayList<>(List.of(18, 20, 22, 24, 30));
        Collection<Integer> agess = new LinkedList<>(List.of(18, 20, 22, 24, 30));


        agess.add(50);

        for( var v : agess){
            System.out.println(v);
        }

    }
}
