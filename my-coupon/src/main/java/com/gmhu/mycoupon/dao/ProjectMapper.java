package com.gmhu.mycoupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gmhu.mycoupon.common.entry.Project;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: huguangmiao
 * @Date: 2020/12/18
 */
@Mapper
@Component
public interface ProjectMapper extends BaseMapper<Project> {
}
