package ibm.cai.challenge.repo;

import org.springframework.data.repository.CrudRepository;
import ibm.cai.challenge.model.User;
 
public interface UserRepository extends CrudRepository<User, Long> {}