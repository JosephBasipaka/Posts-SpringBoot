package com.prodapt.learningspring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;


public interface CommentCountRepository extends Repository<Record, Integer>{
  @Query(value = "select count(*) from `comment_record` where post_id = ?1", nativeQuery=true)
  Integer countByPostIdnative(Integer postId);
  
  @Query(value = "select count(*) from CommentRecord c where c.commentId.post.id = ?1")
  Integer countByPostId(Integer postId);
}