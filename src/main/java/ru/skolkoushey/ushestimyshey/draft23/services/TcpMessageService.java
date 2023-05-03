package ru.skolkoushey.ushestimyshey.draft23.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.protobuf.InvalidProtocolBufferException;

import ru.sovcombank.hackaton.proto.ExchangeInfoMessage;

@Service
public class TcpMessageService {
	@Autowired
	ExchangeDataService exchangeDataService;

	public byte[] processMessage(byte[] message) throws InvalidProtocolBufferException {
		ExchangeInfoMessage exchangeMessage = ExchangeInfoMessage.parseFrom(message);

		return exchangeDataService.processMessage(exchangeMessage).toByteArray();
	}
}