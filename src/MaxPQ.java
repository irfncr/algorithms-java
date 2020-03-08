import java.util.PriorityQueue;

public class MaxPQ<Key extends Comparable<Key>> {


    private int N;
    private Key[] pq;


    public MaxPQ(int capacity){
        pq = (Key[]) new Comparable[capacity+1];
    }

    public void insert(Key v){
        pq[++N] = v;
        swim(N);
    }

    public void sink(int k){
        while(2 * k < N){
            int j = 2 * k;
            if(j < N && less(j,j+1)) j++;
            if(!less(k,j)) break;
            exch(k,j);
            k = j;
        }
    }

    public void swim(int k){
        while (k > 0 && less(k/2, k) ){
            exch(k/2,k);
            k = k/2;
        }
    }

    public boolean less(int i, int j){
        return pq[i].compareTo(pq[j]) < 0;
    }

    public void exch(int i, int j){
        Key t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }

    public Key delMax(){
        Key max = pq[1];
        exch(1, N--);
        sink(1);
        pq[N+1] = null;
        return max;
    }

    public boolean isEmpty(){
        return N == 0;
    }
}
