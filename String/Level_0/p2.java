//Leetcode problem of jewels and stones
class Solution{
    public int Count(String jewels, String stones){
        int count = 0;
        for(int i = 0; i<jewels.length(); i++){
            for(int j = 0; j<stones.length(); j++){
                if(jewels.charAt(i) ==stones.charAt(j)){
                    count++;
                }
            }
        }

            return count;
    }
}
class Test{
    public static void main(String[] args){
        String jewels = "aA";
        String stones = "aAAbbb";
        Solution s = new Solution();
        System.out.println(s.Count(jewels,stones));
        

    }
}