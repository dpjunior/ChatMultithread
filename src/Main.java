import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import javax.swing.*;
import java.net.ServerSocket;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main {

	public static void main(String []args) throws IOException {
		
		Cliente app = new Cliente();
		app.conectar();
		app.escutar();
	    
		try{
			//Cria os objetos necessário para instânciar o servidor
			JLabel lblMessage = new JLabel("Porta do Servidor:");
			JTextField txtPorta = new JTextField("12345");
	    	Object[] texts = {lblMessage, txtPorta };  
	    	JOptionPane.showMessageDialog(null, texts);
	    	ServerSocket server = new ServerSocket(Integer.parseInt(txtPorta.getText()));
	    	ArrayList<BufferedWriter> clientes = new ArrayList<BufferedWriter>();
	    	JOptionPane.showMessageDialog(null,"Servidor ativo na porta: "+         
	    	txtPorta.getText());
	    
	    	while(true){
	    		System.out.println("Aguardando conexão...");
	    		Socket con = server.accept();
	    		System.out.println("Cliente conectado...");
	    		Thread t = new Servidor(con);
	    		t.start();   
	    	}
	                              
			}catch (Exception e) {
	    
				e.printStackTrace();
			}                       
		}                     
}

