package com.Decorator.impl;

import com.Decorator.Sourcable;

/**
 * 标题:
 * <p>
 * <p>
 * 描述:
 * <p>
 * 版权: 税友软件集团股份有限公司
 *
 * @Date :创建时间: 10:56 2018/9/15
 * <p>
 * <p>
 * 作者: xusy
 */
public class Source implements Sourcable {
    @Override
    public void operation() {
        System.out.println("原始类方法");
    }
}
