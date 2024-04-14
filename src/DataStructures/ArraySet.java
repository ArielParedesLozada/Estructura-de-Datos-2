package DataStructures;

import java.util.Arrays;
import java.util.Iterator;

public class ArraySet<T> implements Iterable<T>{
    private T[] set;
    private int count;

    public ArraySet() {
        this.set = (T[]) new Object[5];
        this.count = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return Arrays.asList(set).iterator();
    }

    private void expand() {
        T[] nuevo = (T[]) new Object[this.count + 5];
        for (int i = 0; i < this.set.length; i++) {
            nuevo[i] = this.set[i];
        }
        this.set = nuevo;
    }

    private void trim() {
        T temp;
        for (int i = 0; i < this.count; i++) {
            if (this.set[i] == null) {
                temp = this.set[i];
                this.set[i] = this.set[i+1];
                this.set[i+1] = temp;
            }
        }
    }

    public void add(T element) {
        if (this.count == this.set.length) {
            expand();
        }
        this.set[this.count] = element;
        this.count++;
    }

    public void addAt(int index, T element){
        if (index < 0 || index > this.count) {
            return;
        }
        if (this.count == this.set.length) {
            expand();
        }
        T temp = this.set[index];
        this.set[index] = element;
        this.set[this.count] = temp;
        this.count ++;
    }

    public boolean remove(T element) {
        for (int i = 0; i < this.count; i++) {
            if (this.set[i].equals(element)) {
                this.set[i] = null;
                this.count--;
                trim();
                return true;
            }
        }
        return false;
    }

    public boolean contains(T element) {
        for (int i = 0; i < this.count; i++) {
            if (this.set[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public T find(Object element){
        for (int i = 0; i < this.count; i++) {
            if (this.set[i].equals(element)) {
                return this.set[i];
            }
        }
        return null;
    }

    public void imprimir(){
        for (int i = 0; i < this.count; i++) {
            System.out.println(this.set[i]);
        }
    }
    
    public int size() {
        return this.count;
    }
}
