package eu.happycoders.files.structured;

import java.io.*;

public class TestDataInputStream1 {
  public static void main(String[] args) throws IOException {
    try (var in = new DataInputStream(new BufferedInputStream(
        new FileInputStream("test1.bin")))) {
      System.out.println(in.readByte());
      System.out.println(in.readShort());
      System.out.println(in.readInt());
      System.out.println(in.readLong());
      System.out.println(in.readFloat());
      System.out.println(in.readDouble());
      System.out.println(in.readBoolean());
      System.out.println(in.readChar());
    }
  }
}
