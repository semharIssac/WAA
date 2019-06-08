package waa.lab05.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import waa.lab05.domain.User;
import waa.lab05.repository.UserRepository;
import waa.lab05.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository userRepository;
	
	@Override
	public boolean authenticate(User user) {
		if((user == null) || (user.getUserName() == null)) return false;
		return user.equals(userRepository.findUser(user.getUserName()));
	}

}
