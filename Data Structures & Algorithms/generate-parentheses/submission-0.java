class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> out = new ArrayList<>();
        dfs(0,0,out,"",n);
        return out;
    }
    public void dfs(int open, int close, List<String> out,String cur,int n){
        if(open==n && close==n){
            out.add(cur);
            return;
        }   
        else{
            if(open<n) dfs(open+1,close,out,cur.concat("("),n);
            if(close<open) dfs(open,close+1,out,cur.concat(")"),n);
        }
    }
}
