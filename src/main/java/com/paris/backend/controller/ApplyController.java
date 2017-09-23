package com.paris.backend.controller;

import com.paris.backend.model.HlShenqing;
import com.paris.backend.model.HlShenqings;
import com.paris.backend.model.User;
import com.paris.backend.service.ApplyService;
import com.paris.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/9/21.
 */

@Controller
public class ApplyController {

    @Autowired
    private UserService userService;

    @Autowired
    private ApplyService applyService;

    // 比赛申请表页面
    @RequestMapping(value={"/shenqing"}, method = RequestMethod.GET)
    public ModelAndView apply() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("application");
        return modelAndView;
    }

    // 比赛申请表提交
    // post请求获取请求参数细节：参考博客：http://blog.csdn.net/qq_31001665/article/details/71075743
    @PostMapping(value="/applySubmit")
    public ModelAndView applySubmit(HlShenqing hlShenqing,String[] ZuBie,int[] ShuLiang){

        ModelAndView modelAndView = new ModelAndView();

        // 封装所有申请组别信息
        List<HlShenqings> hlShenqingss = new ArrayList<HlShenqings>();
        if(null !=ZuBie ) {
            for (int i = 0; i < ZuBie.length; i++) {
                HlShenqings hlShenqings = new HlShenqings(ZuBie[i], ShuLiang[i]);
                hlShenqingss.add(hlShenqings);
            }
        }

        applyService.addApply(hlShenqing);                              // 申请表申请信息
        for(int i = 0;i < hlShenqingss.size();i++){
            applyService.addHlShenqings(hlShenqingss.get(i));              // 申请表下的组别和数量
        }

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());
        modelAndView.addObject("userName", "Welcome " + user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")");
        modelAndView.addObject("adminMessage","Content Available Only for Users with Admin Role");
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
