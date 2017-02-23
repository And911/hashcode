package model;

public class CacheServerConnection {
    
    private final CacheServer cacheServer;
    private final int latency;

    public CacheServerConnection(CacheServer cacheServer, int latency) {
        this.cacheServer = cacheServer;
        this.latency = latency;
    }

    public CacheServer getCacheServer() {
        return cacheServer;
    }

    public int getLatency() {
        return latency;
    }

    @Override
    public String toString() {
        return "CacheServerConnection{" +
                "cacheServer=" + cacheServer +
                ", latency=" + latency +
                '}';
    }
}
