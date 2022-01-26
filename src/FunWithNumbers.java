
public class FunWithNumbers {

    public static int max2sum(int[] a) {
        // return sum of largest two numbers
        // if empty, return zero
        // if one element, return that element
        // if null, throw IAE

        if (a == null) throw  new IllegalArgumentException();
        if (a.length == 0) return 0;
        if (a.length == 1) return a[0];

        java.util.Arrays.sort(a);
        return a[a.length-1] + a[a.length-2];
    }

    public static int sum(int[] a) {
        // returns sum of all elements
        // if empty, return 0
        // if null, throw IAE

        if (a == null) throw new IllegalArgumentException();
        if (a.length == 0) return 0;

        int sum = 0;
        for (int i : a) {
            sum = sum + i;
        }
        return sum;
    }

    public static boolean sumToN(int[] a, int n) {
        // returns true if any two elements of a sum to n
        // if a is empty, return false
        // if a is null, throw IAE

        if (a == null) throw new IllegalArgumentException();
        if (a.length == 0) return false;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i==j) continue;
                if (a[i] + a[j] == n) return true;
            }
        }
        return false;
    }

}