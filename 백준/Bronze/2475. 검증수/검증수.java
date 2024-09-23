import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) nums[i] = sc.nextInt();
        System.out.println(Arrays.stream(nums).map(n -> n * n).sum() % 10);
    }
}
