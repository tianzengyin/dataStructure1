package a07_SetAndMap.a08_More_about_Map.src;

public interface Map<K, V> {

    void add(K key, V value);
    boolean contains(K key);
    V get(K key);
    void set(K key, V newValue);
    V remove(K key);
    int getSize();
    boolean isEmpty();
}
