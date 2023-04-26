import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class CEPService {

	static String url = "https://viacep.com.br/ws/";
	static int successCode = 200;

	public static Address addressSearch(String cep) throws Exception {

		String callUrl = url + cep + "/json";

		try {

			URL url = new URL(callUrl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			if (connection.getResponseCode() != successCode) {
				throw new RuntimeException("HTTP error code, check url -> " + connection.getResponseCode());
			}

			BufferedReader response = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String jsonInSting = Utility.convertJsontoString(response);

			Gson gson = new Gson();
			Address address = gson.fromJson(jsonInSting, Address.class);

			return address;

		} catch (Exception e) {
			throw new Exception("ERROR: " + e);
		}
	}

}
