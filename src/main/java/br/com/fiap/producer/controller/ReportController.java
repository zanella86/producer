package br.com.fiap.producer.controller;

import br.com.fiap.producer.senders.QueueSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("drone")
public class ReportController {

    @Autowired
    private QueueSender queueSender;

    @PostMapping("/report/status")
    public void send(@RequestBody String status) {
        queueSender.send(status);
    }

}
