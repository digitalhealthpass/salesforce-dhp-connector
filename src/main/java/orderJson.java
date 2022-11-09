import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * 
 */

public class orderJson {
	
	 public String getData(String jsonData) throws IOException {
		 
		 	ObjectMapper mapper = new ObjectMapper();
			JsonNode actualObj = mapper.readTree(jsonData);
			//System.out.println(actualObj);
			String str = actualObj.toString();
		    ObjectMapper om = new ObjectMapper();
		    om.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, true);
		    Map<String, Object> map = om.readValue(str, HashMap.class);
		    String json = om.writeValueAsString(map);
		    //System.out.println(json);
			return json; 
	            } 
	       
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			 orderJson jsonnew = new orderJson();
	        }
	        catch (Exception ex) {
	        	
	        }

	}

}
