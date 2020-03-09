import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

public interface InterfaceClient {
	public void conectar() throws IOException;
	public void enviarMensagem(String msg) throws IOException;
	public void escutar() throws IOException;
	public void sair() throws IOException;
	public void actionPerformed(ActionEvent e);
	public void keyPressed(KeyEvent e);
	public void keyReleased(KeyEvent arg0);
	public void keyTyped(KeyEvent arg0);
	
}
