package ru.skolkoushey.ushestimyshey.draft23.services;

import org.springframework.stereotype.Service;

@Service
public class TcpMessageService {
    public byte[] processMessage(byte[] message) {
        String messageContent = new String(message);
        String responseContent = String.format("Message \"%s\" is processed", messageContent);
        return responseContent.getBytes();
    }

}