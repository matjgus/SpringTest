package egovframework.sample.service;

import java.util.List;

public interface SampleService {
	//어떠한 서비스가 있는지 알려주는 인터페이스
	void insertSample(SampleVO vo) throws Exception;
	void updateSample(SampleVO vo) throws Exception;
	void deleteSample(SampleVO vo) throws Exception;
	SampleVO selectSample(SampleVO vo) throws Exception;
	List<SampleVO> selectSampleList(SampleVO vo) throws Exception;
}
