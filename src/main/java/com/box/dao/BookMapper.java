package com.box.dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/1/7
 */
@Mapper
public interface BookMapper {
    String selectById(Integer id);
}
