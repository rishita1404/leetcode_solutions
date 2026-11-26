class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String s:tokens){
            if(s.equals("+")){
                int b=stack.pop();
                int a=stack.pop();
                stack.push(a+b);
            }
            else if(s.equals("-")){
                int b=stack.pop();
                int a=stack.pop();
                stack.push(a-b);
            }
            else if(s.equals("*")){
                int b=stack.pop();
                int a=stack.pop();
                stack.push(a*b);
            }
            else if(s.equals("/")){
                int b=stack.pop();
                int a=stack.pop();
                stack.push(a/b);
            }
            else{
                int a=Integer.parseInt(s);
                stack.push(a);
            }
        }
        return stack.pop();
    }
}