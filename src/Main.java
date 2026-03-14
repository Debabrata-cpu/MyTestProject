import java.util.Arrays;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        hasDuplicate("123");
        validAnagram("car", "racs");
        maxSubArray(new Integer[]{1, 2, 4, -1, -3, 5});

    }

    static void hasDuplicate(String s) {
        HashSet hs = new HashSet<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (hs.contains(c)) {
                System.out.println("Duplicates present");
                return;
            }
            hs.add(c);
        }
        System.out.println("no Duplicates");

    }

    static void validAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            System.out.println("Not valid anagram");
            return;
        }

        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int val : count) {
            if (val != 0) {
                System.out.println("not valid anagram");
                return;
            }
        }
        System.out.println("valid anagram");


    }

    // arr = {1,2,4,-1,-3,5}

    static int maxSubArray(Integer[] arr) {

        int totalSum = arr[0];
        int currentSum =arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (currentSum < 0) {
                currentSum = 0;
            }
            currentSum = currentSum + arr[i];
            if (currentSum > totalSum) {
                totalSum = currentSum;
            }


        }
        System.out.println("max sub array"+ totalSum);
        return totalSum;
    }


}