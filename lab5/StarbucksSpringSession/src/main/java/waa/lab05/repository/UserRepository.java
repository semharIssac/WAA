package waa.lab05.repository;

import waa.lab05.domain.User;

public interface UserRepository {
	User findUser(String name);
}
