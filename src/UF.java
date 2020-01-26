public class UF {

    private int[] quickFindArray;
    private int[] quickUnionArray;

    public UF(int N)
    {
        quickFindArray = new int[N];
        quickUnionArray = new int[N];
        for(int i = 0; i < N; i++){
            quickFindArray[i] = i;
            quickUnionArray[i] = i;
        }
    }
    public boolean connected(int p, int q){

        return (this.quickFindArray[p] == this.quickFindArray[q]);
    }

    public void union(int p, int q){
        int temp = quickFindArray[p];
        for (int i = 0; i < quickFindArray.length; i++) {
            if(quickFindArray[i] == temp){
                quickFindArray[i] = quickFindArray[q];
            }
        }
    }

    public int root(int id, int[] array)
    {
        while(array[id] != id) id = array[id];
        return id;
    }

    public boolean quConnected(int p, int q)
    {
        return root(p, quickUnionArray) == root(q, quickUnionArray);
    }

    public void quUnion(int p, int q)
    {
        int pid = root(p, quickUnionArray);
        int qid = root(q, quickUnionArray);

        quickUnionArray[pid] = qid;
    }
}
