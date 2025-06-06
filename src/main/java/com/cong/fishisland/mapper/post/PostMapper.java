package com.cong.fishisland.mapper.post;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cong.fishisland.model.entity.post.Post;
import java.util.Date;
import java.util.List;

/**
 * 帖子数据库操作
 * # @author <a href="https://github.com/lhccong">程序员聪</a>
 */
public interface PostMapper extends BaseMapper<Post> {

    /**
     * 查询帖子列表（包括已被删除的数据）
     */
    List<Post> listPostWithDelete(Date minUpdateTime);

}




