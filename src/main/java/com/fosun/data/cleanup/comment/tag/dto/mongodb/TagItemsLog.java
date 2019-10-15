package com.fosun.data.cleanup.comment.tag.dto.mongodb;

import lombok.Data;

/**
 * @author: zyf
 * @description: 百度API获取 源数据
 * @date: 2019/8/27
 */
@Data
public class TagItemsLog {
    private Integer sentiment;
    private String abs;
    private String prop;
    private Integer beginPos;
    private Integer endPos;
    private String adj;
}
