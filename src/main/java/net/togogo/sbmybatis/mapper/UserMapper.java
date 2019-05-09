package net.togogo.sbmybatis.mapper;

import net.togogo.sbmybatis.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from t_user where id=#{id}")
    User getOneUser(Integer id);
}
