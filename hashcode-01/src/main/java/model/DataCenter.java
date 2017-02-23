package model;

import java.util.ArrayList;
import java.util.List;

public class DataCenter {
    
    private final VideoList videoList = new VideoList();
    private final List<Endpoint> endpoints = new ArrayList<>();
    private final List<CacheServer> cacheServers = new ArrayList<>();

    private final Criteria criteria;

    public DataCenter(Criteria criteria){
        this.criteria = criteria;
    }

    public Criteria getCriteria() {
        return criteria;
    }

    public void addVideo(Video video){
        this.videoList.addVideo(video);
    }

    public void addEndpoint(Endpoint endpoint) {
        endpoints.add(endpoint);
    }

    public void addCacheServer(CacheServer cacheServer) {
        cacheServers.add(cacheServer);
    }

    public VideoList getVideoList() {
        return videoList;
    }

    public List<Endpoint> getEndpoints() {
        return endpoints;
    }

    public List<CacheServer> getCacheServers() {
        return cacheServers;
    }

    @Override
    public String toString() {
        return "DataCenter{" +
                "videoList=" + videoList +
                ", endpoints=" + endpoints +
                ", cacheServers=" + cacheServers +
                ", criteria=" + criteria +
                '}';
    }
}
