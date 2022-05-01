import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ParenthesesChecker {


    public ParenthesesChecker(){
    }
    public boolean checkParentheses(String string){

        String[] letters = string.split("");
        List<Character> openingBrackets;
        List<Character> closingBrackets;

        openingBrackets = Arrays.asList('(', '<', '{', '[');
        closingBrackets = Arrays.asList(')', '>', '}', ']');
        int openingBracketsCount = 0;
        int closingBracketsCount = 0;

        for (String letter : letters){
            if (openingBrackets.contains(letter)) {
                openingBracketsCount++;
            }
            if (closingBrackets.contains(letter)) {
                closingBracketsCount++;
            }
            if (closingBracketsCount > openingBracketsCount){
                return false;
            }
        }

        if (openingBracketsCount != closingBracketsCount){
            return false;
        } else return true;
    }
}
