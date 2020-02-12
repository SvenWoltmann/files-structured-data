package eu.happycoders.files.structured;

import java.io.*;

public class TestDataOutputStream5b {
  public static void main(String[] args) throws IOException {
    try (var out = new DataOutputStream(new BufferedOutputStream(
        new FileOutputStream("test5.bin")))) {
      out.writeInt(723_790_628); // --> 2b 24 2b 24
      out.writeInt(-100);        // --> ff ff ff 9c
      out.writeInt(-16_776_261); // --> ff 00 03 bb
    }
  }
}
