package com.zhonghui.web.service.impl;

import com.zhonghui.web.entity.MaterialClassify;
import com.zhonghui.web.mapper.MaterialClassifyMapper;
import com.zhonghui.web.service.MaterialClassifyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName MaterialStandardServiceImpl
 * @Description
 * @Author Wang Zhisheng
 * @Date 15:09 2023-11-06
 * @Version 17.0.8
 */
@Service
public class MaterialStandardServiceImpl implements MaterialClassifyService {

    @Resource
    private MaterialClassifyMapper materialClassifyMapper;

    @Override
    public List<MaterialClassify> buildTree() {
        return materialClassifyMapper.buildTree();
    }
}
