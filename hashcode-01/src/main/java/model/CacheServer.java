package model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CacheServer {
    
	Logger logger = LoggerFactory.getLogger(CacheServer.class);
	
    private final VideoList cachedVideos = new VideoList();
    private final int id;
    private final int capacity;
    
    public CacheServer(int id, int capacity){
        this.id = id;
        this.capacity = capacity;
    }
    
    public void cacheVideo(Video video){
    	if (cachedVideos.getTotalSize() + video.getSize() < capacity) {
    		this.cachedVideos.addVideo(video);
    	}
    }
    
    public VideoList getCachedVideos() {
		return cachedVideos;
	}
    
    public int getId() {
		return id;
	}

    @Override
    public String toString() {
        return "CacheServer{" +
                "cachedVideos=" + cachedVideos +
                ", id=" + id +
                '}';
    }
}

