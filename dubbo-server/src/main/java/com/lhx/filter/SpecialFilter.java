package com.lhx.filter;

import com.alibaba.dubbo.rpc.*;

/**
 * Created by lhx on 2016/8/19 14:19
 *
 * @Description
 */
public class SpecialFilter implements Filter {

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        String clientIp = RpcContext.getContext().getRemoteHost();
        System.out.println("消费者访问的IP地址为："+clientIp);
        return invoker.invoke(invocation);
    }
}
