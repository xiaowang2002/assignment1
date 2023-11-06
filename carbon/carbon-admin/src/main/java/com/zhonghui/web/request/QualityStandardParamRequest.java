package com.zhonghui.web.request;

import lombok.Data;

/**
 * @ClassName QualityStandardParamRequest
 * @Description
 * @Author Wang Zhisheng
 * @Date 14:47 2023-11-06
 * @Version 17.0.8
 */
@Data
public class QualityStandardParamRequest {
    private String materialName;
    private String inspectionItem;
    private String inspectionType;
}
