package net.topflow.dao.inter;

import net.topflow.config.RootConfig;
import net.topflow.dao.model.TmCase;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.InputStream;

/**
 * Created by Administrator on 2017/4/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class TmCaseMapperTest {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void test() throws Exception{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        TmCaseMapper tmCaseMapper = session.getMapper(TmCaseMapper.class);
        int count = tmCaseMapper.insert(new TmCase());
        Assert.assertEquals(1,count);
    }

    @Test
    public void test2(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TmCaseMapper tmCaseMapper = sqlSession.getMapper(TmCaseMapper.class);
        int count = tmCaseMapper.insert(new TmCase());
        sqlSession.close();
        Assert.assertEquals(1,count);
    }
}
