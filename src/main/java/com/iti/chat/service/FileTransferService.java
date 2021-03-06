package com.iti.chat.service;

import com.healthmarketscience.rmiio.RemoteInputStream;
import com.iti.chat.model.User;

import java.io.IOException;
import java.rmi.Remote;

public interface FileTransferService extends Remote {
    void uploadFile(String saveLocation, RemoteInputStream remoteInputStream, ClientService clientService) throws IOException;
    void uploadImage(String saveLocation, RemoteInputStream remoteInputStream, ClientService clientService) throws IOException;
    void downloadFile(String remoteLocation, ClientService clientService) throws IOException;
    void downloadImage(User user, ClientService clientService) throws IOException;
}
