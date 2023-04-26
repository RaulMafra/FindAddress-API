import java.io.BufferedReader;
import java.io.IOException;

public class Utility {
	
	//converte o Json em String
	public static String convertJsontoString(BufferedReader bufferedReader) throws IOException{
        String response, jsonInString = "";

        while((response = bufferedReader.readLine()) != null){
            jsonInString += response;
        }
        return jsonInString;
    }

}
