package model;

public class DataCenter {
    
    public final VideoList videoList = new VideoList();
    
    public DataCenter(){
    }
    
    public void addVideo(Video video){
        this.videoList.addVideo(video);
    }
    
}
