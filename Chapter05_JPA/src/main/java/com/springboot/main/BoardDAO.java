package com.springboot.main;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//원래는 BaordDAOMyBatis 를 사용하였지면 JPA를 쓰기떄문에 필요가 없다.

@Repository
//public interface BoardDAO  extends JpaRepository<BoardDTO, String>{		
//	<T ->BoardDTO, ID->타입으로 String 으로 진행 > // JpaRepository<BoardDTO, String>에 의해서 자동으로 insert 수행됨

public interface BoardDAO  extends JpaRepository<BoardDTO, Long> {		//시퀀스값이 String에서 int로 바뀌었으니 Long 타입으로 바꿔준다.
	
}

