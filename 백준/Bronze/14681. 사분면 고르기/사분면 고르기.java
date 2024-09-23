import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int answer;
        if (X >= 0 && Y >= 0) {
            answer = 1;
        } else if (X <= 0 && Y >= 0) {
            answer = 2;
        } else if (X <= 0 && Y < 0) {
            answer = 3;
        } else {
            answer = 4;
        }
        System.out.println(answer);
    }
}
