package io.openvidu.js.java.service;

import java.util.List;

import io.openvidu.js.java.dto.FAQDto;


public interface FAQService {
	public List<FAQDto> retrieveFAQ();
	public FAQDto detailFAQ(int no);
	public boolean writeFAQ(FAQDto FAQ);
	public boolean updateFAQ(FAQDto FAQ);
	public boolean deleteFAQ(int no);
}
