package life.majiang.community.community.model;

import lombok.Data;

@Data
public class User {
    private String name;
    private Integer id;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}
