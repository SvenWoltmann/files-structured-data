package eu.happycoders.files.structured;

import java.io.*;

public class TestObjectInputStream1 {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    try (var fis = new FileInputStream("objects1.bin");
         var in = new ObjectInputStream(new BufferedInputStream(fis))) {
      while (true) {
        Object o = in.readObject();
        System.out.println("o.class = " + o.getClass() + "; o = " + o);
      }
    } catch (EOFException ex) {
      System.out.println("EOF");
    }
  }
}
