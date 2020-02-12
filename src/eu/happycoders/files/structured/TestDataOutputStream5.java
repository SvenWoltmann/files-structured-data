package eu.happycoders.files.structured;

import java.io.*;

public class TestDataOutputStream5 {
  public static void main(String[] args) throws IOException {
    try (var out = new DataOutputStream(new BufferedOutputStream(
        new FileOutputStream("test5.bin")))) {
      out.writeChar('a');  // --> 00 61
      out.writeChar('€');  // --> 20 ac
      out.writeChar('字'); // --> 5b 57

      out.writeChar(723_790_628); // --> 2b 24 (int: 2b 24 2b 24)
      out.writeChar(-100);        // --> ff 9c (int: ff ff ff 9c)
      out.writeChar(-16_776_261); // --> 03 bb (int: ff 00 03 bb)
    }
  }
}
