package model;

public class VideoRequest {
    
    private final Video video;
    private final int numberOfRequests;
    
    public VideoRequest(Video video, int numberOfRequests){
        this.video = video;
        this.numberOfRequests = numberOfRequests;
    }


    public int getNumberOfRequests() {
        return numberOfRequests;
    }

    public Video getVideo(){
        return this.video;
    }

    @Override
    public String toString() {
        return "VideoRequest{" +
                "video=" + video +
                ", numberOfRequests=" + numberOfRequests +
                '}';
    }
}
