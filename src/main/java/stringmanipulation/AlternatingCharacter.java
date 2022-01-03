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

class Result {

    /*
     * Complete the 'alternatingCharacters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternatingCharacters(String s) {
    // Write your code here
    	int count = 0;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)) {
            	count = count+1;
            }
        }
        return count;
    }

}

public class AlternatingCharacter {
    public static void main(String[] args) throws IOException {
    	String s = "AABAAB";
    	int result = Result.alternatingCharacters(s);
    	System.out.println(result);
    }
}
