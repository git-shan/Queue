public class ArrayQueue<E> implements Queue<E>{
    private Array <E> que;
    public ArrayQueue(int capacity) {
        que = new Array<>(capacity);
    }
    public ArrayQueue(){
        que = new Array<>();
    }

    @Override
    public void enqueue(E e){
        que.addLast(e);
    }
    @Override
    public int getSize(){
        return que.getSize();
    }

    @Override
    public E dequeue(){
        return que.removeFirst();
    }

    public int getCapacity(){
        return que.getCapacity();
    }

    @Override
    public boolean isEmpty(){
        return que.isEmpty();
    }

    @Override
    public E getFront(){
        return que.getFirst();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Queue: ");
        res.append("front [");
        for(int i =0; i< que.getSize(); i++){
            res.append(que.get(i));
            if(i !=que.getSize()-1 )
                res.append(",");
        }
        res.append("] tail");
        return  res.toString();
    }
}
