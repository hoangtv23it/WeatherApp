import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable{
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public ClientHandler(Socket socket) throws IOException {
        this.clientSocket = socket;
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    @Override
    public void run() {
        while (true) {
            try {
                String locationName = in.readLine();
                WeatherApp weatherApp = new WeatherApp(locationName);
                String weatherData = weatherApp.getWeatherData();
                out.println(weatherData);   
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
