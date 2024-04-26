/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public class TablaHash<K,V> {
    private HashMap<K,LinkedList<V>> map;

    public TablaHash(){
        this.map = new HashMap<>();
    }

    private boolean addKey(K key){
        return this.map.put(key, new LinkedList<>()) == null;
    }

    public boolean addValue(K key, V value){
        if (!this.map.containsKey(key)) {
            addKey(key);
        }
        return this.map.get(key).add(value);
    }

    public boolean removeKey(K key){
        return this.map.remove(key) != null;
    }

    public boolean removeValue(K key, V value){
        return this.map.get(key).remove(value);
    }

    public LinkedList<V> getValues(K key){
        return this.map.get(key);
    }

    public Set<K> getKeys(){
        return this.map.keySet();
    }

    public int sizeValues(K key){
        return this.map.get(key).size();
    }
}

