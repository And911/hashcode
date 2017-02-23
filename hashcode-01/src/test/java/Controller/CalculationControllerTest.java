package Controller;

import model.DataCenter;
import org.junit.Test;

/**
 * Created by kescha on 23.02.2017.
 */
public class CalculationControllerTest {

    @Test
    public void test() throws Exception {
        Reader reader = new Reader();
        DataCenter dataCenter = reader.read("me_at_the_zoo.in");
        CalculationController calculationController = new CalculationController();
        calculationController.calculate(dataCenter);

        Scorer scorer = new Scorer();
        scorer.prepareResultFile(dataCenter, "result.txt");
    }
}