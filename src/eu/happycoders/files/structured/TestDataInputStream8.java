package eu.happycoders.files.structured;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TestDataInputStream8 {
  public static void main(String[] args) throws IOException {
    try (var in = new DataInputStream(new BufferedInputStream(
        new FileInputStream("test8.bin")))) {
      // read String written by writeBytes()
      int len = in.readInt();
      byte[] bytes = new byte[len];
      in.read(bytes, 0, len);
      String s = new String(bytes, StandardCharsets.ISO_8859_1);
      System.out.println(s);

      // read String written by writeChars()
      len = in.readInt();
      bytes = new byte[len * 2];
      in.read(bytes, 0, len * 2);
      s = new String(bytes, StandardCharsets.UTF_16BE);
      System.out.println(s);

      // read String written by writeUTF()
      s = in.readUTF();
      System.out.println(s);
    }
  }
}
