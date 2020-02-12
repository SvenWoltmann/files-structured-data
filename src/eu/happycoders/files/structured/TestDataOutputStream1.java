package eu.happycoders.files.structured;

import java.io.*;

public class TestDataOutputStream1 {
  public static void main(String[] args) throws IOException {
    try (var out = new DataOutputStream(new BufferedOutputStream(
        new FileOutputStream("test1.bin")))) {
      out.writeByte((byte) 123);
      out.writeShort((short) 1_234);
      out.writeInt(1_234_567);
      out.writeLong(1_234_567_890_123_456L);
      out.writeFloat((float) Math.E);
      out.writeDouble(Math.PI);
      out.writeBoolean(true);
      out.writeChar('€');
    }
  }
}
