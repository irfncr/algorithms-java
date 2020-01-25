import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int N = 0;
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        UF uf = new UF(N);
        while (input.hasNextInt())
        {
            int p = input.nextInt();
            int q = input.nextInt();
            if(!uf.connected(p,q)) {
                uf.union(p,q);
                System.out.println(p + " " + q + " is connected now.");
            }else{
                System.out.println(p + " " + q + " is connected");
            }
        }
        System.out.println("Hello World!");
    }
}
