package com.chenge.mysrtp.mapper;

import com.chenge.mysrtp.entity.Posts;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PostsMapper {
    /**
     * 根据指定的关键词搜索帖子详情
     * @param desKeyWords
     * @return
     */
    Posts selectPosts(String desKeyWords);

    /**
     * 管理员向数据库插入帖子
     * @param posts
     * @return
     */
    int insertPosts(Posts posts);

    /**
     * 根据帖子id为推荐的结果进行反馈
     * @param comments
     * @param id
     * @return
     */
    int updateComments(@Param("id") int id, @Param("comments") String comments);
}
