package Controller;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.List;

import model.CacheServer;
import model.DataCenter;
import model.Endpoint;
import model.Video;

public class Scorer {

    public void prepareResultFile(DataCenter result, String filename) {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new OutputStreamWriter(
                    new BufferedOutputStream(new FileOutputStream(filename + ".out"))));
            List<CacheServer> cacheServers = result.getCacheServers();
            int numberOfCacheServers = cacheServers.size();
            out.println(numberOfCacheServers);
            int i = 0;
            for (CacheServer cacheserver : cacheServers) {
                List<Video> videos = cacheserver.getCachedVideos().getVideos();
                String videoString = "";
                for (Video video : videos) {
                    videoString += " " + video.getId();
                }
                out.println(i + videoString);
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.flush();
                out.close();
            }
        }

    }

    public Long computeScore(DataCenter resultSet) {
        List<CacheServer> cacheServers = resultSet.getCacheServers();
        List<Endpoint> endpoints = resultSet.getEndpoints();
        Long score = 0L;

        for (Endpoint endpoint : endpoints) {
            int basicLatency = endpoint.getLatency();

        }

        return score;
    }
}
