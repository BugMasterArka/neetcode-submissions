class Solution {
    public boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        int[] alphabet = new int[26];
        for(int i=0;i<s1.length();i++){
            alphabet[s1.charAt(i)-'a']++;
            alphabet[s2.charAt(i)-'a']--;
        }
        for(int i: alphabet){
            if(i!=0)
                return false;
        }
        return true;
        
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        List<String> visited = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            if(!visited.contains(strs[i])){
                List<String> out = new ArrayList<>();
                out.add(strs[i]);
                visited.add(strs[i]);
                for(int j=i+1;j<strs.length;j++){
                    if(isAnagram(strs[i],strs[j])){
                        out.add(strs[j]);
                        visited.add(strs[j]);
                    }
                }
                result.add(out);
            }
        }
        return result;
    }
}
