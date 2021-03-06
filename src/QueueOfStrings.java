public class QueueOfStrings {

    private Node first = null;
    private Node last = null;

    class Node{
        Node next;
        String item;
    }

    public boolean isEmpty(){ return first == null;}

    public void enqueue(String item){
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty())
            first = last;
        else
            oldlast.next = last;
    }

    public String dequeue(){
        // check whether queue is empty or not
        if (isEmpty())
            return null;
        String item = first.item;
        first = first.next;
        if (isEmpty())
            last = null;
        return item;
    }
}
