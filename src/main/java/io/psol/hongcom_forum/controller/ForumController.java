package io.psol.hongcom_forum.controller;

import io.psol.hongcom_forum.model.ForumModel;
import io.psol.hongcom_forum.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ForumController {

    @Autowired
    ForumService forumService;

    // @RequestMapping("/")
    public String init() {
        return "index";
    }

    @RequestMapping("/list") // URL 주소
    public ModelAndView list() throws Exception {
        List<ForumModel> forum = forumService.printForum();

        return new ModelAndView("list", "forum", forum);
    }

}
