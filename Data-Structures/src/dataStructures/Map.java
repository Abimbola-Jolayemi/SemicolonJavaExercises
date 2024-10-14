package dataStructures;

public class Map<K, V>{
    private KeyValuePair<K, V>[] pair;
    private int size;

    public Map(){
        this.pair = new KeyValuePair[2];
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public void put(K key, V value) {
        if (size == pair.length) {
            resize();
        }

        for (int index = 0; index < size; index++) {
            if (containsKey(key)) {
                pair[index].setValue(value);
                return;
            }
        }
        pair[size] = new KeyValuePair<>(key, value);
        size++;
    }

    private void resize() {
        KeyValuePair<K, V>[] newPair = new KeyValuePair[2 * pair.length];
        for (int index = 0; index < size; index++) {
            newPair[index] = pair[index];
        }
        pair = newPair;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean containsKey(K key) {
        if (size == 0) {
            return false;
        }
        for (int index = 0; index < size; index++) {
            if (pair[index].getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(V value) {
        if (size == 0) {
            return false;
        }
        for (int index = 0; index < size; index++) {
            if (pair[index].getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }

    public V get(K key) {
        if (size == 0) {
            return null;
        }
        for (int index = 0; index < size; index++) {
            if (pair[index].getKey().equals(key)) {
                return pair[index].getValue();
            }
        }
        return null;
    }

    public void remove(K key) {
        if (size == 0) {
            return;
        }
        for (int index = 0; index < size; index++) {
            if (pair[index].getKey().equals(key)) {
                for (int j = index; j < size - 1; j++) {
                    pair[j] = pair[j + 1];
                }
                pair[size - 1] = null;
                size--;
                return;
            }
        }
        return;
    }

    public void clear() {
        if (size == 0) {
            return;
        }
        for (int index = 0; index < size; index++) {
            pair[index] = null;
        }
        size = 0;
    }
}
