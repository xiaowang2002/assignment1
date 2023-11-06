package com.zhonghui.web.service;

import com.zhonghui.web.entity.MaterialClassify;

import java.util.List;

/**
 * @ClassName MaterialClassifyService
 * @Description
 * @Author WangZhisheng
 * @Date 15:08 2023-11-06
 * @Version 11.0.15
 */
public interface MaterialClassifyService {
    List<MaterialClassify> buildTree();

}
