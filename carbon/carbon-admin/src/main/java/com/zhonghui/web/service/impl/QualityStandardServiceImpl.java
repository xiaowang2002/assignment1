package com.zhonghui.web.service.impl;

import com.zhonghui.web.entity.QualityStandard;
import com.zhonghui.web.mapper.QualityStandardMapper;
import com.zhonghui.web.request.QualityStandardParamRequest;
import com.zhonghui.web.service.QualityStandardService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName QualityServiceImpol
 * @Description
 * @Author Wang Zhisheng
 * @Date 14:36 2023-11-06
 * @Version 17.0.8
 */
@Service
public class QualityStandardServiceImpl implements QualityStandardService {

    @Resource
    private QualityStandardMapper qualityStandardMapper;

    @Override
    public List<QualityStandard> queryAll(QualityStandardParamRequest request) {
        return qualityStandardMapper.queryAll(request);
    }

    @Override
    public void removeById(Long id) {
        qualityStandardMapper.removeById(id);
    }

    @Override
    public void addOne(QualityStandard qualityStandard) {
        qualityStandardMapper.addOne(qualityStandard);
    }
}
