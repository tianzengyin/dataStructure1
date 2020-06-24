package a07_SetAndMap.a01_Set_Basics_and_BSTSet.src;

import java.net.URL;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Pride and Prejudice");
        URL resource1 = Main.class.getClassLoader().getResource("pride-and-prejudice.txt");
        URL resource2 = Main.class.getClassLoader().getResource("a-tale-of-two-cities.txt");
        String path1 = resource1.getPath().substring(1);
        String path2 = resource2.getPath().substring(1);
        System.out.println(path1);
        String path = "D:\\ieda_workspace\\dataStructure\\Play-with-Data-Structures-master\\src\\a07_SetAndMap\\a01_Set_Basics_and_BSTSet\\pride-and-prejudice.txt";
        ArrayList<String> words1 = new ArrayList<>();
        if(FileOperation.readFile(path1, words1)) {
            System.out.println("Total words: " + words1.size());

            BSTSet<String> set1 = new BSTSet<>();
            for (String word : words1) {
                set1.add(word);
            }
            System.out.println("Total different words: " + set1.getSize());
        }

        System.out.println();


        System.out.println("A Tale of Two Cities");

        ArrayList<String> words2 = new ArrayList<>();
        if(FileOperation.readFile(path2/*"a-tale-of-two-cities.txt"*/, words2)){
            System.out.println("Total words: " + words2.size());

            BSTSet<String> set2 = new BSTSet<>();
            for(String word: words2) {
                set2.add(word);
            }
            System.out.println("Total different words: " + set2.getSize());
        }
    }
}
