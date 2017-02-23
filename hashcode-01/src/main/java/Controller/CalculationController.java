package Controller;

import model.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by kescha on 23.02.2017.
 */
public class CalculationController {

    public void calculate(DataCenter dataCenter) {
        List<Endpoint> endpoints = dataCenter.getEndpoints();
        for (Endpoint endpoint : endpoints) {
            List<VideoRequest> videoRequests = endpoint.getVideoRequests();
            Collections.sort(videoRequests, Comparator.comparingInt(VideoRequest::getNumberOfRequests));

            List<CacheServerConnection> cacheServerConnections = endpoint.getCacheServerConnections();
            Collections.sort(cacheServerConnections, (o1, o2) -> o2.getLatency() - o1.getLatency());

            for (VideoRequest videoRequest : videoRequests) {
                Video video = videoRequest.getVideo();

                CacheServer cacheServer = findCacheServer(video.getSize(), endpoint, dataCenter.getCriteria());
                if (cacheServer != null) {
                    cacheServer.cacheVideo(video);
                }
            }
        }

    }

    private CacheServer findCacheServer(int size, Endpoint endpoint, Criteria criteria) {
        List<CacheServerConnection> cacheServerConnections = endpoint.getCacheServerConnections();
        for (CacheServerConnection cacheServerConnection : cacheServerConnections) {
            CacheServer cacheServer = cacheServerConnection.getCacheServer();
            VideoList cachedVideos = cacheServer.getCachedVideos();
            List<Video> videos = cachedVideos.getVideos();
            int sum = 0;
            for (Video video : videos) {
                sum = video.getSize();
            }
            if (criteria.getCapacity() < sum + size) {
                return cacheServer;
            }
        }
        return null;
    }
}
