package realgraffiti.common.data;

import java.lang.reflect.Type;

import org.apache.commons.codec.binary.Base64;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class JsonConverter {
	
	public static String toJson(Object obj){
		GsonBuilder gsonBuilder = new GsonBuilder();
	
		gsonBuilder.registerTypeAdapter(byte[].class, new ByteArraySerializer());
		
		Gson gson = gsonBuilder.create();
		
		return gson.toJson(obj);
	}
	
	public static Object fromJson(String json, Type typeOfObject){
		GsonBuilder gsonBuilder = new GsonBuilder();
		
		gsonBuilder.registerTypeAdapter(byte[].class, new ByteArrayDeserializer());
		
		Gson gson = gsonBuilder.create();
		
		return gson.fromJson(json, typeOfObject);
	}
	
	public static class ByteArraySerializer implements JsonSerializer<byte[]> {
		@Override
		public JsonElement serialize(byte[] src, Type typeOfSrc, JsonSerializationContext context) {
			String encodedString = new String(Base64.encodeBase64(src));
			return new JsonPrimitive(encodedString);
		}
	}
	
	private static class ByteArrayDeserializer implements JsonDeserializer<byte[]> {
		  public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
		      throws JsonParseException 
	      {
			  String jsonString = json.getAsString();
			  byte[] byteArr = Base64.decodeBase64(jsonString);
			  return byteArr;
		  }
		}
}
