package ua.com.serzh.hanoi;

/**
 * Created by serzh on 11/30/15.
 */
public class HanoiPodrobno {
    static int countPlay = 0;

    public static void main(String[] args) {
        playHanoi(3, "a1", "B", "C");
    }

    //move n disks from position "from" to "to" via "other"
    private static void playHanoi(int n, String from, String other, String to) {
        if (n == 0) {
            System.out.printf("finish Hanoi№: %s, count: %s \n", countPlay, n);
            return;
        }
        if (n > 0) {
            countPlay++;
            System.out.printf("playHanoi№: %s, count: %s \n",countPlay, n);
            playHanoi(n - 1, from, to, other);

            System.out.printf("Move one disk from pole %s to pole %s \n ", from, to);

            countPlay++;
            System.out.printf("playHanoi№: %s, count: %s \n",countPlay, n);
            playHanoi(n - 1, other, from, to);
        }
    }

}