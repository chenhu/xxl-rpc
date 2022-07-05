package com.xxl.rpc.sample.api;

import com.xxl.rpc.sample.api.dto.UserDTO;

/**
 * author: chenhu
 * Date: 2022/7/5 10:10
 * Description:
 */
public interface MyService {
    public UserDTO sayHi(String name);
}
