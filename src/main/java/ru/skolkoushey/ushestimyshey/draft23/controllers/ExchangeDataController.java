package ru.skolkoushey.ushestimyshey.draft23.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import ru.skolkoushey.ushestimyshey.draft23.services.TcpMessageService;

@MessageEndpoint
public class ExchangeDataController {
    private TcpMessageService messageService;

    @Autowired
    public ExchangeDataController(TcpMessageService messageService) {
        this.messageService = messageService;
    }

    @ServiceActivator(inputChannel = "inboundChannel")
    public byte[] process(byte[] message) {
        return messageService.processMessage(message);
    }
}