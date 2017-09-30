package com.paris.backend.controller;

import com.paris.backend.model.*;
import com.paris.backend.service.ApplyService;
import com.paris.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
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
    @RequestMapping(value = {"/addShenqing"}, method = RequestMethod.GET)
    public ModelAndView addShenqing() {

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("application");

        return modelAndView;
    }

    // 比赛申请表列表页面
    @RequestMapping(value = {"/shenqing"}, method = RequestMethod.GET)
    public ModelAndView shenqinglist() {

        ModelAndView modelAndView = new ModelAndView();

        List<HlShenqing> hlShenqings = applyService.getAllHlShenqings();
        modelAndView.addObject("hlShenqings", hlShenqings);

        modelAndView.setViewName("shengqing");
        return modelAndView;
    }

    // 比赛申请表审核列表页面
    @RequestMapping(value = {"/shenqingsh"}, method = RequestMethod.GET)
    public ModelAndView shenqingshlist() {

        ModelAndView modelAndView = new ModelAndView();

        List<HlShenqing> hlShenqings = applyService.getAllHlShenqings();
        modelAndView.addObject("hlShenqings", hlShenqings);

        modelAndView.setViewName("shenqingsh");
        return modelAndView;
    }

    // 可报名的比赛，报名入口
    @RequestMapping(value = {"/baoming"}, method = RequestMethod.GET)
    public ModelAndView bsbaominglist() {

        ModelAndView modelAndView = new ModelAndView();

        List<HlShenqing> hlShenqings = applyService.getAllHlShenqings();
        modelAndView.addObject("hlShenqings", hlShenqings);

        modelAndView.setViewName("bsbaominglist");
        return modelAndView;
    }

    // 比赛申请表提交
    // post请求获取请求参数细节：参考博客：http://blog.csdn.net/qq_31001665/article/details/71075743
    @PostMapping(value = "/applySubmit")
    public String applySubmit(HlShenqing hlShenqing, String[] leiBie, String[] ZuBie, int[] ShuLiang) {

        // http://blog.csdn.net/mimi5821741/article/details/41865555 实体关系映射属性
        // http://www.jianshu.com/p/0a2163273b3e 一对多实体映射
        // http://www.cnblogs.com/dreamroute/p/5173896.html jpa
        ModelAndView modelAndView = new ModelAndView();

        // 封装所有申请组别信息
        List<HlShenqings> hlShenqingss = new ArrayList<HlShenqings>();
        if (null != ZuBie) {
            for (int i = 0; i < ZuBie.length; i++) {
                HlShenqings hlShenqings = new HlShenqings(leiBie[i], ZuBie[i], ShuLiang[i]);
                hlShenqingss.add(hlShenqings);
            }
        }
        hlShenqing.setHlShenqings(hlShenqingss);
        applyService.addApply(hlShenqing);                              // 保存申请表申请信息

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());
        modelAndView.addObject("userName", "Welcome " + user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")");
        modelAndView.addObject("adminMessage", "Content Available Only for Users with Admin Role");
        modelAndView.setViewName("index");
        return "redirect:/shenqing.action";
    }

    // 比赛申请表修改页面
    @RequestMapping(value = "/editHlShenqing", method = RequestMethod.POST)
    public String updateHlShenqing(HlShenqing hlShenqing, String[] leiBie, String[] ZuBie, int[] ShuLiang) {

        ModelAndView modelAndView = new ModelAndView();

        // 封装所有申请组别信息
        List<HlShenqings> hlShenqingss = new ArrayList<HlShenqings>();
        if (null != ZuBie) {
            for (int i = 0; i < ZuBie.length; i++) {
                HlShenqings hlShenqings = new HlShenqings(leiBie[i], ZuBie[i], ShuLiang[i]);
                hlShenqingss.add(hlShenqings);
            }
        }
        hlShenqing.setHlShenqings(hlShenqingss);
        applyService.addApply(hlShenqing);                              // 保存申请表申请信息

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());
        modelAndView.addObject("userName", "Welcome " + user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")");
        modelAndView.addObject("adminMessage", "Content Available Only for Users with Admin Role");


        return "redirect:/shenqing.action";
    }

    // 比赛申请表修改
    @RequestMapping(value = "/editHlShenqing", method = RequestMethod.GET)
    public ModelAndView editHlShenqing(WebRequest request) {

        ModelAndView modelAndView = new ModelAndView();
        Integer id = Integer.valueOf(request.getParameter("id"));
        HlShenqing hlShenqing = applyService.findHlShenqingById(id);
        List<HlShenqings> hlShenqings = hlShenqing.getHlShenqings();
        modelAndView.addObject("hlShenqing", hlShenqing);
        modelAndView.addObject("hlShenqings", hlShenqings);

        modelAndView.setViewName("editHlShenqing");
        return modelAndView;
    }

    // 比赛申请表删除
    @RequestMapping(value = "/deleteHlShenqing", method = RequestMethod.GET)
    public String deleteHlShenqing(WebRequest request) {

        ModelAndView modelAndView = new ModelAndView();
        Integer id = Integer.valueOf(request.getParameter("id"));
        List<HlShenqing> hlShenqings = applyService.deleteHlShenqingById(id);
        return "redirect:/shenqing.action";

    }

}
