package com.publisher;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.config.MessagingConfig;
import com.dto.Traveller;
import com.dto.User;

@RestController
@RequestMapping("/add")
@CrossOrigin(origins="http://localhost:4200")  
public class UpdatePublisher {

	
	@Autowired
    private RabbitTemplate template;
     
	//creating a post mapping to publish an add message to the queue
    @PostMapping("/{username}")  
	private String saveTraveller(@RequestBody Traveller journey,@PathVariable("username") String username)   
	{  
	 journey.setUser(new User(username,""));
	 template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, journey);
	 return "Added";
	}  
}
