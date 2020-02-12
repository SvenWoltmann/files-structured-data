package eu.happycoders.files.structured;

import java.io.IOException;

public class TestDataOutputStream7 {
  public static void main(String[] args) throws IOException {
    String fire = "🔥";
    System.out.println("fire = " + fire);
    System.out.println("fire.length() = " + fire.length());

    char c0 = fire.charAt(0);
    char c1 = fire.charAt(1);
    System.out.println("fire.charAt(0) = " + c0 + " (hex: " + Integer.toHexString(c0) + ")");
    System.out.println("fire.charAt(1) = " + c1 + " (hex: " + Integer.toHexString(c1) + ")");
  }
}
