package br.com.blackjackaltbank.domain;

import java.util.ArrayList;
import java.util.Collections;

public class Stack<T> {

    private ArrayList<T> objects = new ArrayList<T>();

    public Stack() {
        this.objects = objects;
    }

    public void insert(T t){
        this.objects.add(t);
    }

    public Object remove(){
        return this.objects.remove(this.objects.size() - 1);
    }

    public boolean empty(){
        return objects.isEmpty();
    }

    public Object get(int i){
        return this.objects.get(i);
    }

    public int size(){
        return objects.size();
    }

    public void shuffle(){
        Collections.shuffle(objects);
    }
}
