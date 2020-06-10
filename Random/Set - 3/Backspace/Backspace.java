import java.util.*;
public class Solution {
      public static String backspace(String s){
      	  Stack<Character> stack = new Stack<>();
          for(int i=0; i<s.length(); i++) {
              if(s.charAt(i) != '#') {
                  stack.push(s.charAt(i));
              } else if(!stack.isEmpty()) {
                  stack.pop();
              }
          }
          
          String res = "";
          while(!stack.isEmpty()) {
              res = stack.pop() + res;
          }
          
          return res;
      }
}
