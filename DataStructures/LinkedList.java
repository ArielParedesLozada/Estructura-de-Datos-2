package DataStructures;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>{
    private int count;
    private LinearNode<T> first;

    public LinkedList(){
        this.first = null;
        this.count = 0;
    }

    public LinkedList(T element){
        this.first = new LinearNode<T>(element);
        this.count = 1;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<T>(this.first);
    }

    public void add(T t){
        LinearNode<T> nuevo = new LinearNode<T>(t);
        if (this.first == null) {
            this.first = nuevo;
            this.count = 1;
            return;
        }
        nuevo.next = this.first.next;
        this.first.next = nuevo; 
        this.count ++;       
    }

    public void addFirst(T t){
        LinearNode<T> nuevo = new LinearNode<>(t);
        nuevo.next = this.first;
        this.first = nuevo;
        this.count ++;
    }

    public void addLast(T t){
        LinearNode<T> nuevo = new LinearNode<>(t);
        if (this.first == null) {
            this.first = nuevo;
            this.count = 1;
            return;
        }
        LinearNode<T> search = this.first;
        while (search.next != null) {
            search = search.next;
        }
        search.next = nuevo;
        this.count++;
    }

    public void addAt(int index, T t){
        if (index < 0 || this.count < index) {
            return;
        }
        if (index == 0) {
            addFirst(t);
        } else if(index == this.count){
            addLast(t);
        } else {
            int i = 0;
            LinearNode<T> nuevo = new LinearNode<T>(t);
            LinearNode<T> search = this.first;
            while (i < index-1) {
                search = search.next;
                i++;
            }
            nuevo.next = search.next;
            search.next = nuevo;
            count ++;
        }
    }

    public boolean remove(T t){
        if (this.first.element.equals(t)) {
            this.first = this.first.next;
            count--;
            return true;
        }
        LinearNode<T> previous = this.first;
        LinearNode<T> target = previous.next;
        while (target != null) {
            if (target.element.equals(t)) {
                previous.next = target.next;
                this.count --;
                return true;
            }
            previous = target;
            target = target.next;
        }
        return false;
    }
    
    public boolean contains(T element){
        LinearNode<T> target = this.first;
        while (target != null) {
            if (target.element.equals(element)) {
                return true;
            }
            target = target.next;
        }
        return false;
    }

    public T find(Object target){
        LinearNode<T> search = this.first;
        while (search != null) {
            if (search.element.equals(target)) {
                return search.element;
            }
            search = search.next;
        }
        return null;
    }

    public void imprimir(){
        LinearNode<T> current = this.first;
        while (current != null) {
            System.out.println(current.getElement().toString());
            current = current.getNext();
        }
    }

    public int size(){
        return this.count;
    }
}
