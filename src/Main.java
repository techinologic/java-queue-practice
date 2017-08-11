import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Paopao on 08/10/17.
 */
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
