package service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import model.Contact;
@Service
public class ContactServiceImpl implements ContactService {

	List<Contact> list = List.of(new Contact(1l, "mkyounus@gmail.om", "yunus", 1001l),
			new Contact(2l, "sam@gmail.om", "Sam", 1001l), new Contact(4l, "kk@gmail.om", "KK", 1002l),
			new Contact(3l, "vj@gmail.om", "VJ", 1003l));

	@Override
	public List<Contact> getContacts(Long userId) {

		return this.list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
