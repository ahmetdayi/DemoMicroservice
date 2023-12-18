package com.demo.notificationservice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationListener {

//    private final TwilioSmsService twilioSmsService;
//
//    public NotificationListener(TwilioSmsService twilioSmsService) {
//        this.twilioSmsService = twilioSmsService;
//    }

    @KafkaListener(
            topics = "notification",
            groupId = "groupId"
    )
    void listener(String data) {
//        TwilioSmsRequest twilioSmsRequest = new TwilioSmsRequest("+4915752057550",data);
//        twilioSmsService.smsSender(twilioSmsRequest);
    }
}
