package eu.happycoders.files.structured;

import java.io.*;

public class TestDataOutputStream4b {
  public static void main(String[] args) throws IOException {
    try (var out = new DataOutputStream(new BufferedOutputStream(
        new FileOutputStream("test2.bin")))) {
      out.writeInt(1000000);  // --> 00 0f 42 40
      out.writeInt(32768);    // --> 00 00 80 00
      out.writeInt(32767);    // --> 00 00 7f ff
      out.writeInt(0);        // --> 00 00 00 00
      out.writeInt(-32768);   // --> ff ff 80 00
      out.writeInt(-32769);   // --> ff ff 7f ff
      out.writeInt(-1000000); // --> ff f0 bd c0
    }
  }
}
