/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coreserver;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BVCN 88
 */
public class User {
    Socket mSocket;
    BufferedReader mBufferReader;
    DataOutputStream mDataOutputStream;
    public String mNickName;
    public Room mRoom;
    public Date mTimeConnect; //thời gian kết nối đến server
    public boolean mLogined = false;   //trạng thái đã đăng nhập hay chưa
    public User(Socket socket) throws IOException
    {
        mSocket = socket;
        mBufferReader = new BufferedReader(new InputStreamReader(mSocket.getInputStream(), "UTF8"));
        mDataOutputStream = new DataOutputStream(mSocket.getOutputStream());  //user nhận bằng DataInputStream nên gửi về bằng DataOutputStream
    }
    
    public String Read() throws IOException
    {
        if(mBufferReader.ready())
        {
            return mBufferReader.readLine();
        }
        return null;
    }
    
    public boolean Ready() throws IOException
    {
        return mBufferReader.ready();
    }

    public Boolean Send(String actionType, String resultCode, String content)
    {
        try 
        {
            mDataOutputStream.writeUTF(actionType + ";" + resultCode + ";" + content);
            return true;
        } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public Boolean IsOnline()
    {
        return Send(ActionType.CHECK_ONLINE, ResultCode.OK, "");
    }
}
