package com.wen.springcloud.mapper;

import com.wen.springcloud.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * (Payment)表数据库访问层
 *
 * @author makejava
 * @since 2023-02-14 16:58:49
 */
@Mapper
@Repository
public interface UserMapper {
    // 根据id获取数据
    @Select("select id, username, address from tb_user where id = #{id}")
    User getUserById(@Param("id") Long id);
}

