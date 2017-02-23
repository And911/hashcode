import Controller.Reader;
import Controller.Scorer;
import model.DataCenter;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kescha on 23.02.2017.
 */
public class ScorerTest {
    private static final Logger logger = LoggerFactory.getLogger(ScorerTest.class);

    @Test
    public void testScorer() throws Exception {
        Reader reader = new Reader();
        DataCenter dataCenter = reader.read("me_at_the_zoo.in");
        Scorer scorer = new Scorer();
        Long score = scorer.computeScore(dataCenter);
        logger.info("Score: {}", score);
    }

    @Test
    public void testFilePrinter() throws Exception {
        Reader reader = new Reader();
        DataCenter dataCenter = reader.read("me_at_the_zoo.in");
        Scorer scorer = new Scorer();
        scorer.prepareResultFile(dataCenter, "result.txt");
    }
}
