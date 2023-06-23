class Solution {
    static int leastInterval(int n, int K, char tasks[]) {
        // code here
        
        // Declareing the counter  to keep tarak the tasks
        int[] counter = new int[26];
        // max to sotre the          
        int max = 0;
        // maxCount to  count the tasks 
        
        int maxCount = 0;

        // For Each loop iterating over the tasks and adding to the counter array
        for (char task : tasks) {
            counter[task - 'A']++;
            
            // If max equal to couter task we will incress the maxcounter 

            if (max == counter[task - 'A']) {
                maxCount++;
            } 
            
            // here assing the couter task to max and maxCount is 1;
            else if (max < counter[task - 'A']) {
                max = counter[task - 'A'];
                maxCount = 1;
            }
        }

        int partCount = max - 1;
        int partLength = K - (maxCount - 1);
        int emptySlots = partCount * partLength;
        int availableTasks = tasks.length - max * maxCount;
        // calculating the ideal time 
        int idles = Math.max(0, emptySlots - availableTasks);
        return tasks.length + idles;
    }
}
