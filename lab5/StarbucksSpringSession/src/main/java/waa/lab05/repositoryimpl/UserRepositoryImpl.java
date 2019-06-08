package waa.lab05.repositoryimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import waa.lab05.database.Database;
import waa.lab05.domain.User;
import waa.lab05.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository{
	@Autowired
	Database dataBase;
	
	@Override
	public User findUser(String name) {
		return new User(name, dataBase.usersNameToPasswordMap.get(name));
	}

}
