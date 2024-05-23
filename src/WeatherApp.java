import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.io.*;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class WeatherApp {
    private static final String API_KEY = "cabc9614649278ff314eb4f62e95942e";
    private String temperature;
    private String weatherCondition;
    private String humidity;
    private String windSpeed;
    private int weatherCode;
    private String img_weatherCondition;

    private static final int PORT = 1234;
    private ServerSocket serverSocket;

    public WeatherApp() throws IOException {
        serverSocket = new ServerSocket(PORT);
    }
    
    public WeatherApp(String locationName){
        String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + locationName + "&units=metric&appid=" + API_KEY + "&mode=xml";

        try {
            @SuppressWarnings("deprecation")
            URL url = new URL(urlString);
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler handler = new DefaultHandler() {
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    if (qName.equalsIgnoreCase("temperature")) {
                        temperature = attributes.getValue("value");
                    } else if (qName.equalsIgnoreCase("weather")) {
                        weatherCondition = attributes.getValue("value");
                        weatherCode = Integer.parseInt(attributes.getValue("number"));
                    } else if (qName.equalsIgnoreCase("humidity")) {
                        humidity = attributes.getValue("value");
                    } else if (qName.equalsIgnoreCase("speed")) {
                        windSpeed = attributes.getValue("value");
                    }
                }
            };

            saxParser.parse(url.openStream(), handler);
        covertWeatherCode();
        } catch (Exception e) {
            System.out.println("Khong co du lieu");
            weatherCondition = "Không có dữ liệu";
            temperature = "0";
            humidity = "0";
            windSpeed = "0";
            e.printStackTrace();
        }
    }
    private void covertWeatherCode (){
        if (weatherCode == 800){
            img_weatherCondition = "Clear";
        }else if(weatherCode <= 232 ){
            img_weatherCondition = "Thunderstorm";
        }else if((weatherCode <= 531 & weatherCode >499) || (weatherCode <= 321 & weatherCode >299)  ){
            img_weatherCondition = "Rain";
        }else if(weatherCode <= 622 & weatherCode >599 ){
            img_weatherCondition = "Snow";
        }else if(weatherCode <= 781 & weatherCode >700 ){
            img_weatherCondition = "Atmosphere";
        }
    }
    public String getWeatherData() {
        return temperature + "," + weatherCondition + "," + humidity + "," + windSpeed + "," + img_weatherCondition;
    }
    public void startServer() {
        while (true) {
            try {
                Socket clientSocket = serverSocket.accept();
                ClientHandler clientHandler = new ClientHandler(clientSocket);
                Thread thread = new Thread(clientHandler);
                thread.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new WeatherApp().startServer();
    }


}