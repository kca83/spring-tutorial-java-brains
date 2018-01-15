package anderson.katherine.springbootstarter.repository;

import anderson.katherine.springbootstarter.topic.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
}
