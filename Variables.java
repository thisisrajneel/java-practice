import java.util.*;

public class Variables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; ++i) {
            // n-i spaces before data
            for(int k=1; k<=n-i; ++k) {
                System.out.print(' ');
            }
            //data
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }

        sc.close();
    }
}
