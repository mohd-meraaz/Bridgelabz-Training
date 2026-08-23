package com.day16.classwork;

import java.util.ArrayList;
import java.util.List;

public class GenericInterface {
    interface container <T> {
        void add(T item);
        T get(int index);
    }

    public class containerDemo <T> implements container<T> {
        List<T> list = new ArrayList<>();
        @Override
        public void add(T item) {
            list.add(item);
            System.out.println("Added Item");
        }
        @Override
        public T get(int index) {
            return(list.get(index));

        }
    }
    void main() {
        containerDemo<Integer> container = new containerDemo();
        container.add(1);
        container.add(2);
        container.add(3);
        System.out.println(container.get(2));
    }
}
