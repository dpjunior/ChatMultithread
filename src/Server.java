import java.io.BufferedWriter;
import java.io.IOException;
import java.net.Socket;

public interface Server {
	public void Servidor(Socket con);
	public void run();
	public void sendToAll(BufferedWriter bwSaida, String msg) throws IOException;
}
