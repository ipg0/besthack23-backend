package ru.skolkoushey.ushestimyshey.draft23.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import ru.skolkoushey.ushestimyshey.draft23.domain.dto.HelloMessageDto;

@Controller
public class WebSocketController {
  @MessageMapping("/ping")
  @SendTo("/ws/pong")
  public HelloMessageDto pong() {
    return new HelloMessageDto("hello");
  }
}
