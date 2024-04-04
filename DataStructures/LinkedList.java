package DataStructures;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
    private int count;
    private LinearNode<T> first;

    public LinkedList() {
        this.first = null;
        this.count = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<T>(this.first);
    }

    private LinearNode<T> search(int index){
        if (index < 0 || this.count < index) {
            return null;
        }
        LinearNode<T> current = this.first;
        int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }
        return current;
    }

    public boolean add(T t) {
        LinearNode<T> nuevo;
        try {
            nuevo = new LinearNode<T>(t);
        } catch (Exception e) {
            return false;
        }
        if (this.first == null) {
            this.first = nuevo;
            this.count = 1;
            return true;
        }
        nuevo.next = this.first.next;
        this.first.next = nuevo;
        this.count++;
        return true;
    }

    public boolean addFirst(T t) {
        LinearNode<T> nuevo;
        try {
            nuevo = new LinearNode<T>(t);
        } catch (Exception e) {
            return false;
        }
        nuevo.next = this.first;
        this.first = nuevo;
        this.count++;
        return true;
    }

    public boolean addLast(T t) {
        LinearNode<T> nuevo;
        try {
            nuevo = new LinearNode<T>(t);
        } catch (Exception e) {
            return false;
        }
        if (this.first == null) {
            this.first = nuevo;
            this.count = 1;
            return true;
        }
        LinearNode<T> search = search(this.count-1);
        search.next = nuevo;
        this.count++;
        return true;
    }

    public boolean addAt(int index, T t) {
        if (index < 0 || this.count < index) {
            return false;
        }
        if (index == 0) {
            return addFirst(t);
        } else if (index == this.count) {
            return addLast(t);
        }
        LinearNode<T> nuevo;
        try {
            nuevo = new LinearNode<T>(t);
        } catch (Exception e) {
            return false;
        }
        LinearNode<T> search = search(index - 1);
        nuevo.next = search.next;
        search.next = nuevo;
        this.count++;
        return true;
    }

    public boolean remove(T t) {
        boolean found = false;
        while (this.first != null && this.first.element.equals(t)) {
            this.first = this.first.next;
            this.count --;
            found = true;
        }
        LinearNode<T> current = this.first;
        while (current != null) {
            if (current.next != null && current.next.element.equals(t)) {
                current.next = current.next.next;
                this.count --;
                found = true;
            } else {
                current = current.next;
            }
        }
        return found;
    }

    public boolean contains(T element) {
        LinearNode<T> target = this.first;
        while (target != null) {
            if (target.element.equals(element)) {
                return true;
            }
            target = target.next;
        }
        return false;
    }

    public T find(Object target) {
        LinearNode<T> search = this.first;
        while (search != null) {
            if (search.element.equals(target)) {
                return search.element;
            }
            search = search.next;
        }
        return null;
    }

    public void imprimir() {
        LinearNode<T> current = this.first;
        while (current != null) {
            System.out.println(current.getElement().toString());
            current = current.getNext();
        }
    }

    public int size() {
        return this.count;
    }
}
