package net.topflow.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.io.InputStream;

/**
 * Created by Administrator on 2017/4/29.
 */
@Configuration
@ComponentScan(basePackages = {"net.topflow"},excludeFilters = {@Filter(type= FilterType.ANNOTATION,value = EnableWebMvc.class)})
public class RootConfig {

    @Bean
    public SqlSessionFactory sqlSessionFactory(){
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try{
            inputStream = Resources.getResourceAsStream(resource);
        }catch (Exception e){

        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return  sqlSessionFactory;
    }

}
