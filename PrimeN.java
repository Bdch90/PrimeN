import java.util.Scanner;

public class PrimeN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number Prime numbers:");
        int max = scanner.nextInt();
        int count = 0;
        for ( int x = 2; x < 10000; x++)
        {
            boolean check = true;
            for ( int y = 2; y < Math.sqrt(x); y++)
            {
                if (x % y == 0)
                {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(x);
                count++;
            }
            if (count == max)
            {
                break;
            }
        }
    }
}
