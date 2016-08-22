package com.lhx.filter;

import com.alibaba.dubbo.rpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

/**
 * Created by lhx on 2016/8/19 11:07
 *
 * @Description
 */
public class AuthorityFilter implements Filter {
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthorityFilter.class);

//    private IpWhiteList ipWhiteList;
//
//    //dubbo通过setter方式自动注入
//    public void setIpWhiteList(IpWhiteList ipWhiteList) {
//        this.ipWhiteList = ipWhiteList;
//    }

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
//        if (!ipWhiteList.isEnabled()) {
//            LOGGER.debug("白名单禁用");
//            return invoker.invoke(invocation);
//        }

        String clientIp = RpcContext.getContext().getRemoteHost();
        LOGGER.debug("访问ip为{}", clientIp);
        System.out.println(clientIp);
//        List<String> allowedIps = ipWhiteList.getAllowedIps();
//        List<String> allowedIps = Arrays.asList("sd","sddf");
//        if (allowedIps.contains(clientIp)) {
//            return invoker.invoke(invocation);
//        } else {
//            return new RpcResult();
//        }
        return invoker.invoke(invocation);
    }


}
