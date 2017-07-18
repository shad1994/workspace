package rest.oAuth2;

import java.io.IOException;



import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.URLConnectionClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;

import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.types.GrantType;



public class test {
	
	String authURL = "http://10.0.1.86/snl/oauth/authorize";
	String tokenURL = "http://10.0.1.86/snl/oauth/token";
	String client_id="cd614b5147720ebf4d51ce8487701a6ff21a711be7d7935ebbf914c6a115d70c";
	String client_secret="2dbdf2319387b50f9c31cf10f196aeb52c45e393454f5baba6b9c7ac30b4f471";
	public static void main(String[] args) throws IOException, OAuthSystemException, OAuthProblemException
	{
	 test rest=new test();
	 rest.REST();
	}

	public void REST() throws IOException, OAuthSystemException, OAuthProblemException
	{
		
		 OAuthClient client = new OAuthClient(new URLConnectionClient());

         OAuthClientRequest request =
                 OAuthClientRequest.tokenLocation(tokenURL)
                 .setGrantType(GrantType.CLIENT_CREDENTIALS)
                 .setClientId(client_id)
                 .setClientSecret(client_secret)
.buildQueryMessage();
         
         String token =
                 client.accessToken(request, OAuthJSONAccessTokenResponse.class)
.getAccessToken();
         
         System.out.println(token);
	}

}
