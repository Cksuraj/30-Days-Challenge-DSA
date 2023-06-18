
import java.util.*;

class ticketcounter {

    // 1 st mathod using two pointer APPROACH

    public static int distributeTicket1(int N, int K) {
        int st = 1;
        int end = N;

        while (st < end) {
            int time = K;

            while (st < end && time-- > 0)
                st++;
            time = K;
            while (st < end && time-- > 0)
                end--;
            time = K;
        }
        return st;
    }

    // 2nd Mathod using DQ
    public static int distributeTicket2(int N, int K) {

        // Doubble ended Queue data Structure

        ArrayDeque<Integer> ad = new ArrayDeque<>();

        // adding in double endded queue;

        for (int i = 1; i <= N; i++) {
            ad.add(i);
        }

        int flag = 0;
        int curr = 0;
        while (!ad.isEmpty()) {
            int time = 0;
            if (flag == 0) {

                // as we know we are traversing the loop to

                while (!ad.isEmpty() && time < K) {
                    // pollFirst to remove from starting
                    curr = ad.pollFirst();
                    time++;
                }
            }

            else {
                while (!ad.isEmpty() && time < K)

                {
                    // pollLast to remove from last
                    curr = ad.pollLast();
                    time++;
                }
            }
            flag = flag == 0 ? 1 : 0;
        }

        return curr;
    }
}
