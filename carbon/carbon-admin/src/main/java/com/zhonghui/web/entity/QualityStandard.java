package com.zhonghui.web.entity;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName QualityStandard
 * @Description
 * @Author Wang Zhisheng
 * @Date 14:32 2023-11-06
 * @Version 17.0.8
 */
@Data
public class QualityStandard {

    private Long id;
    private String materialName;
    private String inspectionItem;
    private String inspectionType;
    private Long upperLimit;
    private Long lowerLimit;
    private String model;
    private String specification;
    private String unit;
    private String remarks;
    private Date productionDate;
}
