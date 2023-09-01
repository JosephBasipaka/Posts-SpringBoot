package com.prodapt.learningspring.repository;

import org.springframework.data.repository.CrudRepository;

import com.prodapt.learningspring.entity.CommentId;
import com.prodapt.learningspring.entity.CommentRecord;
import com.prodapt.learningspring.entity.Post;

public interface CommentCRUDRepository extends CrudRepository<CommentRecord, CommentId>{
  public Integer countByCommentIdPost(Post post);
}