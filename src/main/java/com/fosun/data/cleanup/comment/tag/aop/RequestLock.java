package com.fosun.data.cleanup.comment.tag.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 防止一个方法重复提交
 * @author: liumch
 * @create: 2019/8/23 9:45
 **/
@Retention(RetentionPolicy.RUNTIME) // 运行时有效
@Target({ElementType.METHOD})
public @interface RequestLock {

}
