package net.topflow.web;

import net.topflow.dao.model.TmUser;
import net.topflow.dto.vo.LoginVo;
import net.topflow.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/4/29.
 */
@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String welcome(){
        return "redirect:views/login.jsp";
    }

    @RequestMapping(value = {"/login"},method = RequestMethod.POST)
    public String login(LoginVo loginVo,HttpSession httpSession){
        logger.info("login user email[{}]",loginVo.getEmail());
        logger.info("login user password[{}]",loginVo.getPassword());
        TmUser tmUser = loginService.userLogin(loginVo);
        if(tmUser != null){
            httpSession.setAttribute("loginUser",tmUser);
            return "redirect:views/home.jsp";
        }
        return "redirect:views/login.jsp";
    }
}
