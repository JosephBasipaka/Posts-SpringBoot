package com.prodapt.learningspring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Entity
public class CommentRecord {
  
	@Column(unique=true)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@EmbeddedId
	private CommentId commentId;
	
	@Column
	private String content;
	
	
  
	public CommentRecord() {
	}


	public CommentRecord(int id, CommentId commentId, String content) {
		super();
		this.id = id;
		this.commentId = commentId;
		this.content = content;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CommentId getCommentId() {
		return commentId;
	}

	public void setCommentId(CommentId commentId) {
		this.commentId = commentId;
	}

  
}