package eu.happycoders.files.structured;

import java.io.*;

public class TestDataOutputStream6 {
  static final String STRING = "Hello World äöü ß α € ↖ 🔥";

  public static void main(String[] args) throws IOException {
    try (var out = new DataOutputStream(new BufferedOutputStream(
        new FileOutputStream("test6.bin")))) {
      out.writeBytes(STRING);
      out.writeChars(STRING);
      out.writeUTF(STRING);
    }
  }
}
