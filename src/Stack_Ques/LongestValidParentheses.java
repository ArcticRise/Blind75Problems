package Stack_Ques;

import java.util.*;
public class LongestValidParentheses {
    public static void main(String[] args){
        System.out.println(longestValidParentheses("()()()"));
    }
    public static int longestValidParentheses(String s) {
        int max_ans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i)=='('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.empty()){
                    stack.push(i);
                }else{
                    max_ans = Math.max(max_ans,i-stack.peek());
                }
            }
        }
        return max_ans;
    }
}
