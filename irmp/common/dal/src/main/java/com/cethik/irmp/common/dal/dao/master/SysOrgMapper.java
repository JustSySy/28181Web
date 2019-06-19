package com.cethik.irmp.common.dal.dao.master;

import com.cethik.irmp.common.dal.entity.SysOrgEntity;
import com.cethik.irmp.common.dal.dao.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 组织架构
 *
 * @Auther daniel.yu
 * @Date 2018/9/13 20:39
 */
@Mapper
public interface SysOrgMapper extends BaseMapper<SysOrgEntity> {

	int countOrgChildren(Long parentId);
	
}
