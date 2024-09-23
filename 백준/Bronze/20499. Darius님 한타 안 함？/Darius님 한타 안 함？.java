import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.next().split("/")).mapToInt(Integer::parseInt).toArray();
        if (arr[1] == 0 || arr[0] + arr[2] < arr[1]) System.out.print("hasu");
        else System.out.print("gosu");
    }
}
