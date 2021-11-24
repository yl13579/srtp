package com.chenge.mysrtp.mapper;

import com.chenge.mysrtp.entity.RawPosts;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RawPostsMapper {
    RawPosts selectPost(int id);
    int insertPost(RawPosts rawPosts);
    List<RawPosts> selectAllPosts();
}
