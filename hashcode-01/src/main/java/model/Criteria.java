package model;

/**
 * Created by kescha on 23.02.2017.
 */
public class Criteria {
    private final int videosAmount;
    private final int endpoints;
    private final int requestsDescriptions;
    private final int caches;
    private final int capacity;

    public Criteria(int videos, int endpoints, int requestsDescriptions, int caches, int capacity) {
        this.videosAmount = videos;
        this.endpoints = endpoints;
        this.requestsDescriptions = requestsDescriptions;
        this.caches = caches;
        this.capacity = capacity;
    }


    public int getVideosAmount() {
        return videosAmount;
    }

    public int getEndpoints() {
        return endpoints;
    }

    public int getRequestsDescriptions() {
        return requestsDescriptions;
    }

    public int getCaches() {
        return caches;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Criteria{" +
                "videosAmount=" + videosAmount +
                ", endpoints=" + endpoints +
                ", requestsDescriptions=" + requestsDescriptions +
                ", caches=" + caches +
                ", capacity=" + capacity +
                '}';
    }
}
