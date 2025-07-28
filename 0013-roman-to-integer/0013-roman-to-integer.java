class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int last = 0;
        for(int i =s.length()-1;i>=0;i--){
            int value = 0;
            char ch = s.charAt(i);
            switch(ch){
            case 'I':value = 1;break;
            case 'V':value = 5;break;
            case 'X':value = 10;break;
            case 'L':value = 50;break;
            case 'C':value = 100;break;
            case 'D':value = 500;break;
            case 'M':value = 1000;break;
            }
        
            if(value < last){
                 total-=value;
            }else{
                total+=value;
            }
            last = value;
        }
    
        return total;     
        
    }
}