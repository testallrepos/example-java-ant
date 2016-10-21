package com.srcclr;

import org.mindrot.jbcrypt.BCrypt;

public class Main {

  public static void main(String[] args) {
    String candidate = args[0];
    String hashed = BCrypt.hashpw(candidate, BCrypt.gensalt(12));
    BCrypt.checkpw(candidate, hashed);
    System.out.println("Vanilla Ant completed.");
  }
}