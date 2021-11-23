import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import egovframework.sample.service.SampleService;
import egovframework.sample.service.SampleVO;

public class SampleServiceClient {

	public static void main(String[] args) throws Exception {
	AbstractApplicationContext container = new GenericXmlApplicationContext("egovframework/spring/context-*.xml");

	SampleService samplesv=(SampleService)container.getBean("sampleService");

	SampleVO vo=new SampleVO();
	
	vo.setTitle("idgnr 테스트");
	vo.setRegUser("사용자");
	vo.setContent("글증가 테스트...");
	samplesv.insertSample(vo);
	
	container.close();
	
	
	}

}
