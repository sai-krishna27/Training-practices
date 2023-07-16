package com.sample.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class kafkaController {
private String topic="dataformat";
//String - key - topic type , value indicate the data type of the topic 
@Autowired
KafkaTemplate<String, Object> temp;

//send a string data to a topic 
@GetMapping("/publishstring/{name}")
public String publishMessage(@PathVariable String name){
	temp.send(topic,"hi welcome "+name);
	return "String data has been published to the topic "+topic;
}

//send an object json data 
@GetMapping("/publishobject")
public String publishobjectmsg() {
	User user=new User(1,"datatest");
	temp.send(topic,user);
	return "object data is published to the topic "+topic;
}
	
}

