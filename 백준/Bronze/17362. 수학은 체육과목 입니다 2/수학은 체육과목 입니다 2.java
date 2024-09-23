import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int answer = 0;
        switch ((int) (N % 8)) {
            case 1:
                answer = 1;
                break;
            case 0:
            case 2:
                answer = 2;
                break;
            case 3:
            case 7:
                answer = 3;
                break;
            case 4:
            case 6:
                answer = 4;
                break;
            case 5:
                answer = 5;
                break;
        }
        System.out.print(answer);
    }
}
