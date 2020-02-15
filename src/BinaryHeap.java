public class BinaryHeap{

    private Comparable[] a;
    private int N;


    private void swim(int k){
        while (k > 1 && less(k/2,k)){
            exch(k,k/2);
            k = k / 2;
        }
    }

    private void sink(int k){
        while(2*k <= N){
            int j = 2*k;
            if(j < N && less(j,j+1))j++;
            if(!less(k,j)) break;
            exch(k,j);
            k = j;
        }

    }

    public void exch(int i, int j){
        Comparable temp = this.a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public boolean less (int v, int w){
        return this.a[v].compareTo(this.a[w]) < 0;
    }
}
