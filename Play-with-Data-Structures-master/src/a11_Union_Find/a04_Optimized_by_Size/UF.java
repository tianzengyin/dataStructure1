package a11_Union_Find.a04_Optimized_by_Size;

public interface UF {

    int getSize();
    boolean isConnected(int p, int q);
    void unionElements(int p, int q);
}
