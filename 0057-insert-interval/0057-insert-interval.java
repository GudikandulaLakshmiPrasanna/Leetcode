class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
       List<int []> ans = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        //first add all intervals as it is that comes before the newInterval
        while(i < n && (intervals[i][1] < newInterval[0])){
            ans.add(intervals[i]);
            i++;
        }   
        //now you got at correct position for newInterval
        //now considering newInterval check all the intervals that are overlapping with this newInterval and merge them and form a range
        while(i < n && (intervals[i][0] <= newInterval[1])){
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        //then add the merged interval if formed due to adding of newInterval
        ans.add(newInterval);
        //now all the intervals that are at the right side of newInterval they dont need to changed beacuse question already have non overlapping intervals so add them as it is
        while(i < n){
            ans.add(intervals[i]);
            i++;
        }
        //convert arraylist to 2d array and return
        return ans.toArray(new int[ans.size()][]);
    }
}