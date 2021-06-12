import java.io.*;
import java.util.*;
public class Read {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.err.println("Usage: java Read <src>");
    } else {
      try (Scanner in = new Scanner(new File(args[0]))) {
        while ( in .hasNext()) {
          String str = in .nextLine();
          if (str.substring(0, 2).equals("//"))
            System.out.println(str);
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}