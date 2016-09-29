package ua.com.serzh;

/**
 * Created by serzh on 11/25/15.
 */
public class Quiz09 {
    public static void main(String[] args) {
        int[] ans = {3, 9, 1, 11};
        Quiz09.f(ans);
        int i = 23;
        int j = i >>> 1;
        System.out.println(j);
        System.out.println("Try");
//        System.out.println(arrays.toString(ans));
    }

    static void f(int[] arr) {
        for (int barrier = 1; barrier < arr.length; barrier++) {
            int newElement = arr[barrier];
            int location = barrier - 1;
            while (location >= 0 && arr[location] > newElement) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = newElement;
        }
    }
}