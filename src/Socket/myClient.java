package Socket;

import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author mehtab
 */
public class myClient {
    public static void main(String[] args) {
        try{
            
            Socket s = new Socket("localhost", 12);
            
            DataOutputStream Sout = new DataOutputStream(s.getOutputStream());
            
            Sout.writeUTF("Mehtab kazmi");
            
            Sout.flush();
            Sout.close();
            s.close();
            
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
