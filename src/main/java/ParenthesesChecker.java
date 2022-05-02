import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ParenthesesChecker {


    public ParenthesesChecker(){
    }
    public boolean checkParentheses(String string){

        List<Character> openingBrackets = Arrays.asList('(', '<', '{', '[');
        List<Character> closingBrackets = Arrays.asList(')', '>', '}', ']');
        Stack<Character> foundOpeningBrackets = new Stack<>();

        for (Character letter : string.toCharArray()){
            if (openingBrackets.contains(letter)) {
                foundOpeningBrackets.push(letter);
            }
            if (closingBrackets.contains(letter)) {
                if (foundOpeningBrackets.isEmpty() || openingBrackets.indexOf(foundOpeningBrackets.peek()) != closingBrackets.indexOf(letter)) {
                    return false;
                }
                foundOpeningBrackets.pop();
            }
        }
        return foundOpeningBrackets.isEmpty();
    }
}
