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
 * @Date :����ʱ��: 10:56 2018/9/15
 * <p>
 * <p>
 * ����: xusy
 */
public class Source implements Sourcable {
    @Override
    public void operation() {
        System.out.println("ԭʼ�෽��");
    }
}
