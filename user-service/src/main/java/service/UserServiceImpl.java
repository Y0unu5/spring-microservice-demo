package service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.userservice.model.User;

@Service
public class UserServiceImpl implements UserService {

	List<User> list = List.of(new User(1001, "Yunus", 6454563l), new User(1002, "uejdj", 933882L),
			new User(1003, "7463Sam", 6464737L));

	@Override
	public User getUsers(Integer id) {

		return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
