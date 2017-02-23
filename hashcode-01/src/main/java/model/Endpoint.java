package model;

import java.util.ArrayList;
import java.util.List;

public class Endpoint {
    
    private final int id;
    private final List<VideoRequest> videoRequests = new ArrayList<VideoRequest>();
    
    public Endpoint(int id){
        this.id = id;
    }
    
    public void addVideoRequest(VideoRequest request){
        this.videoRequests.add(request);
    }
    
    
}
