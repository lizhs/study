package demo;



import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
class LombokTest {
	private String name;
	private String id;
	
    
    void testLog() {
        String testInfo = "Free flying flowers are like dreams";
        log.info("The test info is :{}", testInfo);
    }
}
 