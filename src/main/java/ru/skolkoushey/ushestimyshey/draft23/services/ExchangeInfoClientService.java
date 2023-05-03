package ru.skolkoushey.ushestimyshey.draft23.services;

import java.util.HashSet;

import org.springframework.stereotype.Service;

import ru.skolkoushey.ushestimyshey.draft23.domain.ExchangeInfoClient;
import ru.sovcombank.hackaton.proto.ExchangeInfoMessage;

@Service
public class ExchangeInfoClientService {
  private HashSet<ExchangeInfoClient> clients;

  public ExchangeInfoClient registerClient(String host, Integer port) {
    ExchangeInfoClient client = new ExchangeInfoClient(host, port);
    clients.add(client);
    return client;
  }

  public void unregisterClient(String id) {
    clients.removeIf((client) -> client.getId() == id);
  }

  public ExchangeInfoClient findById(String id) {
    return clients.stream().filter((client) -> client.getId() == id).;
  }
}
