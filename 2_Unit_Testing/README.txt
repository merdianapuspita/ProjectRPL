Readme2: Unit Testing

----Client Server Chat----

To test my code, you have to run 2 source code (available in folder "code) 

When the first code, client.java is running, the chat will open between client and server. Then you need to run the next code which is the server.java.
After server.java is running, the chat room is connected. To test if the decryption is running or not, you need to type message in the server chat window,
the app will decrypt your message into secret code which is only can be encrypt by client. I simulated a decrypt simulator using a simple ASCI code.
Each character you type in the chat window has it's own secret code. To end this conversation you just click button X on both chat window
 
----Algorithms----
HOW TO TEST :

The program consist of two source codes : server.java and client.java

server.java is used to open server chat window and cannot be viewed by client
client.java is used to open client chat window and only cannot be viewed by server

Both chat window using encryption and decryption techniques to send and read message

To test the program you have to run the client.java first, then run the server.java