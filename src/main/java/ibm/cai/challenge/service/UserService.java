package ibm.cai.challenge.service;

import ibm.cai.challenge.model.User;
import ibm.cai.challenge.repo.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> findAll() {

        List<User> cities = (List<User>) repository.findAll();
        
        return cities;
    }
}