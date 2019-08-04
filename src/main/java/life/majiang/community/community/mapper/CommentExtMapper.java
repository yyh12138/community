package life.majiang.community.community.mapper;

import life.majiang.community.community.model.Comment;
import org.mybatis.spring.annotation.MapperScan;


public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}
