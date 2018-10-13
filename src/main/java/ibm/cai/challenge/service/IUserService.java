package ibm.cai.challenge.service;

import ibm.cai.challenge.model.User;
import java.util.List;

public interface IUserService {

    public List<User> findAll();
}