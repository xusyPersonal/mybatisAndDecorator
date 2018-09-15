package com.Decorator2;

/**
 * 标题:
 * <p>
 * <p>
 * 描述:
 * <p>
 * 版权: 税友软件集团股份有限公司
 *
 * @Date :创建时间: 12:15 2018/9/15
 * <p>
 * <p>
 * 作者: xusy
 */
public abstract class DecoratorCake extends  Cake{
    public Cake cake ;

    public DecoratorCake(Cake cake) {
        this.cake = cake;
    }

    public abstract String getRemark() ;
}
