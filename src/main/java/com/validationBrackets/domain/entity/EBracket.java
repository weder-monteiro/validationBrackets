package com.validationBrackets.domain.entity;

import lombok.Getter;
import lombok.Setter;
import java.util.Stack;

@Getter
@Setter
public class EBracket {

    private String value;

    public boolean isValid() {
        Stack<Character> stack = new Stack<>();

        for(char c : value.toCharArray()) {
            if(c == '{' || c == '(' || c == '[') {
                stack.push(c);
            }else {
                if(stack.isEmpty()) {
                    return false;
                }
                if(c == '}' && stack.pop() != '{') {
                    return false;
                }
                if(c == ')' && stack.pop() != '(') {
                    return false;
                }
                if(c == ']' && stack.pop() != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

}
