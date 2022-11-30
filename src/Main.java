import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Main {

    private static final List<String> NAMES = List.of(
            "Петр","Иван","Ирина","София","Михаил","Артем","Стас","Павел","Женя","Кенан","Влад","Серго");
    private static final Random RANDOM = new Random();
    private static final int MAX_SIZE=5;



    public static void main(String[] args) {
        Queue<String> queve1 = new ArrayDeque<>();
        Queue<String> queve2 = new ArrayDeque<>();
        randomFilling(queve1);
        randomFilling(queve2);
        System.out.println("Первая очередь " +queve1);
        System.out.println("Вторая очередь "+queve2);
        System.out.println();

        add("Сан Саныч", queve1,queve2);
        System.out.println("Первая очередь " +queve1);
        System.out.println("Вторая очередь "+queve2);
        System.out.println();

        remove(queve1,queve2);
        System.out.println("Первая очередь " +queve1);
        System.out.println("Вторая очередь "+queve2);
        System.out.println();
    }

    private static void add(String name, Queue<String> queue1,Queue<String> queue2) {
        if (queue1.size()==MAX_SIZE && queue2.size()==MAX_SIZE){
            System.out.println("Гаааляяя");

        }
        if (queue1.size()<queue2.size()){
            queue1.offer(name);
        } else if (queue2.size() < queue1.size()){
            queue2.offer(name);
        }
    }

    private static void remove(Queue<String> queue1, Queue<String> queue2) {
        if (RANDOM.nextBoolean()){
            queue1.poll();
        } else  {
            queue2.poll();
        }
    }

    private static void randomFilling(Queue<String> queue) {
        int size = RANDOM.nextInt(MAX_SIZE+1);
        for (int i = 0; i<size;i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));
        }
    }
}