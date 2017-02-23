package strategies;

import java.util.ArrayList;
import java.util.List;

import model.CacheServer;
import model.CacheServerConnection;
import model.DataCenter;
import model.Endpoint;
import model.VideoRequest;

public class BasicStrategy {

	public BasicStrategy(){
	}
	
	public void apply(DataCenter dataCenter){
		
		List<Score> scores = fillScores(dataCenter);

		for (Score score : scores){
			CacheServer cs = dataCenter.getCacheServerById(score.getCacheServerId());
			cs.cacheVideo(score.getVideo());
		}
	}

	private List<Score> fillScores(DataCenter dataCenter) {
		
		List<Score> scores = new ArrayList<>();
		
		for (Endpoint ep : dataCenter.getEndpoints()){
			for (VideoRequest vr : ep.getVideoRequests()){
				for (CacheServerConnection csc : ep.getCacheServerConnections()){
					Score s = new Score();
					s.setEndpointId(ep.getId());
					s.setCacheServerId(csc.getCacheServer().getId());
					s.setCacheServerLatency(csc.getLatency());
					s.setVideo(vr.getVideo());
					
					int savedMillis = (ep.getLatency() - csc.getLatency()) * vr.getNumberOfRequests();
					s.setSavedMillis(savedMillis);
					
					scores.add(s);
				}
			}
		}
		
		return scores;
	}
	
	
}
