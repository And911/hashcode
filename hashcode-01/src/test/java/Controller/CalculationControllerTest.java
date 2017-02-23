package Controller;

import model.DataCenter;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

/**
 * Created by kescha on 23.02.2017.
 */
public class CalculationControllerTest {

    Logger logger = LoggerFactory.getLogger(CalculationControllerTest.class);

    @Test
    public void test() throws Exception {

        ArrayList<String> files = new ArrayList<>();
        files.add("me_at_the_zoo.in");
        files.add("kittens.in");
        files.add("trending_today.in");
        files.add("videos_worth_spreading.in");

        for (String file : files) {
            logger.info("File: {}", file);
            Reader reader = new Reader();
            DataCenter dataCenter = reader.read(file);
            CalculationController calculationController = new CalculationController();
            calculationController.calculate(dataCenter);

            Scorer scorer = new Scorer();
            scorer.prepareResultFile(dataCenter, file);
        }
    }
}