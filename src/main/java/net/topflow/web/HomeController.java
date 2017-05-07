package net.topflow.web;

import net.topflow.dao.model.TmUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/30.
 */
@Controller
public class HomeController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/showUserName",method = RequestMethod.GET)
    public @ResponseBody Map<String, Object> showUserName(HttpSession httpSession){
        Map<String,Object> map = new HashMap<>();
        TmUser tmUser = (TmUser) httpSession.getAttribute("loginUser");
        if(tmUser != null){
            logger.info("session user[{}]",tmUser.getWorkerCode());
            map.put("workerCode",tmUser.getWorkerCode());
        }
        return map;
    }
}
