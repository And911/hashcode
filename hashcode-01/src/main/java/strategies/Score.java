package strategies;

import model.Video;

public class Score {

	private int endpointId;
	private Video video;
	private int videoSize;
	private int numberOfRequests;
	private int cacheServerId;
	private int cacheServerLatency;
	private int savedMillis;

	public int getEndpointId() {
		return endpointId;
	}

	public void setEndpointId(int endpointId) {
		this.endpointId = endpointId;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public int getVideoSize() {
		return videoSize;
	}

	public void setVideoSize(int videoSize) {
		this.videoSize = videoSize;
	}

	public int getNumberOfRequests() {
		return numberOfRequests;
	}

	public void setNumberOfRequests(int numberOfRequests) {
		this.numberOfRequests = numberOfRequests;
	}

	public int getCacheServerId() {
		return cacheServerId;
	}

	public void setCacheServerId(int cacheServerId) {
		this.cacheServerId = cacheServerId;
	}

	public int getCacheServerLatency() {
		return cacheServerLatency;
	}

	public void setCacheServerLatency(int cacheServerLatency) {
		this.cacheServerLatency = cacheServerLatency;
	}

	public int getSavedMillis() {
		return savedMillis;
	}

	public void setSavedMillis(int savedMillis) {
		this.savedMillis = savedMillis;
	}

}
