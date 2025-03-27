package JSONParsing;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.io.FileUtils;

public class JSONDataDriven {
	public static List<HashMap<String,String>> getJsonData(String jsonFilePath) throws IOException
	{
     String JsonContent=FileUtils.readFileToString(new File(jsonFilePath),StandardCharsets.UTF_8);
     ObjectMapper objectmapper = new ObjectMapper();
     List<HashMap<String,String>> data = objectmapper.readValue(JsonContent ,
     new TypeReference<List<HashMap<String,String>>>(){} );
     return data;	
	}

}
