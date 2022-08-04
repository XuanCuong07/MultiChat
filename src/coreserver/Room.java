/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coreserver;

import java.util.ArrayList;

/**
 *
 * @author BVCN 88
 */
public class Room {
    public String mMaPhong;
    public String mTenPhong;
    public int mSoNguoi;
    
    ArrayList<User> mListUser = new ArrayList<>();
    
    public void AddUser(User user)
    {
        mListUser.add(user);
    }
    
    public void RemoveUser(User user)
    {
        mListUser.remove(user);
    }
    
    public int CountUser()
    {
        return mListUser.size();
    }
    
    public void SendToAllUser(String sender, String content)
    {
        int size = mListUser.size();
        for (int i = 0; i < size; i++) 
        {
            User user = mListUser.get(i);
            if(user.Send(ActionType.SEND_MESSAGE, ResultCode.OK, sender + ";" + content)==false)
            {
                NotifyJustLeaveRoom(user);
            }
        }
    }
    
    public void UpdateNumberUser()
    {
        int size = mListUser.size();
        for (int i = 0; i < size; i++) 
        {
            User user = mListUser.get(i);
            if(user.Send(ActionType.UPDATE_NUMBER_USER, ResultCode.OK, size + "")==false)
            {
                NotifyJustLeaveRoom(user);
            }
        }
    }
    
    public void NotifyJustJoinRoom(User userJoin)
    {
        int size = mListUser.size();
        for (int i = 0; i < size; i++) 
        {
            User user = mListUser.get(i);
            if(user!=userJoin)
            {
                user.Send(ActionType.NOTIFY_JUST_JOIN_ROOM, ResultCode.OK, userJoin.mNickName);
            }
        }
    }
    public void NotifyJustLeaveRoom(User userLeave)
    {
        int size = mListUser.size();
        for (int i = 0; i < size; i++) 
        {
            User user = mListUser.get(i);
            if(user!=userLeave)
            {
                user.Send(ActionType.NOTIFY_JUST_LEAVE_ROOM, ResultCode.OK, userLeave.mNickName);
            }
        }
    }
}
