package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by tsk on 2017/7/11.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloCtrlTest {

    @Autowired
    private TestRestTemplate restTemplate;
    //注入端口号
    @LocalServerPort
    private int port;
     @Test
    public void indexTest(){
         String body=restTemplate.getForObject("/hello",String.class);
         System.out.println(body);
     }
}
