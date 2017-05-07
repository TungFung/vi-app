package net.topflow.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

/**
 * Created by Administrator on 2017/4/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class RootConfigTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Autowired
    private MapperScannerConfigurer mapperScannerConfigurer;

    @Test
    public void shouldReturnDataSource(){
        Assert.assertNotNull(dataSource);
    }

    @Test
    public void shouldReturnSqlSessionFactory(){
        Assert.assertNotNull(sqlSessionFactory);
    }

    @Test
    public void shouldReturnMapperScannerConfigurer(){
        Assert.assertNotNull(mapperScannerConfigurer);
    }

}
