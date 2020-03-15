package io.psol.hongcom_forum.controller;

import io.psol.hongcom_forum.model.ForumModel;
import io.psol.hongcom_forum.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ForumController {

    @Autowired
    ForumService forumService;

    @RequestMapping("/")
    public String init() {
        return "Hellow, world!";
    }

    @RequestMapping("/list")    // URL 주소
    public List<ForumModel> list() throws Exception {
        List<ForumModel> forum = forumService.printForum();

        return forum;
    }
    /*          이렇게하면 모델로 보내짐
    @ResponseBody
    public ModelAndView list() throws Exception {
        List<ForumModel> forum = forumService.printForum();

        return new ModelAndView("list", "forum", forum);
    }
    */


}
