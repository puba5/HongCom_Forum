package io.psol.hongcom_forum.service;

import io.psol.hongcom_forum.model.ForumModel;

import java.util.List;

public interface ForumService {
    List<ForumModel> printForum() throws Exception;
    void createForum(ForumModel forumModel);

}
