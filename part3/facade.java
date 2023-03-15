package part3.facade;
import java.util.ArrayList;
import java.util.List;

public class facade {
  private OAuth oauth;
  private recentTweets twitterClient;

  public facade() {
    this.oauth = new OAuth();
    this.twitterClient = new recentTweets();
  }

  public List<Tweet> getRecentTweets(String appKey, String appSecret) {
    String accessToken = oauth.getAccessToken(appKey, appSecret);
    return twitterClient.getRecentTweets(accessToken);
  }
}
