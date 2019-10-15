package com.fosun.data.cleanup.comment.tag.aop;

import com.fosun.data.cleanup.comment.tag.redis.RedisUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

import static com.fosun.data.cleanup.comment.tag.constant.Const.REDIS_PREFIX;

/**
 * @author: liumch
 * @create: 2019/8/23 9:43
 **/


@Aspect
@Component
public class RequestLockHandler {
    private final static String  LOCK_SUBMINT_KEY_PREFIX = REDIS_PREFIX + "ReqLock:";

    @Autowired
    private RedisUtil redisUtil;

    @Around(value = "execution(@com.fosun.data.cleanup.comment.tag.aop.RequestLock * *(..)) && @annotation(reqLock)")
    public Object around(ProceedingJoinPoint pjp, RequestLock reqLock) throws Throwable {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        String key = LOCK_SUBMINT_KEY_PREFIX + "-" + request.getServletPath();
        redisUtil.lock(key,2L);
        return pjp.proceed();
    }


}
