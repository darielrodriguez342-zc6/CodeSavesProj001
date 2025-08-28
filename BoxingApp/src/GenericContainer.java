import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class GenericContainer <T>{
    //Create generic list of items, empty
    List<T> items;
    //create arraylist of items
    public GenericContainer(){
        items = new ArrayList<>();
    }
    //add item to arraylist
    public void add(T item){
        items.add(item);
    }
    //remove item from arraylist
    public void remove(T item){
        items.remove(item);
    }
    //return fighter in specific index
    public void get(int indx){
        System.out.println(items.get(indx));
    }
    //failed sort method
    public void sort(){
        items.sort(new Comparator<T>() {


            @Override
            public int compare(T o1, T o2) {
                return 0;
            }

            @Override
            public Comparator<T> reversed() {
                return Comparator.super.reversed();
            }
        });
    }

    //size of arraylist
    public int size(){
        return items.size();
    }
    

    //print items in generic container
    @Override
    public String toString(){
        return "Container contents " + items;
    }
}
