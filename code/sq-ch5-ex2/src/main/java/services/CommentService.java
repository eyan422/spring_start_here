package services;

import org.springframework.stereotype.Service;
import repositories.CommentRepository;

@Service
public class CommentService {

  CommentService(CommentRepository commentRepository) {
    this.commentRepository = commentRepository;
  }

//  @Autowired
  private final CommentRepository commentRepository;

  public CommentRepository getCommentRepository() {
    return commentRepository;
  }
}
