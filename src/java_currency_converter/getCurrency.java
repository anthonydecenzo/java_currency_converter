package java_currency_converter;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.IOUtils;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class getCurrency{
	public double USDCAD() throws MalformedURLException, IOException
	{
			URL convertAPI = new URL("http://apilayer.net/api/live?access_key=fb581cf502c6264c783c838c9034b988");
			String jsonText = IOUtils.toString(convertAPI);
			JsonParser parser = new JsonParser();
			JsonObject json = parser.parse(jsonText).getAsJsonObject();
			
			String testText = json.get("quotes").toString();
			json = parser.parse(testText).getAsJsonObject();

			double conversion = json.get("USDCAD").getAsDouble();
			
			double textField = Double.parseDouble(createGUI.originalCurrencyTextField.getText());
			double sum = conversion * textField;
			return Math.round(sum * 100.0) / 100.0;
	}
	public double USDEUR() throws IOException, MalformedURLException
	{
		URL convertAPI = new URL("http://apilayer.net/api/live?access_key=fb581cf502c6264c783c838c9034b988");
		String jsonText = IOUtils.toString(convertAPI);
		JsonParser parser = new JsonParser();
		JsonObject json = parser.parse(jsonText).getAsJsonObject();
		
		String testText = json.get("quotes").toString();
		json = parser.parse(testText).getAsJsonObject();

		double conversion = json.get("USDEUR").getAsDouble();
		
		double textField = Double.parseDouble(createGUI.originalCurrencyTextField.getText());
		double sum = textField * conversion;
		return Math.round(sum * 100.0) / 100.0;
		
	}
}
