package com.example.win81.e_lib;

import java.util.Date;

/**
 * Created by Hagar on 2016-12-19.
 */

public class Comment {
    int commentID;
    String commentContent;
    Date commentDate;
    Material r = new Material();

    public void setCommentID(int commentID){
        this.commentID = commentID;
    }

    public int getCommentID(){
        return commentID;
    }

    public void setCommentContent(String commentContent){
        this.commentContent = commentContent;
    }

    public String getCommentContent(){
        return commentContent;
    }


}
