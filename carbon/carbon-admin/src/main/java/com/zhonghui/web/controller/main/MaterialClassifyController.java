package com.zhonghui.web.controller.main;

import com.zhonghui.response.BaseResult;
import com.zhonghui.web.entity.MaterialClassify;
import com.zhonghui.web.service.MaterialClassifyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName MaterialClassifyController
 * @Description
 * @Author Wang Zhisheng
 * @Date 15:08 2023-11-06
 * @Version 17.0.8
 */
@RestController
@RequestMapping("/materialClassify")
public class MaterialClassifyController {

    @Resource
    private MaterialClassifyService materialClassifyService;

    @GetMapping
    public BaseResult<List<MaterialClassify>> buildTree() {
        List<MaterialClassify> list = materialClassifyService.buildTree();
        return BaseResult.success(list);
    }
}
