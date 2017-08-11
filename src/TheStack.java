import java.util.*;


public class TheStack {

        private String[] stackArray;

        Stack<E> stack = new Stack<E>();

        List list = new ArrayList(); // raw type List

    list.add







        private int stackSize;

        private int topOfStack = -1;

        TheStack (int size) {
            stackSize = size;
            stackArray = new String[size];
            Arrays.fill(stackArray, "-1");
        }

        public void push(String input) {
            if (topOfStack + 1 < stackSize) {
                topOfStack++;
                stackArray[topOfStack] = input;
            } else {
                System.out.println("Sorry but the stack is full.");
            }

            System.out.println("Push " + input + " was added to the stack");
        }

        public static void main(String[] args) {

        }


}
