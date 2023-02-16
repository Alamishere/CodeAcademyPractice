package codeacademy.array;

import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {
        ArrayList<String>desertIslandPlaylist = new ArrayList<>();
        desertIslandPlaylist.add("Don't you worry child");
        desertIslandPlaylist.add("Adventure of Lifetime");
        desertIslandPlaylist.add("Enemy");
        desertIslandPlaylist.add("Bad Memories");
        desertIslandPlaylist.add("Here With Me");
        System.out.println(desertIslandPlaylist);
        desertIslandPlaylist.add("Titanic");
        System.out.println(desertIslandPlaylist.size());
        desertIslandPlaylist.remove("Bad Memories");
        System.out.println(desertIslandPlaylist.size());

        //get the indices of the songs you want to swap
        int indexA=desertIslandPlaylist.indexOf("Enemy");
        int indexB=desertIslandPlaylist.indexOf("Here With Me");

        //Create a temporary variable to store the value of song a. (We’ll call the songs a and b here.)
        String tempA ="Enemy";
        //Rewrite the value at the index of a to the value of b.
        desertIslandPlaylist.set(indexA,"Here With Me");
        System.out.println(desertIslandPlaylist);
        //Rewrite the value at the index of b to the value of the temporary variable.
        desertIslandPlaylist.set(indexB,tempA);
        System.out.println(desertIslandPlaylist);

    }

}