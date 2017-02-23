import model.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by kescha on 23.02.2017.
 */
public class Reader {
    private final static Logger logger = LoggerFactory.getLogger(Reader.class);

    public void read(String filename) throws Exception {
        List<String> lines = Files.readAllLines(Paths.get(ClassLoader.getSystemResource(filename).toURI()));

        final String criteriaString = lines.get(0);
        logger.info("Split: {}", criteriaString);
        String[] split = criteriaString.split(" ");
        logger.info("Split: {}", split[1]);

        Criteria criteria = new Criteria(Integer.valueOf(split[0]), Integer.valueOf(split[1]), Integer.valueOf(split[2]), Integer.valueOf(split[3]), Integer.valueOf(split[4]));

        logger.info("Criteria: {}", criteria);
        for (int i = 0; i < lines.size(); i++) {

        }
    }
}
