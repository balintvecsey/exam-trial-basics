package countas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Bálint on 2017. 04. 11..
 */
public class CountAs {

  public static void main(String[] args) {
    // Create a function that takes a filename as string parameter,
    // counts the occurances of the letter "a", and returns it as a number.
    // If the file does not exist, the function should return 0 and not break.

    // example: on the input "afile.txt" the function should return 28 - print this result
    // example: on the input "not-a-file" the function should return 0 - print this result

    System.out.println(allAs("afile.txt"));

  }

  public static int allAs(String filename) {
    int as = 0;
    Path filePath = Paths.get("countas/" + filename);
    try {
      List<String> lines = Files.readAllLines(filePath);

      char[] chars = lines.toString().toLowerCase().toCharArray();

      for (int i = 0; i < chars.length; i++) {
        if (chars[i] == 'a') {
          as++;
        }
      }
    } catch (IOException e) {
      return as;
    }
    return as;
  }
}

