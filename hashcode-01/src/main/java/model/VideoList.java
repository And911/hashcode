package model;

import java.util.ArrayList;
import java.util.List;

public class VideoList {
    
    private List<Video> videos = new ArrayList<Video>();
    
    public void addVideo(Video video){
        this.videos.add(video);
    }
    
}