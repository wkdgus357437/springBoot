package user.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import user.bean.UserDTO;

@Repository
public interface UserDAO extends JpaRepository<UserDTO, String>{


//첫번째	- 쿼리 메소드
//public List<UserDTO> findByNameContaining(String keyword);	
//public List<UserDTO> findByIdContaining(String keyword);

//두번째 - @Query 어노테이션
// ?1 는 첫번째 파라미터를 의미

/*
@Query("select userDTO from UserDTO userDTO where userDTO.name like '%' || ?1 || '%'") // 테이블 이름은 쓰지 않는다. 테이블로 바로 접근하는게 아니라 UserDTO에 접근한다.
public List<UserDTO> getUserSearchName(String keyword);

@Query("select userDTO from UserDTO userDTO where userDTO.id like '%' || ?1 || '%'")
public List<UserDTO> getUserSearchId(String keyword);
*/
	@Query("select userDTO from UserDTO userDTO where userDTO.name like '%' || :keyword || '%'") // 테이블 이름은 쓰지 않는다. 테이블로 바로 접근하는게 아니라 UserDTO에 접근한다.
	public List<UserDTO> getUserSearchName(@Param( "keyword") String keyword);

	@Query("select userDTO from UserDTO userDTO where userDTO.id like '%' || :keyword || '%'")
	public List<UserDTO> getUserSearchId(@Param( "keyword") String keyword);
}

