package com.Decorator2;

/**
 * ����:
 * <p>
 * <p>
 * ����:
 * <p>
 * ��Ȩ: ˰��������Źɷ����޹�˾
 *
 * @Date :����ʱ��: 12:15 2018/9/15
 * <p>
 * <p>
 * ����: xusy
 */
public abstract class DecoratorCake extends  Cake{
    public Cake cake ;

    public DecoratorCake(Cake cake) {
        this.cake = cake;
    }

    public abstract String getRemark() ;
}
