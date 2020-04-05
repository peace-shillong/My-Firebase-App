package com.peace.myfirebaseapp.model;

public class Artist {
    private String artistId;
    private String artistName;
    private String artistGenre;
    private String imageName;
    private String urlImage;

    public Artist(){

    }

    public Artist(String artistId, String artistName, String artistGenre) {
        this.artistId = artistId;
        this.artistName = artistName;
        this.artistGenre = artistGenre;
    }

    public Artist(String artistId, String artistName, String artistGenre, String imageName, String urlImage) {
        this.artistId = artistId;
        this.artistName = artistName;
        this.artistGenre = artistGenre;
        this.imageName=imageName;
        this.urlImage=urlImage;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getArtistGenre() {
        return artistGenre;
    }

    public String getImageName() {
        return imageName;
    }

    public String getUrlImage() {
        return urlImage;
    }
}