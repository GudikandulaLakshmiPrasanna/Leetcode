class Solution {
    public int findKthPositive(int[] arr, int k) {
        int index = 0;
        int missingcount = 0;
        for(int current = 1; ;current++){
            if(index < arr.length && arr[index]== current){
                index++;
            }else{
                missingcount++;
                if(missingcount == k){
                    return current;

                }
            }

        }
        
        
    }
}