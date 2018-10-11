package chat;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("Server started!");

        ServerSocket server = new ServerSocket(Settings.port, 50, InetAddress.getByName(Settings.address));
        Socket socket = server.accept();
        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output  = new DataOutputStream(socket.getOutputStream());

        output.writeUTF("Hello from server!");
        System.out.println(input.readUTF());
    }
}