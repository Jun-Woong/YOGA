package io.openvidu.js.java.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import io.openvidu.js.java.dto.FAQDto;


@Mapper
public interface FAQDao {
	public List<FAQDto> selectFAQ();
	public FAQDto selectFAQByNo(int no);
	public int insertFAQ(FAQDto FAQ);
	public int updateFAQ(FAQDto FAQ);
	public int deleteFAQ(int no);
}