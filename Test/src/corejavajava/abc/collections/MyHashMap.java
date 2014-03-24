package corejavajava.abc.collections;

import java.util.HashMap;

public class MyHashMap<K, V> extends HashMap<K, V> {

    @Override
    public int size() {
        return entrySet().size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

}
