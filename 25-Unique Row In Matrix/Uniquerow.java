import java.util.*;

class GfG {
    public static ArrayList<ArrayList<Integer>> uniqueRow(int arr[][], int r, int c) {
        // ArrayList to store the ans in arraylis
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        // LinkedHashSet
        HashSet<ArrayList<Integer>> set = new LinkedHashSet<>();

        for (int i = 0; i < r; i++) {
            ArrayList<Integer> curr = new ArrayList<>();
            for (int j = 0; j < c; j++) {
                curr.add(arr[i][j]);
            }
            if (!set.contains(curr))
                set.add(curr);
        }
        for (ArrayList<Integer> x : set)
            ans.add(x);

        return ans;
    }
}