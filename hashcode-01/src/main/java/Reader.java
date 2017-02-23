import model.Criteria;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by kescha on 23.02.2017.
 */
public class Reader {
    public void read(String filename) throws Exception {
        List<String> lines = Files.readAllLines(Paths.get(filename));

        final String criteriaString = lines.get(0);
        String[] split = criteriaString.split(" ");
        Criteria criteria = new Criteria(Integer.valueOf(split[0]), Integer.valueOf(split[1]), Integer.valueOf(split[2]), Integer.valueOf(split[3], Integer.valueOf(split[4])),Integer.valueOf(split[5]));
        for (int i = 0; i < lines.size(); i++) {

        }
    }
}
