package net.topflow.web;

import com.alibaba.fastjson.JSON;
import net.topflow.dao.inter.TmCaseMapper;
import net.topflow.dao.model.TmCase;
import net.topflow.dao.model.TmCaseExample;
import net.topflow.dao.model.TmUser;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2017/4/30.
 */
@Controller
public class TelWorkController {

    @Autowired
    private SqlSessionFactory sessionFactory;

    @RequestMapping(value = "/telWork/queryMyCases",method = RequestMethod.GET)
    public @ResponseBody String queryMyCases(HttpSession httpSession){
        TmUser tmUser = (TmUser) httpSession.getAttribute("loginUser");

        SqlSession sqlSession = sessionFactory.openSession();
        TmCaseMapper tmCaseMapper = sqlSession.getMapper(TmCaseMapper.class);

        TmCaseExample example = new TmCaseExample();
        TmCaseExample.Criteria criteria = example.createCriteria();
        criteria.andWorkerCodeEqualTo(tmUser.getWorkerCode());
        List<TmCase> tmCaseList = tmCaseMapper.selectByExample(example);

        String jsonArray = JSON.toJSONString(tmCaseList);
        return jsonArray;
    }
}
