package com.apps.matheus.louvor.change;

import com.apps.matheus.louvor.model.Praise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Matheus on 09-Oct-16.
 */
public class Changer {
    public void increaseTone(Praise praise) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(praise.getLyrics()));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
