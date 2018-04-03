public class Merge {
    private static Comparable[] aux ;
    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length-1);
    }
    private static void sort(Comparable[] a, int lo, int hi){

    }
    public static void merge(Comparable[] a, int lo, int mid, int hi){
        for (int i = 0; i<a.length; i++){
            aux[i] = a[i];
        }
        mid = lo + (hi - lo)/2;

    }
}
