import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int N = 0;
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
        StackOfStrings myStack = new StackOfStrings();
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
