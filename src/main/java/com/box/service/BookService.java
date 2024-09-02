package com.box.service;

import com.box.dao.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/1/7
 */
@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;
    public String get() {
        return bookMapper.selectById(1);
    }
}
