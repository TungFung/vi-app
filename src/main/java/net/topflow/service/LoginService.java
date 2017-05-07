package net.topflow.service;

import net.topflow.dao.inter.TmUserMapper;
import net.topflow.dao.model.TmUser;
import net.topflow.dao.model.TmUserExample;
import net.topflow.dto.vo.LoginVo;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by Administrator on 2017/4/30.
 */
@Service
public class LoginService {

    @Autowired
    private SqlSessionFactory sessionFactory;

    public TmUser userLogin(LoginVo loginVo){
        SqlSession sqlSession = sessionFactory.openSession();
        TmUserMapper tmUserMapper = sqlSession.getMapper(TmUserMapper.class);
        TmUserExample example = new TmUserExample();
        TmUserExample.Criteria criteria = example.createCriteria();
        criteria.andEMailAddressEqualTo(loginVo.getEmail());
        List<TmUser> tmUserList = tmUserMapper.selectByExample(example);
        if(!CollectionUtils.isEmpty(tmUserList)){
            return tmUserList.get(0);
        }
        return null;
    }
}
