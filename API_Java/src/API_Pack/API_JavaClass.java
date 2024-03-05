package API_Pack;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class API_JavaClass {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://pokeapi.co/api/v2/pokemon/pikachu"))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(response.body());
            JSONArray movesArray=(JSONArray)jsonObject.get("moves");

            long base_experience = (long) jsonObject.get("base_experience");
            long weight = (long) jsonObject.get("weight");
            long height = (long) jsonObject.get("height");
            
            
            System.out.println("base_experience: " + base_experience);
            System.out.println("Weight: " + weight);
            System.out.println("Height: " + height);
            if(movesArray.size()>=4) {
            	for(int i=0;i<4;i++) {
            		JSONObject mo=(JSONObject) movesArray.get(i);
            		String name=(String)((JSONObject) mo.get("move")).get("name");
                	System.out.println("Move "+(i+1)+" : "+name);
            	}
            }

        } catch (IOException | InterruptedException | ParseException e) {
            e.printStackTrace();
        }
    }
}