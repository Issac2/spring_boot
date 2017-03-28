package com.hry.spring.async;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * 通过XML启动异步
 * @author hry
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootApplication
@ImportResource("classpath:/async/spring_async.xml")
public class AsyncApplicationWithXML {
	private static final Logger log = LoggerFactory.getLogger(AsyncApplicationWithXML.class);
	
	public static void main(String[] args) {
		log.info("Start AsyncApplication.. ");
		SpringApplication.run(AsyncApplicationWithXML.class, args);
	}
}
