package nanda.vatsal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kafka.KafkaProducer;

@RestController
public class MessageController {
	
	@Autowired
	private KafkaProducer kafkaProducer;
	
	@RequestMapping("/publishMessage")
	
	//http://localhost:8080/publishMessage/?message=hello world
	public ResponseEntity<String> publish(@RequestParam("message") String message)
	{
		kafkaProducer.sendMessage(message);
		return ResponseEntity.ok("Message sent to the topic");
	}

}
