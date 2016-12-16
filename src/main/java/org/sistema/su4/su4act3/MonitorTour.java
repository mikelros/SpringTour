package org.sistema.su4.su4act3;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MonitorTour {
	
	
	@After("execution(void org.sistema.su4.su4act3.Tour.addTeam(Team))")
	public void addingTeam(JoinPoint joinPoint) {
		Logger logger = Logger.getLogger(MonitorTour.class);
		logger.info("Trying to add team: " + joinPoint.getArgs()[0].toString());
	}
	
	
	@Before("execution(* org.sistema.su4.su4act3.*.toString(..))")
	public void callingToString(JoinPoint joinPoint) {
		Logger logger = Logger.getLogger(MonitorTour.class);
		logger.info("Going to call: " + joinPoint.getSignature().toString());
	}
}
