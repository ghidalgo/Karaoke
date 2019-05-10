package com;

import com.kmachine.KaraokeMachine;
import com.kmachine.model.SongBook;

public class Play {
    public static void main(String[] args) {

        SongBook songBook = new SongBook();
        songBook.importFrom("songs.txt");
        KaraokeMachine machine = new KaraokeMachine(songBook);
        machine.run();
        System.out.println("Saving book....");
        songBook.exportTo("songs.txt");


    }
}