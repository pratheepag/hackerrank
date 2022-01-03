package stringmanipulation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class AnagramResult {

    /*
     * Complete the 'makeAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static int makeAnagram(String a, String b) {
    	// Write your code here
    	final int freq[] = new int[26];
    	a.chars().forEach((c) -> {
            freq[c - 97]++;
        });
    	b.chars().forEach((c) -> {
            freq[c - 97]--;
        });
    	return (int) Arrays.stream(freq).map(Math::abs).sum();
   }

}

public class Anagram {
    public static void main(String[] args) throws IOException {
    	String a = "abc";
    	String b = "cde";
        int res = AnagramResult.makeAnagram(a, b);
        System.out.println("res="+res);
    }
}

