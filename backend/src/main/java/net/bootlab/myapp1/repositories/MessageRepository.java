package net.bootlab.myapp1.repositories;

import net.bootlab.myapp1.model.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "messages")
public interface MessageRepository extends CrudRepository<Message, Long> {
}
