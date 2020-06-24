package a10_Trie.Optional_01_Trie_Using_HashMap_and_Array.src;

import a10_Trie.Optional_01_Trie_Using_HashMap_and_Array.src.BST;
import a10_Trie.Optional_01_Trie_Using_HashMap_and_Array.src.Set;

public class BSTSet<E extends Comparable<E>> implements Set<E> {

    private BST<E> bst;

    public BSTSet(){
        bst = new BST<>();
    }

    @Override
    public int getSize(){
        return bst.size();
    }

    @Override
    public boolean isEmpty(){
        return bst.isEmpty();
    }

    @Override
    public void add(E e){
        bst.add(e);
    }

    @Override
    public boolean contains(E e){
        return bst.contains(e);
    }

    @Override
    public void remove(E e){
        bst.remove(e);
    }
}
