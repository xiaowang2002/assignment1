package com.zhonghui.web.mapper;

import com.zhonghui.web.entity.MaterialClassify;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName MaterialStandardMapper
 * @Description
 * @Author WangZhisheng
 * @Date 15:09 2023-11-06
 * @Version 11.0.15
 */
@Mapper
public interface MaterialClassifyMapper {
    List<MaterialClassify> buildTree();
}
