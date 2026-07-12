package core.basesyntax.impl;

import core.basesyntax.Storage;

public class StorageImpl<K, V> implements Storage<K, V> {
   private static final int MAX_SIZE = 10;
   private K[] keys;
   private V[] values;

   public StorageImpl() {
       keys = (K[]) new Object[MAX_SIZE];
       values = (V[]) new Object[MAX_SIZE];
   }

   private int currentSize = 0;

    @Override
    public void put(K key, V value) {

    }

    private int indexOf(K keys) {
        for (int i = 0; i < currentSize; i++) {
            if (keys.equals(keys[i])) {
                return i;
            }
        }
        return -1;
    }

    public 

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public int size() {
        return -1;
    }
}
