import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int N = 0;

        while(N<60){
            java.awt.Toolkit.getDefaultToolkit().beep();
            try {
                Thread.sleep(45000); // introduce delay
            } catch (InterruptedException e) { }
            java.awt.Toolkit.getDefaultToolkit().beep();
            try {
                Thread.sleep(15000); // introduce delay
            } catch (InterruptedException e) { }
            N++;
        }
        Scanner input = new Scanner(System.in);
        /*
        N = input.nextInt();
        UF uf = new UF(N);
        while (input.hasNextInt())
        {
            int p = input.nextInt();
            int q = input.nextInt();
            if(!uf.quConnected(p,q)) {
                uf.quUnion(p,q);
                System.out.println(p + " " + q + " is connected now.");
            }else{
                System.out.println(p + " " + q + " is connected");
            }
        }*/
        QueueOfStrings myQueue = new QueueOfStrings();
        Stack<String> myStack = new Stack<String>();
        while(input.hasNext()){
            String s = input.next();
            if(s.equals("-")){
                System.out.println(myQueue.dequeue());
            }
            else{
                myQueue.enqueue(s);
            }
        }


    }
}
