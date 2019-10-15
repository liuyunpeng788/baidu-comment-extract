package com.fosun.data.cleanup.comment.tag.tuple;

/**
 * tuple 静态类
 *
 * @param <T> 泛型类型t1
 * @param <D> 泛型类型t2
 * @param <L> 泛型类型t3
 */
public class LogItemsTuple<T, D, L> {
    public T t1;
    public D t2;
    public L t3;

    public LogItemsTuple(T t1, D t2, L t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }
}