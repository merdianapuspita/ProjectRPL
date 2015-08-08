//SERVER
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static Socket socket;

    public static void main(String[] args)
    {
        try
        {
            int port = 25000;
            ServerSocket serverSocket = new ServerSocket(port);
            socket = serverSocket.accept();
            System.out.println("Server Started and listening to the port 25000");
            //while(true){
                //Server is running always. This is done using this while(true) loop
                //Reading the message from the client

                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                String number = br.readLine();
                System.out.println("Received from client: "+number+"\n");

                BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
                String s = bufferRead.readLine();

                //Sending the response back to the client.
                OutputStream os = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(os);
                BufferedWriter bw = new BufferedWriter(osw);
                bw.write(s);
                bw.flush();
                System.out.println("Sent (to " + socket + ") client: "+s+"\n");

                //String abc = bufferRead.readLine();
                //System.out.println("SAA");
            //}
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                socket.close();
            }
            catch(Exception e){}
        }
    }
}
