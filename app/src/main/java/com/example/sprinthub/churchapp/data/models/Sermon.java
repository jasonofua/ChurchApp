package com.example.sprinthub.churchapp.data.models;

import java.util.Date;
import java.util.List;

public class Sermon {
    /**
     * id is a firebase generated id
     */
    private String id;
    private String title;

    /**
     * Name of the minister
     */
    private String minister;

    /**
     * Where (parish, district, diocese, state etc) the message was preached
     */
    private String location;

    /**
     * series id for the particular series the message belongs to, if any
     */
    private String seriesId;
    private String seriesName;

    /**
     * Can be Sunday light, Bible study, Charismatic hour, Mount Horeb, etc
     */
    private String category;

    private Date published;
    private Date updated;

    /**
     * Notes is html formatted String which can be displayed in a Webview
     */
    private String notes;

    /**
     * List of Audios available for the message
     */
    private List<Audio> audios;

    /**
     * List of Videos available for this message
     */
    private List<Video> videos;

    public Sermon() {
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

    public String getMinister() {
        return minister;
    }

    public void setMinister(String minister) {
        this.minister = minister;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public List<Audio> getAudios() {
        return audios;
    }

    public void setAudios(List<Audio> audios) {
        this.audios = audios;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }
}
