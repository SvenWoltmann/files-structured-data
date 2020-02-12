package eu.happycoders.files.structured;

import java.io.*;

public class TestDataOutputStream4 {
  public static void main(String[] args) throws IOException {
    try (var out = new DataOutputStream(new BufferedOutputStream(
        new FileOutputStream("test2.bin")))) {
      out.writeShort(1000000);  // --> 42 40 (int: 00 0f 42 40)
      out.writeShort(32768);    // --> 80 00 (int: 00 00 80 00)
      out.writeShort(32767);    // --> 7f ff (int: 00 00 7f ff)
      out.writeShort(0);        // --> 00 00 (int: 00 00 00 00)
      out.writeShort(-32768);   // --> 80 00 (int: ff ff 80 00)
      out.writeShort(-32769);   // --> 7f ff (int: ff ff 7f ff)
      out.writeShort(-1000000); // --> bd c0 (int: ff f0 bd c0)
    }
  }
}
