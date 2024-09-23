import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;
        for (int i = 0; i < 5; i++) if (N == sc.nextInt()) answer++;
        System.out.print(answer);
    }
}
