package io.openvidu.js.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.openvidu.js.java.dao.FAQDao;
import io.openvidu.js.java.dto.FAQDto;


@Service
public class FAQServiceImpl implements FAQService {
    @Autowired
	private FAQDao FAQDao;

    @Override
	public List<FAQDto> retrieveFAQ() {
		return FAQDao.selectFAQ();
	}
    
  	@Override
	public boolean writeFAQ(FAQDto FAQ) {
		return FAQDao.insertFAQ(FAQ) == 1;
	}

	@Override
	public FAQDto detailFAQ(int no) {
		return FAQDao.selectFAQByNo(no);
	}

	@Override
	@Transactional
	public boolean updateFAQ(FAQDto FAQ) {
		return FAQDao.updateFAQ(FAQ) == 1;
	}

	@Override
	@Transactional
	public boolean deleteFAQ(int no) {
		return FAQDao.deleteFAQ(no) == 1;
	}
}