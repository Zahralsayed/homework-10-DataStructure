package com.ga.Ex2;


import java.util.HashMap;
import java.util.Map;

public class ExpressionBalanceChecker {

    public boolean isValid(String s) {

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        SingleArrayStack stack = new SingleArrayStack(s.length());

        for (char c : s.toCharArray()) {

            if (map.containsValue(c)) {
                stack.push(c);
            }
            else if (map.containsKey(c)) {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if (map.get(c) != top) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }



    public static void main(String[] args) {

        ExpressionBalanceChecker checker = new ExpressionBalanceChecker();

        String[] tests = {
                "{[()]}",        // valid
                "{[(])}",        // invalid (wrong order)
                "((()))",        // valid
                "{[}",           // invalid (missing ])
                "[]{}()",        // valid
                "[({})]",        // valid
                "(",             // invalid
                ")",             // invalid
                "",              // valid (empty string)
                "{[()()]}",      // valid
                "{[()()]}}",     // invalid (extra closing)
                "{{{{",          // invalid
                "[{()}([])]"     // valid
        };

        for (String exp : tests) {
            System.out.println(
                    "Expression: " + exp +
                            " -> Balanced: " + checker.isValid(exp)
            );
        }

    }
}




