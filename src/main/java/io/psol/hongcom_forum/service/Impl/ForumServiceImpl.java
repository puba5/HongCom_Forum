package io.psol.hongcom_forum.service.Impl;

import io.psol.hongcom_forum.DAO.ForumDao;
import io.psol.hongcom_forum.model.ForumModel;
import io.psol.hongcom_forum.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForumServiceImpl implements ForumService {

    @Autowired
    private ForumDao dao;

    @Override
    public List<ForumModel> printForum() throws Exception {
        List<ForumModel> forum = dao.getForum();
        return forum;
    }

    @Override
    public void createForum(ForumModel forumModel) {
        dao.create(forumModel);
    }

}
