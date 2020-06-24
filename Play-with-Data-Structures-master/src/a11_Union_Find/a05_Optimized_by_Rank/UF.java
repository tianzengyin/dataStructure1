package a11_Union_Find.a05_Optimized_by_Rank;

public interface UF {

    int getSize();
    boolean isConnected(int p, int q);
    void unionElements(int p, int q);
}
