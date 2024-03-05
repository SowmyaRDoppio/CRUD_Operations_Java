package api_Package;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.http.*;
import org.json.simple.JSONObject;


public class API_Class{
	public static void main(String[] args) {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://pokeapi.co/api/v2/pokemon/pikachu"))
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
				
		HttpResponse<String> response = null;
		try {
			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(response.body());
		
		client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
        .thenApply(HttpResponse::body)
        .thenApply(API_Class::parse)
        .join();
}

    public static String parse(String responseBody) {
    	
    JSONArray albums = new JSONArray(responseBody);
    for(int i = 0 ; i < albums.length(); i++) {
    JSONObject album = albums.getJSONObject(i);
    int id = album.getInt("id");
    int userId = album.getInt("userId");
    String title = album.getString("title");
    System.out.println("id: " + id);
    System.out.println("userId: " + userId);
    System.out.println("title: " + title);

}
return null;
}
		
		
	}
	}
