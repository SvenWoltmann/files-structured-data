package eu.happycoders.files.structured;

import java.io.*;

public class TestDataOutputStream8 {
  static final String STRING = "Hello World äöü ß α € ↖ 🔥";

  public static void main(String[] args) throws IOException {
    try (var out = new DataOutputStream(new BufferedOutputStream(
        new FileOutputStream("test8.bin")))) {
      out.writeInt(STRING.length());
      out.writeBytes(STRING);

      out.writeInt(STRING.length());
      out.writeChars(STRING);

      out.writeUTF(STRING);
    }
  }
}
