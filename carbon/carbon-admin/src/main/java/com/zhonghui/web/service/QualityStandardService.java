package com.zhonghui.web.service;

import com.zhonghui.web.entity.QualityStandard;
import com.zhonghui.web.request.QualityStandardParamRequest;

import java.util.List;

/**
 * @ClassName QualityService
 * @Description
 * @Author WangZhisheng
 * @Date 14:35 2023-11-06
 * @Version 11.0.15
 */
public interface QualityStandardService {

    List<QualityStandard> queryAll(QualityStandardParamRequest request);

    void removeById(Long id);

    void addOne(QualityStandard qualityStandard);
}
