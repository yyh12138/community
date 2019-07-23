package life.majiang.community.community.dto;

import lombok.Data;

@Data
public class CommentCreateDTO {

    //前端传来的模型
    private Long parentId;
    private String content;
    private Integer type;
}
