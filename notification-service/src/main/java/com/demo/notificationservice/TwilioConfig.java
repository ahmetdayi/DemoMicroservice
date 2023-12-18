package com.demo.notificationservice;

import com.twilio.Twilio;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
public class TwilioConfig {
    @Value("${twilio.account_sid}") String account_sid;

    @Value("${twilio.auth_token}") String auth_token;

    @PostConstruct
    public void starterTwilio(){
    Twilio.init(account_sid, auth_token);
}
}
