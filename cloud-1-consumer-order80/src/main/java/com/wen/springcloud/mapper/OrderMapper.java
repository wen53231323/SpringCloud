package com.wen.springcloud.mapper;

import com.wen.springcloud.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OrderMapper {
    @Select("select * from tb_order where id = #{id}")
    Order findById(@Param("id") Long id);
}
