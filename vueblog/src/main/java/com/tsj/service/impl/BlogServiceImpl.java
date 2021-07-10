package com.tsj.service.impl;

import com.tsj.entity.Blog;
import com.tsj.mapper.BlogMapper;
import com.tsj.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author crazy seikwan
 * @since 2021-07-08
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
