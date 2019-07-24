package life.majiang.community.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND(2001,"您找的问题不在了，换一个试试？"),
    TARGET_PARAM_NOT_FOUND(2002,"为选中任何问题或评论进行回复"),
    NO_LOGIN(2003,"当前操作需登录，请登录后重试"),
    SYS_ERROR(2004,"服务器繁忙，请稍后再试..."),
    TYPE_PARAM_WRONG(2005,"评论类型错误或不存在"),
    COMMENT_NOT_FOUND(2006,"您回复的评论不在了，换一个试试？"),
    COMMENT_IS_EMPTY(2007,"输入内容不能为空");


    private String message;
    private Integer code;

    CustomizeErrorCode(Integer code,String message) {
        this.message = message;
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

}
