package a11_Union_Find.a07_More_about_Union_Find;

public interface UF {

    int getSize();
    boolean isConnected(int p, int q);
    void unionElements(int p, int q);
}
