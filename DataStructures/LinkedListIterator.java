package DataStructures;

import java.util.Iterator;

public class LinkedListIterator<T> implements Iterator<T>{
    private LinearNode<T> head;

    protected LinkedListIterator(LinearNode<T> element){
        this.head = element;
    }

    @Override
    public boolean hasNext() {
        return this.head != null;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            return null;
        }
        T data = head.element;
        this.head = this.head.next;
        return data;
    }
}
