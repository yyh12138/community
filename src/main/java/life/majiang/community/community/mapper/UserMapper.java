package life.majiang.community.community.mapper;

import life.majiang.community.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Insert("INSERT INTO user (name,account_id,token,gmt_create,gmt_modified,avatar_url) VALUES (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl})")
    void insert(User user);

    @Select("Select * FROM user WHERE token=#{token}")
    User findByToken(@Param("token") String token);//如果是一个model类可以直接得到，若是变量要加@param注解

    @Select("Select * FROM user WHERE id=#{id}")
    User findById(@Param("id") Integer id);
}

