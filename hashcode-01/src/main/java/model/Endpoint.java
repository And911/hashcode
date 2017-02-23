package model;

import java.util.ArrayList;
import java.util.List;

public class Endpoint {
    private final int id;

    private final int latency;
    private final List<CacheServerConnection> cacheServerConnections = new ArrayList<>();
    private final List<VideoRequest> videoRequests = new ArrayList<>();

    public Endpoint(int id, int latency){
        this.id = id;
        this.latency = latency;
    }

    public void addCacheServerConnection(CacheServerConnection cacheServerConnection) {
        this.cacheServerConnections.add(cacheServerConnection);
    }

    public void addVideoRequest(VideoRequest request){
        this.videoRequests.add(request);
    }
    
    
}
