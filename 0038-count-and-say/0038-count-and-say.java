class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for (int j = 2; j <= n; j++) {
            String nS = "";
            int count = 1;
            for (int i = 0; i < s.length(); i++) {
                if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                    count++;
                } else {
                    nS += String.valueOf(count) + s.charAt(i);
                    count = 1;
                }
            }
            s = nS;
        }

        return s;
    }
}