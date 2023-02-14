package nanda.vatsal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kafka.JsonKafkaProducer;
import nanda.vatsal.payload.User;


@RestController
public class JsonMessageController {
	
	@Autowired
	private JsonKafkaProducer jsonKafkaProducer;
	
	@RequestMapping(method=RequestMethod.POST,value="/publishJSONMessage")
	
	//http://localhost:8080/publishMessage/?message=hello world
	public ResponseEntity<String> publish(@RequestBody User user)
	{
		jsonKafkaProducer.sendMessage(user);
		return ResponseEntity.ok("JSON message sent to Kafka Topic");
	}


}
