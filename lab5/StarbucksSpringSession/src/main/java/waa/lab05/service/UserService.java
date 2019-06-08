package waa.lab05.service;

import waa.lab05.domain.User;

public interface UserService {
	boolean authenticate(User user);
}
