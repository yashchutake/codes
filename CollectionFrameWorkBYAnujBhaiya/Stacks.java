package CollectionFrameWorkBYAnujBhaiya;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("cat");
        stack.push("dog");
        stack.push("hourse");

        System.out.println(stack);
        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        
    }
}
