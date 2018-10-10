package com.springrecipes.beans;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.Before;
import org.apache.commons.logging.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import java.util.Arrays;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Aspect
@Component
public class CalculatorLoggingAspect {


	private  Log log=LogFactory.getLog(this.getClass());
	@Before("execution(* ArithmeticCalculator.add(..)) || execution(* UnitCalculator.k*(..))")
	public void logBefore() {
		log.info("The method add() begins");
	}
//	public void logBefore(JoinPoint joinPoint) {
//		log.info("The method "+joinPoint.getSignature().getName()+"() begins with "+Arrays.toString(joinPoint.getArgs()));
//	}
	public void logAfter(JoinPoint joinPoint) {
		log.info("The method "+joinPoint.getSignature().getName()+"() ends");
	}
	public void logAfterReturning(JoinPoint joinPoint,Object result) {
		log.info("The method "+joinPoint.getSignature().getName()+" () ends with "+result);
	}
	public void logAferThrowing(JoinPoint joinPoint,IllegalArgumentException e) {
		log.error("Illegal argument "+Arrays.toString(joinPoint.getArgs())+" in "+joinPoint.getSignature().getName()+"()");
	}
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable{
		log.info("The method "+joinPoint.getSignature().getName()+"() begins with "+Arrays.toString(joinPoint.getArgs()));
		try {
			Object result=joinPoint.proceed();
			log.info("The method "+joinPoint.getSignature().getName()+" () ends with "+result);
			return result;
		}catch(IllegalArgumentException e) {
			log.error("Illegal argument "+Arrays.toString(joinPoint.getArgs())+" in "+joinPoint.getSignature().getName()+"()");
			throw e;
		}
	}
}
