package com.Decorator2.impl;

import com.Decorator2.Cake;

/**
 * ����:
 * <p>
 * <p>
 * ����:
 * <p>
 * ��Ȩ: ˰��������Źɷ����޹�˾
 *
 * @Date :����ʱ��: 12:19 2018/9/15
 * <p>
 * <p>
 * ����: xusy
 */
public class CheeseCake extends Cake {

    public CheeseCake() {
        super.remark = "���ҵ���";
    }

    @Override
    public String getExpression() {
        return "���ҵ��⣬����ɿ�";
    }
}
