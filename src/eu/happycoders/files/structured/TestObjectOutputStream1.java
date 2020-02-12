package eu.happycoders.files.structured;

import java.io.*;
import java.util.*;

public class TestObjectOutputStream1 {
  public static void main(String[] args) throws IOException {
    try (var out = new ObjectOutputStream(new BufferedOutputStream(
        new FileOutputStream("objects1.bin")))) {
      // Write a string
      out.writeObject("Hello World äöü ß α € ↖ 🔥");

      // Write an array list
      ArrayList<Integer> list = new ArrayList();
      list.add(42);
      list.add(47);
      list.add(74);
      out.writeObject(list);

      // Write an unmodifiable list
      out.writeObject(List.of("Hello", "World"));
    }
  }
}
