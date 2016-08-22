package com.lhx.listener;

import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.InvokerListener;
import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.RpcException;

/**
 * Created by lhx on 2016/8/19 11:42
 *
 * @Description
 */
public class ReferListener implements InvokerListener {

    @Override
    public void referred(Invoker<?> invoker) throws RpcException {
        String clientIp = RpcContext.getContext().getRemoteHost();
        System.out.println(clientIp);
        System.out.println("sdfsdf");
    }

    @Override
    public void destroyed(Invoker<?> invoker) {

    }
}
