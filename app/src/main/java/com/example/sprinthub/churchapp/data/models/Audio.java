package com.example.sprinthub.churchapp.data.models;

public class Audio {

    /**
     * Auto generated Firebase Id for this audio
     */
    private String id;
    private String title;

    /**
     * The specific audio format. Can be mp3, aac, opus, etc
     */
    private String format;
    private String bitrate;

    /**
     * The storage location of the audio. (Firebase storage, google drive, mediafire, amazon, etc)
     */
    private String location;

    /**
     * The stream id which can be in conjunction with the location used to reconstruct the streamUrl
     */
    private String streamId;

    /**
     * The direct streaming url
     */
    private String streamUrl;
    private String artist;

    public Audio() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getBitrate() {
        return bitrate;
    }

    public void setBitrate(String bitrate) {
        this.bitrate = bitrate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    public String getStreamUrl() {
        return streamUrl;
    }

    public void setStreamUrl(String streamUrl) {
        this.streamUrl = streamUrl;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
