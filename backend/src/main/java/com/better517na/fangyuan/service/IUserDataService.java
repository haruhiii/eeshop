package com.better517na.fangyuan.service;

import com.better517na.fangyuan.model.bo.UserDataBo;

public interface IUserDataService {
    //通过id查找
    UserDataBo queryUserByUserId(String userId) throws Exception;

}