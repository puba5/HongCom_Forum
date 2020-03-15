package io.psol.hongcom_forum.DAO;

import io.psol.hongcom_forum.model.ForumModel;

import java.util.List;

public interface ForumDao {

    // 글목록
    public List<ForumModel> getForum() throws Exception;

    // C 글작성
    public void create(ForumModel forumModel);

    // R

    // U

    // D
}
