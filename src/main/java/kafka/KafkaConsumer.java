package kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
	
	@KafkaListener(topics="New_Topic",groupId="myGroup")//From the topic New_Topic, the message is receieved and the consumer groupID is myGroup
	public void consume(String message) {
		LOGGER.info(String.format("Message received %s", message));
		
		
	}

}

