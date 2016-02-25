import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class findDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int numLength = String.valueOf(n).length();
            int counter = 0;
            for (int i = 0; i < numLength; i++) {
                if (Character.getNumericValue(String.valueOf(n).charAt(i)) != 0
                        && n%Character.getNumericValue(String.valueOf(n).charAt(i)) == 0) {
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}
