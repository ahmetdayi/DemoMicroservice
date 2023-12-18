package com.demo.notificationservice;


public record TwilioSmsRequest(
        String phoneNumber,
        String message
) {
}
