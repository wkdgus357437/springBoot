package user.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import user.bean.UserDTO;

public interface UserService {

	
	public void write(UserDTO userDTO); // 글쓰기

	public List<UserDTO> getUserList(); // 글쓰기 목록

	public String isExistId(String id);

	public Optional<UserDTO> getUser(String id);

	public void update(UserDTO userDTO); // 수정

	public void delete(String id); // 삭제

	public List<UserDTO> search(Map<String, String> map);

}
