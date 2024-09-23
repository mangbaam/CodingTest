import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int[] alpha = new int[26];
        for (int i = 0; i < word.length(); i++) {
            alpha[word.charAt(i) - 'a']++;
        }
        System.out.print(String.join(" ", Arrays.stream(alpha).mapToObj(String::valueOf).toArray(String[]::new)));
    }
}
