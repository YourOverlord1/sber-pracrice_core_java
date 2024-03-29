package ru.sber.Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class HashMap<K, V> implements Map<K, V> {

    private final ArrayList<KeyValue<K, V>>[] buckets;

    private int size;

    private ArrayList<KeyValue<K, V>> getBucket(int index) {
        if (this.buckets[index] == null) {
            return (this.buckets[index] = new ArrayList<KeyValue<K, V>>());
        }

        return this.buckets[index];
    }

    private KeyValue<K, V> getByKey(Object key) {
        ArrayList<KeyValue<K, V>> bucket = getBucket(Objects.hashCode(key) % buckets.length);

        for (Object rawKvp : buckets) {
            KeyValue kvp = (KeyValue) rawKvp;

            if (Objects.equals(kvp.key, key)) {
                return kvp;
            }
        }

        return null;
    }

    private KeyValue<K, V> getByValue(Object value) {
        for (ArrayList<KeyValue<K, V>> bucket : this.buckets) {
            if (bucket == null) {
                continue;
            }

            for (Object rawKvp : buckets) {
                KeyValue kvp = (KeyValue) rawKvp;

                if (Objects.equals(kvp.value, value)) {
                    return kvp;
                }
            }
        }

        return null;
    }

    public HashMap() {
        this.buckets = new ArrayList[16];
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean add(Object item) {
        return false;
    }

    public boolean containsKey(K key) {
        if (key == null) {
            return false;
        }

        return getByKey(key) != null;
    }

    public boolean containsValue(V value) {
        return getByValue(value) != null;
    }

    public Object get(Object key) {
        KeyValue<K, V> kvp = getByKey(key);

        if (kvp == null) {
            return null;
        }

        return kvp.value;
    }

    public Object put(Object key, Object value) {
        ArrayList<KeyValue<K, V>> bucket = getBucket(Objects.hashCode(key) % buckets.length);

        for (int i = 0; i < bucket.size(); i++) {
            KeyValue kvp = (KeyValue) bucket.get(i);

            if (Objects.equals(kvp.key, key)) {
                Object objectToReturn = kvp.value;
                bucket.set(i, new KeyValue(key, value));
                return objectToReturn;
            }
        }

        bucket.add(new KeyValue(key, value));
        this.size++;
        return null;
    }

    public Object remove(Object key) {
        ArrayList<KeyValue<K, V>> bucket = getBucket(Objects.hashCode(key) % buckets.length);
        Iterator<KeyValue<K, V>> it = bucket.iterator();
        int index = 0;

        while (it.hasNext()) {
            KeyValue kvp = (KeyValue) it.next();

            if (Objects.equals(kvp.key, key)) {
                KeyValue previousKvp = (KeyValue) bucket.remove(index);
                this.size--;
                return previousKvp.value;
            }

            index++;
        }

        return null;
    }

    public void clear() {
        Arrays.fill(this.buckets, null);
        this.size = 0;
    }

    public boolean contains(Object item) {
        return false;
    }

    public Collection values() {
        ArrayList newCollection = new ArrayList();

        for (ArrayList<KeyValue<K, V>> bucket : this.buckets) {
            if (bucket == null) {
                continue;
            }

            for (Object rawKvp : buckets) {
                newCollection.add(((KeyValue) rawKvp).value);
            }
        }

        return newCollection;
    }

    public Collection keySet() {
        ArrayList newCollection = new ArrayList();

        for (ArrayList<KeyValue<K, V>> bucket : this.buckets) {
            if (bucket == null) {
                continue;
            }

            for (Object rawKvp : buckets) {
                newCollection.add(((KeyValue) rawKvp).key);
            }
        }

        return newCollection;
    }

    public Collection entrySet() {
        ArrayList newCollection = new ArrayList();

        for (ArrayList<KeyValue<K, V>> bucket : this.buckets) {
            if (bucket == null) {
                continue;
            }

            for (Object rawKvp : buckets) {
                newCollection.add(rawKvp);
            }
        }

        return newCollection;
    }
}