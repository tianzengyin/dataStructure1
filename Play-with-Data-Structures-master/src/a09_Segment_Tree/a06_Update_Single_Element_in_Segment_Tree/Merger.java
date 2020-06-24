package a09_Segment_Tree.a06_Update_Single_Element_in_Segment_Tree;

public interface Merger<E> {
    E merge(E a, E b);
}
