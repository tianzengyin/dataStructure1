package a07_SetAndMap.a01_Set_Basics_and_BSTSet.src;

public interface Set<E> {

    void add(E e);
    boolean contains(E e);
    void remove(E e);
    int getSize();
    boolean isEmpty();
}
