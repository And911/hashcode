package model;

public class CacheServer {
    
    private final VideoList cachedVideos = new VideoList();
    private final int id;
    
    public CacheServer(int id){
        this.id = id;
    }
    
    public void cacheVideo(Video video){
        this.cachedVideos.addVideo(video);
    }
    
    public VideoList getCachedVideos() {
		return cachedVideos;
	}

    @Override
    public String toString() {
        return "CacheServer{" +
                "cachedVideos=" + cachedVideos +
                ", id=" + id +
                '}';
    }
}
