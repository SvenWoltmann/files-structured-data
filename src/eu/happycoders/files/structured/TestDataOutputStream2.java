package eu.happycoders.files.structured;

import java.io.*;

public class TestDataOutputStream2 {
  public static void main(String[] args) throws IOException {
    try (var out = new DataOutputStream(new BufferedOutputStream(
        new FileOutputStream("test2.bin")))) {
      out.writeByte(1000);  // --> e8
      out.writeByte(128);   // --> 80
      out.writeByte(127);   // --> 7f (Byte.MAX_VALUE)
      out.writeByte(0);     // --> 00
      out.writeByte(-128);  // --> 80 (Byte.MIN_VALUE)
      out.writeByte(-129);  // --> 7f
      out.writeByte(-1000); // --> 18
    }
  }
}
