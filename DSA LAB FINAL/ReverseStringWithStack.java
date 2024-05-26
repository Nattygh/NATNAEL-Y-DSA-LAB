import java.util.*;

public class ReverseStringWithStack {
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }
        return reversedString.toString();
    }

    public static void main(String[] args) {
        String input = "HELLO";
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }
}
