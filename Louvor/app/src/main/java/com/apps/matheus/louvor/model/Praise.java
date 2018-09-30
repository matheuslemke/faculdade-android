package com.apps.matheus.louvor.model;

import java.io.File;
import java.util.List;

/**
 * Created by Matheus on 09-Oct-16.
 */
public class Praise {
    private PraiseCategory category;
    private PraiseTone tone;
    private List<String> tags;
    private File lyrics;
    private File chords;
    private Album album;

    public PraiseTone getTone() {
        return tone;
    }

    public void setTone(PraiseTone tone) {
        this.tone = tone;
    }

    public PraiseCategory getCategory() {
        return category;
    }

    public void setCategory(PraiseCategory category) {
        this.category = category;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public File getLyrics() {
        return lyrics;
    }

    public void setLyrics(File lyrics) {
        this.lyrics = lyrics;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
