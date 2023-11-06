package com.zhonghui.web.mapper;

import com.zhonghui.web.entity.QualityStandard;
import com.zhonghui.web.request.QualityStandardParamRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName QualityStandardMapper
 * @Description
 * @Author WangZhisheng
 * @Date 14:37 2023-11-06
 * @Version 11.0.15
 */
@Mapper
public interface QualityStandardMapper {
    void addOne(QualityStandard qualityStandard);

    List<QualityStandard> queryAll(QualityStandardParamRequest request);

    void removeById(Long id);
}
