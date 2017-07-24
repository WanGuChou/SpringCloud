package com.example.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloCtrl {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello/{name}" ,method = RequestMethod.GET)
    public String index(@PathVariable("name") String name) {
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/index, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() );
        return "hello "+name+" !";
    }

}