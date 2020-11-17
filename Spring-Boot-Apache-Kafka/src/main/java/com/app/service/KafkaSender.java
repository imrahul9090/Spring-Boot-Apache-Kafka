package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	String kafkaTopic = "SpringKafkaMessage";

	public void send(String message) {

		kafkaTemplate.send(kafkaTopic, message);
	}
}
