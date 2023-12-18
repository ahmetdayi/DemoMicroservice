package com.demo.notificationservice;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TwilioSmsService {

    @Value("${twilio.phone_number}")
    private String phone_number;


    public void smsSender(TwilioSmsRequest request){
        PhoneNumber to = new PhoneNumber(request.phoneNumber());
        PhoneNumber from = new PhoneNumber(phone_number);
       try {
           Message.creator(
                   to,
                   from,
                   request.message()
           ).create();
       }catch (Exception e){
           throw new RuntimeException("Wrong Number");
       }
    }
}
