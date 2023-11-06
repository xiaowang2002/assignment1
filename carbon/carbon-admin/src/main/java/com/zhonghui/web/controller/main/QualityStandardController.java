package com.zhonghui.web.controller.main;

import com.zhonghui.response.BaseResult;
import com.zhonghui.web.entity.QualityStandard;
import com.zhonghui.web.request.QualityStandardParamRequest;
import com.zhonghui.web.service.QualityStandardService;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName QualityStandardController
 * @Description
 * @Author Wang Zhisheng
 * @Date 14:34 2023-11-06
 * @Version 17.0.8
 */
@RestController
@RequestMapping("/qualityStandard")
public class QualityStandardController {

    private QualityStandardService qualityStandardService;

    @GetMapping("/list")
    public BaseResult<List<QualityStandard>> queryAll(String materialName, String inspectionItem, String inspectionType) {
        QualityStandardParamRequest request = new QualityStandardParamRequest();
        if (materialName != null) {
            request.setMaterialName(materialName);
        }
        if (inspectionItem != null) {
            request.setMaterialName(inspectionItem);
        }
        if (inspectionType != null) {
            request.setInspectionType(inspectionType);
        }
        List<QualityStandard> list = qualityStandardService.queryAll(request);
        return BaseResult.success(list);
    }

    @DeleteMapping("/{id}")
    public BaseResult<String> removeById(@PathVariable Long id) {
        qualityStandardService.removeById(id);
        return BaseResult.success("删除成功");
    }

    @PostMapping
    public BaseResult<String> addOne(@RequestBody QualityStandard qualityStandard) {
        qualityStandardService.addOne(qualityStandard);
        return BaseResult.success("添加成功");
    }
}
