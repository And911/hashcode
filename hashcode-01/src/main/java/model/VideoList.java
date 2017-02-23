package model;

import java.util.ArrayList;
import java.util.List;

public class VideoList {
    
    private List<Video> videos = new ArrayList<>();
    private int totalSize = 0;
    
    public void addVideo(Video video){
        if (videos.contains(video)){
        	return;
        }
    	
    	this.videos.add(video);
        this.totalSize = totalSize + video.getSize();
    }


    public List<Video> getVideos() {
        return videos;
    }

    @Override
    public String toString() {
        return "VideoList{" +
                "videos=" + videos +
                '}';
    }
    public int getTotalSize() {
		return totalSize;
	}
    
}

