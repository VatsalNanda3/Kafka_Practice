package nanda.vatsal.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
	
	@Bean
	public NewTopic topic()
	{
		return TopicBuilder.name("New_Topic")//topic name
				//.partition(10) can be used to create 10 partitions in the kafka topic, we will use the default partitions provided by the kafka cluster
				.build();
		
		
		
	}
	
	
	@Bean
	public NewTopic JsonTopic()
	{
		return TopicBuilder.name("New_Topic_JSON")//topic name FOR json messages
				
				.build();
		
		
		
	}

}
