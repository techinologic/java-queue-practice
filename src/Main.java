import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(4);
        queue.add(5);

        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
            System.out.println("Size: " + queue.size());
        }
    }
}



