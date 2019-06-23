package com.cethik.irmp.core.service.manager;

import com.cethik.irmp.common.dal.entity.SysLogEntity;
import com.cethik.irmp.common.util.entity.PageResult;
import com.cethik.irmp.common.util.entity.Query;

/**
 * 系统日志
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2017年8月14日 下午8:43:06
 */
public interface SysLogManager {

    void saveLog(SysLogEntity log);

    /**
     * @Author daniel.yu
     * @Description 根据条件分页查询
     * @Date 2018/10/8 16:57
     * @Param 
     * @return 
     **/
    PageResult listForPage(Query query);

    int batchRemove(Long[] id);

    int batchRemoveAll();

}