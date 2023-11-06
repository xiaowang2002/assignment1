package com.zhonghui.web.entity;

import lombok.Data;

import java.util.List;

/**
 * @ClassName MaterialClassify
 * @Description
 * @Author Wang Zhisheng
 * @Date 15:07 2023-11-06
 * @Version 17.0.8
 */
@Data
public class MaterialClassify {
    private Long id;
    private Long pid;
    private String name;
    private String code;
    private String remark;
    private List<MaterialClassify> list;
}
