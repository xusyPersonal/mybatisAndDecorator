package com.Decorator.impl;

import com.Decorator.Sourcable;

/**
 * ����:
 * <p>
 * <p>
 * ����:
 * <p>
 * ��Ȩ: ˰��������Źɷ����޹�˾
 *
 * @Date :����ʱ��: 11:01 2018/9/15
 * <p>
 * <p>
 * ����: xusy
 */
public class Decorator2 implements Sourcable {

    private Sourcable sourcable ;

    public Decorator2(Sourcable sourcable) {
        this.sourcable = sourcable;
    }

    @Override
    public void operation() {
        System.out.println("�ڶ���װ����ǰ");
        sourcable.operation();
        System.out.println("�ڶ���װ������");
    }
}
