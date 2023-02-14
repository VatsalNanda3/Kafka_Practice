package kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import nanda.vatsal.payload.User;

@Service
public class JsonKafkaConsumer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
	
	@KafkaListener(topics="New_Topic_JSON",groupId="myGroup")//From the topic New_Topic_JSON, the message is receieved and the consumer groupID is myGroup
	public void consume(User user) {
		LOGGER.info(String.format("Json Message received %s", user.toString()));
		
		
	}

}
