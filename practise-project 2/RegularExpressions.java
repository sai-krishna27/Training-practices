package com.java;

import java.util.regex.*;
import java.util.regex.Pattern;

public class RegularExpressions {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("regular", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("regular pattern matcher");
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
  }
}