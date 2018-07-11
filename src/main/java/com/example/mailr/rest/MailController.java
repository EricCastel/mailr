package com.example.mailr.rest;

import com.example.mailr.service.MailService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("mail")
public class MailController {

    private MailService mailService;

    @GetMapping("send")
    public ResponseEntity<?> sendMail(@RequestHeader("recipient") final String recipient) {
        mailService.sendTo(recipient);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
