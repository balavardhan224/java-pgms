package leetcode;
import java.util.Stack;

class StringToCharArrayExample2 {  
    public static void main(String[] args) {  
        String s="{[()]}";
        Stack<Character> sk=new Stack<>();
        sk.push('1');
        sk.push('2');
        System.out.println(sk);
        System.out.println(sk.peek());
        for(char c: s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                sk.push(c);
            }
            else if(c== ')' && sk.peek()==')' && !sk.empty()){
                sk.pop();
            }
            else if(c== ']' && sk.peek()==']' && !sk.empty()){
                sk.pop();
            }
            else if(c== '}' && sk.peek()=='}' && !sk.empty()){
                sk.pop();
            }
            else{
                System.out.println(false);
            }
        }
        if(sk.empty()){
            System.out.println(true);
        }
    }  
}