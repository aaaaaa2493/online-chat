package chat;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("Client started!");

        Socket socket = new Socket(InetAddress.getByName(Settings.address), Settings.port);
        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output  = new DataOutputStream(socket.getOutputStream());

        output.writeUTF("Hello from Client!");
        System.out.println(input.readUTF());
    }
}