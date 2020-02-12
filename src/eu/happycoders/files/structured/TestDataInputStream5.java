package eu.happycoders.files.structured;

import java.io.*;

public class TestDataInputStream5 {
  public static void main(String[] args) throws IOException {
    try (var in = new DataInputStream(new BufferedInputStream(
        new FileInputStream("test5.bin")))) {
      System.out.println(in.readChar());
      System.out.println(in.readChar());
      System.out.println(in.readChar());
      System.out.println(in.readChar());
      System.out.println(in.readChar());
      System.out.println(in.readChar());
    }
  }
}
