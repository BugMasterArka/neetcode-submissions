class Solution {
    public boolean isNumeric(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String i: tokens){
            if(isNumeric(i)){
                stack.push(Integer.parseInt(i));
            }else{
                int b = stack.pop();
                int a = stack.pop();
                if(i.charAt(0)=='+')
                    stack.push(a+b);
                else if(i.charAt(0)=='-')
                    stack.push(a-b);
                else if(i.charAt(0)=='*')
                    stack.push(a*b);
                else
                    stack.push((int)Math.floor(a/b));
            }
        }
        return stack.pop();
    }
}
