package ru.skolkoushey.ushestimyshey.draft23.services;

import org.springframework.stereotype.Service;

import ru.sovcombank.hackaton.proto.ExchangeInfoMessage;
import ru.sovcombank.hackaton.proto.MessageEnumsProto;

@Service
public class ExchangeDataService {
  public ExchangeInfoMessage processMessage(ExchangeInfoMessage message) {
    if(message.hasRequest())
      return handleRequest(message);
    if(message.hasResponse())
      return handleResponse(message);
    if(message.hasEvent())
      return handleEvent(message);
    return null; // TODO(@notblank00): implement error response or whatever
  }

  public ExchangeInfoMessage handleRequest(ExchangeInfoMessage requestMessage) {
    if(requestMessage.getRequest().getCommand() == MessageEnumsProto.CommandType.ctHandshake) {
      
    }
  }

  public ExchangeInfoMessage handleResponse(ExchangeInfoMessage responseMessage) {
    return null;
  }

  public ExchangeInfoMessage handleEvent(ExchangeInfoMessage responseMessage) {
    return null;
  }
}
