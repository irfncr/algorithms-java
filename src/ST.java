public class ST <Key, Value> {
    int N = 0;
    public ST(){

    }
    public void put(Key key, Value value){

    }
    public Value get(Key key){
        if (isEmpty() == true) return null;
        else return null;
    }
    public void delete(Key key){
        put(key, null);
    }
    public boolean contains(Key key){
        return get(key) != null;
    }
    public boolean isEmpty(){
        return true;
    }
    public int size(){
        return 0;

    }
    private int rank(Key key){
        int lo = 0, hi = N - 1;

        return lo;
    }

    public Iterable<Key> keys(){
        return null;
    }
}
