package seconds;

import java.util.ArrayList;
import java.util.Arrays;

public class Seconds {
  public static void main(String[] args) {
    // Create a function that takes a list as a parameter,
    // and returns a new list with every second element from the orignal list
    // example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(evenList(numbers));
  }

  public static ArrayList<Integer> evenList(ArrayList<Integer> list) {
    ArrayList<Integer> even = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) % 2 == 0) {
        even.add(list.get(i));
      }
    }
    return even;
  }
}
