package io.psol.hongcom_forum.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ForumModel {
    private int id;
    private String title;
    private String contents;
    private String writer;
    private Date date;
    private int like;
}
