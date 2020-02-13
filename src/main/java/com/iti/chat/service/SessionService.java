package com.iti.chat.service;

import com.iti.chat.model.User;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;

public interface SessionService extends Remote {
    User login(String phone, String password, ClientService client) throws RemoteException, SQLException;
    void logout(User user) throws RemoteException;
    void register(User user, String password) throws RemoteException, SQLException;
    ClientService getClient(User user) throws RemoteException;
    //void updateInfo(User user) throws RemoteException;
}
