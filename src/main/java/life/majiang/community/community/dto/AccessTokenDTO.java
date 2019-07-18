package life.majiang.community.community.dto;

import lombok.Data;

@Data
public class AccessTokenDTO {//数据传输模型
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
