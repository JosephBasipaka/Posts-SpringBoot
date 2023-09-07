package com.prodapt.learningspring.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.prodapt.learningspring.entity.Comment;


public interface CommentCRUDRepository extends CrudRepository<Comment, Long>{
    @Query(value = "select * from comments c where post_id = ?1", nativeQuery = true)
    List<Comment> findAllByPostId(Long postId);

    
}

