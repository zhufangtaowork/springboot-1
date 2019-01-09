package com.zhanghan.zhboot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@Data
@ConfigurationProperties(prefix = "user.datasource.redis")
public class UserDataSourceProperties {

    private String url;

    private String username;

    private String password;

    private Integer connectionTimeout;

    private Integer idleTimeout;

    private Integer maxLifetime;

    private Integer maximumPoolSize;

    private Integer minimumIdle;



}