package pr8;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;

    public WaitList(){
        content = new ConcurrentLinkedQueue<>();
    }
    public WaitList(ConcurrentLinkedQueue<E> content){
        this.content = content;
    }
    public void add(E element){
        content.add(element);
    }
    public E remove(){
        return content.remove();
    }
    public boolean contains(E element){
        return content.contains(element);
    }
    public boolean containsAll(Collection<E> c){
        return content.containsAll(c);
    }
    public boolean isEmpty(){
        return content.isEmpty();
    }

    @Override
    public String toString() {
        return "WaitList{ " +
                "content=" + content +
                '}';
    }
    public static void main(String[] args) {
        WaitList<Integer> list = new WaitList<>();

        System.out.println("Пуст?   " + list.isEmpty());

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        System.out.println("Пуст?   " + list.isEmpty());

        System.out.println(list);

        list.remove();
        list.remove();
        list.remove();

        System.out.println(list);
    }
}
