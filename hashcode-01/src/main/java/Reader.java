import model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

/**
 * Created by kescha on 23.02.2017.
 */
public class Reader {
    private final static Logger logger = LoggerFactory.getLogger(Reader.class);
    public static final String SEPARATOR = " ";

    public DataCenter read(String filename) throws Exception {
        List<String> lines = Files.readAllLines(Paths.get(ClassLoader.getSystemResource(filename).toURI()));

        final String criteriaString = lines.get(0);
        logger.info("Split: {}", criteriaString);
        String[] split = criteriaString.split(" ");
        logger.info("Split: {}", split[1]);

        Criteria criteria = new Criteria(Integer.valueOf(split[0]), Integer.valueOf(split[1]), Integer.valueOf(split[2]), Integer.valueOf(split[3]), Integer.valueOf(split[4]));

        DataCenter dataCenter = new DataCenter(criteria);

        logger.info("Criteria: {}", criteria);
        final String filesString = lines.get(1);
        String[] files = filesString.split(SEPARATOR);

        for (int i = 0; i < files.length; i++) {
            Video video = new Video(i, Integer.valueOf(files[i]));
            dataCenter.addVideo(video);
        }
        // FIXME create file structure
        HashMap<Integer, CacheServer> cacheServerMap = new HashMap<>();
        for (int i = 0; i < criteria.getCaches(); i++) {
            CacheServer cacheServer = new CacheServer(i);
            cacheServerMap.put(i, cacheServer);
        }

        int lineMarker = 2;
        for (int i = 0; i < criteria.getEndpoints(); i++) {
            final String endpointString = lines.get(lineMarker++);
            String[] endpointValues = endpointString.split(SEPARATOR);

            Endpoint endpoint = new Endpoint(i, Integer.valueOf(endpointValues[0]));
            int cacheServerAmount = Integer.valueOf(endpointValues[1]);
            for (int j = 0; j < cacheServerAmount; j++) {
                String serverConnectionString = lines.get(lineMarker++);
                String[] serverConnectionValue = serverConnectionString.split(SEPARATOR);

                CacheServer cacheServer = cacheServerMap.get(Integer.valueOf(serverConnectionValue[0]));
                CacheServerConnection cacheServerConnection = new CacheServerConnection(cacheServer, Integer.valueOf(serverConnectionValue[1]));
                endpoint.addCacheServerConnection(cacheServerConnection);
            }

            dataCenter.addEndpoint(endpoint);
            logger.info("CacheServerConnection: {}", endpoint);
        }
        return dataCenter;
    }
}
