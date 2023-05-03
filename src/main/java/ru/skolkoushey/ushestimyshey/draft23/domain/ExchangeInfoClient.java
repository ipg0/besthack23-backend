package ru.skolkoushey.ushestimyshey.draft23.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import lombok.Getter;
import ru.sovcombank.hackaton.proto.ExchangeInfoMessage;

@Getter
public class ExchangeInfoClient {
  private String id;
  private String host;
  private Integer port;

  // maps messageNum to request message
  private Map<String, ExchangeInfoMessage> openSessions;

  public ExchangeInfoClient(String host, Integer port) {
    this.id = UUID.randomUUID().toString();
    this.host = host;
    this.port = port;
    this.openSessions = new HashMap<String, ExchangeInfoMessage>();
  }

  public void openSession(ExchangeInfoMessage message) {
    if (!message.hasRequest())
      return;
    openSessions.put(message.getHeader().getMessageNum(), message);
  }

  public void resolveSession(String messageNum) {
    openSessions.remove(messageNum);
  }

  public void getSession(String messageNum) {
    openSessions.get(messageNum);
  }
}
