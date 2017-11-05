package com.bandw.branddiary.api;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;


/**
 * @author bandw
 * date: 2017-05-25
 * 主程序
 */
@Configuration
@EnableConfigurationProperties
@EnableAutoConfiguration
@ComponentScan
public class Application 
{

    public static void main( String[] args ) throws IOException
    {
    	new SpringApplicationBuilder()
        .sources(Application.class)
        .bannerMode(Banner.Mode.OFF)
        .run(args);
    }
}
