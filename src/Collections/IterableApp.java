package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Ayu","dewi");

        for (var v : names){
            System.out.println(v);
        }
        System.out.println(names.getClass());
    }
}
