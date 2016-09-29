package ua.com.serzh;


import java.util.Arrays;

/**
 * Created by Oleg on 11/20/2015.
 */
public class Merger {
    public static void main(String[] args) {
        int[] f = {1,3,5,2};
        int[] s = {7,4};
        int[] a = Merger.merge(f, s);
        for (int i : a) {
            System.out.println(i);
        }

        Merger.proba("F", "S");
    }

    public static void proba(String... args) {
        for (String s : args) {
            System.out.println(s);
    }

    }
    public static int[] merge(int[] fst, int[] snd) {
        int[] ans = new int[fst.length + snd.length];
        for (int i = 0; i < fst.length; i++) {
            ans[i] = fst[i];
        }
        for (int i = 0; i < snd.length; i++) {
            ans[fst.length + i] = snd[i];
        }
        Arrays.sort(ans);
//        int[] thd = arrays.stream(ans).sorted().toArray();
        return ans;
    }

    /*public static int[] merge1(int[] fst, int[] snd) {
        int[] last = new int[fst.length + snd.length];
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < fst.length; i++) {
            arrayList.add(fst[i]);
        }
        for (int i = 0; i < snd.length; i++) {
            arrayList.add(snd[i]);
        }
        collections.sort(arrayList);
        for (int i = 0; i < last.length; i++) {
            last[i] = arrayList.get(i);
        }
        return last;
    }

    public static int[] divisibleBy(int[] numbers, int divider) {
        int[] ans = arrays.stream(numbers).filter(i -> (i % divider) == 0).toArray();
        return ans;
    }*/
}


/*import java.util.ArrayList;
import java.util.collections;
//import java.util.arrays;
public class Merger {

       public static int[] merge(int[] fst, int[] snd) {
            //2-nd version, короче, но выдает ошибку, хотя в идее все работает, ну и фиг с ним...
       /* int[] ans = new int[fst.length + snd.length];
        for (int i = 0; i < fst.length; i++) {
            ans[i] = fst[i];
        }
        for (int i = 0; i < snd.length; i++) {
            ans[fst.length + i] = snd[i];
        }
        int[] thd = arrays.stream(ans).sorted().toArray();
        return thd;*/


   /* public static int[] merge(int[] fst, int[] snd) {
        int[] last = new int[fst.length + snd.length];
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < fst.length; i++) {
            arrayList.add(fst[i]);
        }
        for (int i = 0; i < snd.length; i++) {
            arrayList.add(snd[i]);
        }
        collections.sort(arrayList);
        for (int i = 0; i < last.length; i++) {
            last[i] = arrayList.get(i);
        }
        return last;
    }
}
*/