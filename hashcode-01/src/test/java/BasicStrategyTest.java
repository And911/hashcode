import org.junit.Test;

import Controller.Reader;
import Controller.Scorer;
import model.DataCenter;
import strategies.BasicStrategy;

public class BasicStrategyTest {
	
	@Test
	public void canLoadData() throws Exception{
	
		Reader reader = new Reader();
		DataCenter dataCenter = reader.read("me_at_the_zoo.in");
		
		BasicStrategy basicStrategy = new BasicStrategy();
		basicStrategy.apply(dataCenter);
		
        Scorer scorer = new Scorer();
        scorer.prepareResultFile(dataCenter, "me_at_the_zoo.result");
		
	}

}
