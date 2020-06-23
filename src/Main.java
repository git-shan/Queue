import java.util.Random;

public class Main {

    private static double testQueue(Queue<Integer>q, int opCount){
        long startTime =System.nanoTime();
        Random random = new Random();
        for (int i = 0; i<opCount; i++ )
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        for (int i=0; i<opCount; i++)
            q.dequeue();
        long endTime =System.nanoTime();
        return (endTime - startTime) /1000000000.0;
    }
    private static double testStack(Stack<Integer>q, int opCount){
        long startTime =System.nanoTime();
        Random random = new Random();
        for (int i = 0; i<opCount; i++ )
            q.push(random.nextInt(Integer.MAX_VALUE));
        for (int i=0; i<opCount; i++)
            q.pop();
        long endTime =System.nanoTime();
        return (endTime - startTime) /1000000000.0;
    }
    public static void main(String[] args) {
        ArrayQueue<Integer> aq= new ArrayQueue<>();
        ArrayStack<Integer> stack = new ArrayStack<>();
        LoopQueue<Integer> bq = new LoopQueue<>();
        int opCount = 100000;

        double time = testQueue(bq,opCount);
        System.out.println("LoopQue time:" +time +"s");

        time = testStack(stack,opCount);
        System.out.println("Array Stack time:" +time +"s");

        time = testQueue(aq,opCount);
        System.out.println("ArrayQue time:" +time +"s");
	// write your code here
        for (int i =0;i<5; i++){
            aq.enqueue(i);
            System.out.println(aq);
        }
        for (int i =0;i<5; i++){
            aq.dequeue();
            System.out.println(aq);
        }

        System.out.println(aq.isEmpty());


        for (int i =0;i<15; i++){
            bq.enqueue(i);
            System.out.println(bq);
        }
        for (int i =0;i<15; i++){
            bq.dequeue();
            System.out.println(bq);
        }

        System.out.println(bq.isEmpty());
    }
}
