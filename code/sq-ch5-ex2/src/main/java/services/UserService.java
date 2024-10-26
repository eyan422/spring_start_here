package services;

import org.springframework.stereotype.Service;
import repositories.CommentRepository;

@Service
public class UserService {

  UserService(CommentRepository commentRepository) {
    this.commentRepository = commentRepository;
  }

  private final CommentRepository commentRepository;

  public CommentRepository getCommentRepository() {
    return commentRepository;
  }
}
