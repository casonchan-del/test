package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import xyz.erupt.core.annotation.EruptScan;
import javax.persistence.*;
import xyz.erupt.annotation.*;
import xyz.erupt.annotation.sub_erupt.*;
import xyz.erupt.annotation.sub_field.*;
import xyz.erupt.annotation.sub_field.sub_edit.*;
import xyz.erupt.upms.model.base.HyperModel;
import xyz.erupt.jpa.model.BaseModel;
import java.util.Set;
import java.util.Date;


import java.awt.*;
import java.net.URI;

@SpringBootApplication
@EntityScan
@EruptScan
public class DemoApplication extends SpringBootServletInitializer {

    //详细使用方法详见项目内 README.md 文件说明
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        try {
            System.setProperty("java.awt.headless", "false");
            Desktop.getDesktop().browse(new URI("http://localhost:8080"));
        } catch (Exception ignore) {
        }
        System.err.println("详细使用方法，请阅读：README.md");
    }

    //打WAR包的配置
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoApplication.class);
    }
}