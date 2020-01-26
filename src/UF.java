public class UF {

    private int[] quickFindArray;
    public UF(int N)
    {
        for(int i = 0; i < N; i++){
            quickFindArray[i] = i;
        }
    }
    public boolean connected(int p, int q){

        return quickFindArray[p] == quickFindArray[q];
    }

    public void union(int p, int q){
        int temp = quickFindArray[p];
        for (int i = 0; i < quickFindArray.length; i++) {
            if(quickFindArray[i] == temp){
                quickFindArray[i] = quickFindArray[q];
            }
        }
    }
}
