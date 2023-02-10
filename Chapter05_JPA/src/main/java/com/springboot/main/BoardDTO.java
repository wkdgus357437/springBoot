package com.springboot.main;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@SequenceGenerator(name = "BOARD_SEQ_GENERATOR", sequenceName = "BOARD_SEQ", initialValue = 1, allocationSize = 1)
@Table(name = "board")
public class BoardDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BOARD_SEQ_GENERATOR") // 특정 데이터베이스에 맞게 자동으로 생성하는방식,
																							// 자동으로 시퀀스케이블이 생성된다.
	@Column(name = "seq")
	private int seq;

	@Column(name = "id", nullable = false, unique = true, length = 30) // id 컬럼
	private String id;

	@Column(name = "name", nullable = false, length = 30) // name 컬럼
	private String name;

	@Column(name = "subject") // subject 컬럼
	private String subject;

	@Column(name = "content") // content 컬럼
	private String content;

	@CreationTimestamp // 엔티티가 생성되는 시점의 시간 등록 // logtime 컬럼
	private Timestamp logtime;
}
