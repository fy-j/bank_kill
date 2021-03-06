package com.example.bank_kill.mapper;

import com.example.bank_kill.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author jfy
 * @since 2022-05-06
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

}
