package Socket;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class myServer {
    public static void main(String[] args)  {
        try {
            ServerSocket ServSocket = new ServerSocket(786);
            
            System.out.println("Going to Establish connection \n\n\n");
            Socket s = ServSocket.accept();
            System.out.println(" Connection Established \n\n\n");
            
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println("message= " + str);
            
            ServSocket.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
