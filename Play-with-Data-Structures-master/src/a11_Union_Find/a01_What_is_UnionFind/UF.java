package a11_Union_Find.a01_What_is_UnionFind;

public interface UF {

    int getSize();
    boolean isConnected(int p, int q);
    void unionElements(int p, int q);
}