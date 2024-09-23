import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> students = new HashSet<>(30);
        for (int i = 1; i < 31; i++) students.add(i);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i< 28; i++) students.remove(sc.nextInt());
        students.stream().sorted().forEach(System.out::println);
    }
}
