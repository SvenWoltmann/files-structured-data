package eu.happycoders.files.structured;

import java.io.*;

public class TestDataOutputStream3 {
  public static void main(String[] args) throws IOException {
    try (var out = new DataOutputStream(new BufferedOutputStream(
        new FileOutputStream("test2.bin")))) {
      out.writeInt(1000);  // --> 00 00 03 e8
      out.writeInt(128);   // --> 00 00 00 80
      out.writeInt(127);   // --> 00 00 00 7f
      out.writeInt(0);     // --> 00 00 00 00
      out.writeInt(-128);  // --> ff ff ff 80
      out.writeInt(-129);  // --> ff ff ff 7f
      out.writeInt(-1000); // --> ff ff fc 18
    }
  }
}
