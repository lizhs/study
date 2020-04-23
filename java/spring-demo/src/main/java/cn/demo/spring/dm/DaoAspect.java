package cn.demo.spring.dm;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import cn.demo.spring.domain.entity.City;

@Aspect
@Component
public class DaoAspect {
	private static final Logger logger = LoggerFactory.getLogger(DaoAspect.class);

	// @Pointcut("execution(* cn.demo.spring.domain.CityDao.findByState(..))")
	@Pointcut("execution(* cn.demo..*Dao.*(..))")
	public void pointCutMethod() {
	}

	@Around("pointCutMethod()")
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
		long begin = System.nanoTime();
		System.out.println("before2");
		if ("call".equals(pjp.getArgs()[0])) {
			Object obj = pjp.proceed();
		}
 		City city = new City();
		city.setId(2L);
		long end = System.nanoTime();
		logger.info("调用Dao方法：{}，\n参数：{}，\n执行耗时：{}纳秒，\r\n耗时：{}毫秒，\r\n耗时：{}秒", pjp.getSignature().toString(),
				Arrays.toString(pjp.getArgs()), (end - begin), (end - begin) / 1000000, (end - begin) / 1000000000);
		return city;
	}

}
