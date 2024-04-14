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
        return new LinkedListIterator<>(this.first);
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
            nuevo = new LinearNode<>(t);
        } catch (Exception e) {
            return false;
        }
        if (this.first == null) {
            this.first = nuevo;
            this.count = 1;
            return true;
        }
        LinearNode<T> search = searchAt(this.count);
        search.next = nuevo;
        this.count++;
        return true;
    }

    public boolean addAt(int index, T t) {
        if (index < 0 || this.count < index) {
            return false;
        }
        if (index == 0) {
            addFirst(t);
            return true;
        } else if (index == this.count) {
            addLast(t);
            return true;
        }
        try {
            LinearNode<T> nuevo = new LinearNode<T>(t);
            LinearNode<T> search = searchAt(index);
            nuevo.next = search.next;
            search.next = nuevo;
            this.count++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private LinearNode<T> searchAt(int index) {
        int i = 0;
        LinearNode<T> search = this.first;
        while (i < index - 1) {
            search = search.next;
            i++;
        }
        return search;
    }

    public T findAt(int index) {
        if (index < 0 || this.count < index) {
            return null;
        }
        int i = 0;
        LinearNode<T> search = this.first;
        while (search != null && i < index) {
            search = search.next;
            i++;
        }
        return search.element;
    }

    public boolean remove(T target) {
        boolean res = false;
        while (this.first != null && this.first.element.equals(target)) {
            this.first = this.first.next;
            this.count--;
            res = true;
        }
        LinearNode<T> search = this.first;
        while (search != null) {
            if (search.next != null && search.next.element.equals(target)) {
                search.next = search.next.next;
                this.count--;
                res = true;
            } else {
                search = search.next;
            }
        }
        return res;
    }

    public boolean removeAt(int index) {
        if (index < 0 || this.count < index) {
            return false;
        }
        if (index == 0) {
            this.first = this.first.next;
            this.count--;
            return true;
        }
        LinearNode<T> target = searchAt(index);
        target.next = target.next.next;
        this.count--;
        return true;
    }

    public boolean contains(Object element) {
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
        if (this.first.element.equals(target)) {
            return this.first.element;
        }
        LinearNode<T> search = this.first.next;
        while (!search.element.equals(target)) {
            if (search.next == null) {
                return null;
            }
            search = search.next;
        }
        return search.element;
    }

    public void imprimir() {
        LinearNode<T> current = this.first;
        while (current != null) {
            System.out.println(current.element.toString());
            current = current.next;
        }
    }

    public int size() {
        return this.count;
    }
}
