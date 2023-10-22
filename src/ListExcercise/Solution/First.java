package ListExcercise.Solution;

import java.util.*;

public class First {
//    Write a Java program to create a new array list, add some elements (string) and print out the collection
//    https://www.tutorjoes.in/java_programming_tutorial/arraylist_exercise_programs_in_java

    public static void main(String[] args) {
        System.out.println(printArrayList());
        System.out.println(printLinkedList());
    }

    private static LinkedList<String> printLinkedList() {
        LinkedList<String> jobs = new LinkedList<>();
        jobs.add("Developer");
        jobs.addAll(Arrays.asList("Manager","Sales"));

        return jobs;
    }

    private static List<String> printArrayList() {
        ArrayList<String> locations = new ArrayList<>();
        locations.add("Manila");
        locations.add("Jakarta");
        locations.add("Seoul");

        return Collections.unmodifiableList(locations);
    }

}
