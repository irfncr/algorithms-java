import java.util.Iterator;



public class StackOfStrings <Item> implements Iterable {
    public Node first = null;


    public class Node {
        Node next;
        Item item;
    }

    public Iterator<Item> iterator() {
        return new ListIterator() {
        };
    }

    private class ListIterator implements Iterator<Item> {
            private Node current = first;

            @Override
            public boolean hasNext() {

            }

            @Override
            public Item next() {
                Item item = current.item;
                current = current.next;
                return item;
            }

            @Override
            public void remove() {
            }
    }


        public boolean isEmpty () {
            return first == null;
        }

        public void push (Item item){
            Node oldfirst = first;
            first = new Node();
            first.item = item;
            first.next = oldfirst;
        }
        public Item pop () {
            Item item = first.item;
            first = first.next;
            return item;
    }
}
