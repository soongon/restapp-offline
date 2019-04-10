package kr.re.kitri.restapp.advice;

import kr.re.kitri.restapp.annotation.TokenRequired;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityAspect {

    @Before("@annotation(tokenRequired)")
    public void authWithToken(TokenRequired tokenRequired) {
        System.out.println("annotation with token...............");
    }
}
