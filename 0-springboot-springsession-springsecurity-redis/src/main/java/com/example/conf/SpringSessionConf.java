package com.example.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by tsk on 2017/7/18.
 */
@Configuration
@EnableRedisHttpSession
public class SpringSessionConf {

    @Bean
    public JedisConnectionFactory connectionFactory(){
        return  new JedisConnectionFactory();
    }
}
