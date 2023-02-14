package kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import nanda.vatsal.payload.User;

@Service
public class JsonKafkaProducer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);
	
	@Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

	
	public void sendMessage(User data)
	{
		LOGGER.info(String.format("Message received %s", data.toString()));
		Message<User> message=MessageBuilder
				.withPayload(data)
				.setHeader(KafkaHeaders.TOPIC,"New_Topic_JSON")
				.build(); 
		kafkaTemplate.send(message);
	}

}
