package user.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import user.bean.UserDTO;
import user.service.UserService;

@CrossOrigin //React와 연결
@RestController 
		//@RestController= @Controller + @RequestBody
		//@RestController를 쓰기떄문에 따로 @RequestBody 할 필요 없다.
@RequestMapping(value = "user")
public class UserController {

	@Autowired
	private UserService userService;
	
	// 두번쨰
	// WriteForm.js ->데이터 등록 및 전송 axios.post()
	@PostMapping(path = "write") //@PostMapping(value = "write") value가 아니라 path로 변경
	public void write(@ModelAttribute UserDTO userDTO) {
		userService.write(userDTO);
		
	}
	/*
	// 첫번째
	@PostMapping(value = "write")
	public void write(@RequestBody UserDTO userDTO) {
		userService.write(userDTO);

	}
	 */
	
	// WriteForm.js 유효성 검사 axios.get() 
	@GetMapping(path = "isExistId") // value를 path로
	public String isExistId(@RequestParam String id) {
		return userService.isExistId(id);
		
	}
	
	
	// List.js - 데이터 조회 axios.get() 
	@GetMapping(path = "getUserList") // @GetMapping(value = "getUserList")의 value를 path로
	public List<UserDTO> getUserList() { // DTO 여러개를 다 가져와야 하니 list에 담아온다.
		return userService.getUserList();
	}
	
	
	// UpdateForm.js - 수정 axios.put() 
	@PutMapping(path = "update") //  value를 path로
	public void update(@ModelAttribute UserDTO userDTO) {
		userService.update(userDTO);

	}
	
	
	// UpdateForm.js , DeleteForm.js -유효성 검사 axios.get()
	@GetMapping(path = "getUser")  // value를 path로
	public Optional<UserDTO> getUser(@RequestParam String id) {
		return userService.getUser(id);
	}
	
	
	// DeleteForm.js - 삭제 axios.delete() 
	@DeleteMapping(path = "delete") //  value를 path로
	public void delete(@RequestParam String id) {
		userService.delete(id);
	}
	
	
	@GetMapping(path = "search")
	public List<UserDTO> search(@RequestParam Map<String, String> map) {//searchOption, keyword
		return userService.search(map); 
		
	}
	
	
	
	/*
	
	@GetMapping(value = "writeForm")
	public String writeForm() {
		return "/user/writeForm";
	}
	
	@PostMapping(value = "write")
	
	public void write(@ModelAttribute UserDTO userDTO) { // void 있으니, @ResponseBody를 쓰고 dispatcer로 가지못하게,,
		userService.write(userDTO);

	}

	@GetMapping(value = "list") // 데이터는 동적으로 끌고 올거임
	public String list() {

		return "user/list";
	}

	@PostMapping(value = "getUserList")
	
	public List<UserDTO> getUserList() { // DTO 여러개를 다 가져와야 하니 list에 담아온다.
		return userService.getUserList();
	}

	@PostMapping(value = "isExistId")
	
	public String isExistId(@RequestParam String id) {
		return userService.isExistId(id);

	}

	@GetMapping(value = "updateForm")
	public String updateForm() {

		return "user/updateForm";
	}

	@PostMapping(value = "getUser")
	
	public Optional<UserDTO> getUser(@RequestParam String id) {
		return userService.getUser(id);
	}
	
	@PostMapping(value = "update")
	
	public void update(@ModelAttribute UserDTO userDTO) { // void 있으니, @ResponseBody를 쓰고 dispatcer로 가지못하게,,
		userService.update(userDTO);

	}
	
	@GetMapping(value = "deleteForm")
	public String deleteForm() {

		return "user/deleteForm";
	}
	
	@PostMapping(value = "delete")
	
	public void delete(@RequestParam String id) { // void 있으니, @ResponseBody를 쓰고 dispatcer로 가지못하게,,
		userService.delete(id);

	}
	
	@PostMapping(value = "search")
	
	public List<UserDTO> search(@RequestParam Map<String, String> map) {//searchOption, keyword
		return userService.search(map); 
		
	}
	*/
	
}
