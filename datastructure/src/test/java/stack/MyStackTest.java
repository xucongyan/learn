package stack;

import org.junit.Test;

/**
 * @author xucongyan
 */
public class MyStackTest {

    @Test
    public void testMyStack() {
        MyStack myStack = new MyStack(5);

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);

        System.out.println(myStack.peek());

        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }
    }

    @Test
    public void testStack() {
        Stack stack = new Stack(3);
        stack.push(1);
        //System.out.println(stack.peek());
        stack.push(2);
        stack.push(3);
        stack.push("abc");
        assert stack.peek().equals("abc");
        //System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        assert stack.peek().equals("1");
        //System.out.println(stack.peek());
    }

    @Test
    public void testStringReversal() {
        String str = "hello world";

        Stack stack = new Stack();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
