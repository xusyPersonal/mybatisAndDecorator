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
 * @Date :����ʱ��: 12:24 2018/9/15
 * <p>
 * <p>
 * ����: xusy
 */
public class IceCake extends Cake {

    public IceCake() {
        super.remark = "����ܵ���";
    }


    @Override
    public String getExpression() {
        return "�����ĸо��ܺ�" ;
    }


}
