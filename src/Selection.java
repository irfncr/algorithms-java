import java.util.Comparator;

public class Selection {
    public static void sort(Comparable[] a){

        int N = a.length;

        for (int i = 0; i < a.length; i++){
            int min = i;
            for(int j = i+1; i < a.length; j++){
                if(less(a[j], a[i])){
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }

    public static void sort(Object[] a, Comparator comparator){

        int N = a.length;

        for (int i = 0; i < a.length; i++){
            int min = i;
            for(int j = i+1; i < a.length; j++){
                if(less(comparator, a[j], a[i])){
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }

    public static void exch(Object[] a, int i, int j){
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static boolean less (Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    public static boolean less (Comparator c, Object v, Object w){
        return c.compare(v,w) < 0;
    }

    public static boolean isSorted (Comparable []a){
        for(int i = 1; i < a.length; i++){
            if(less(a[i], a[i-1]))
                return false;
        }
        return true;
    }
}
