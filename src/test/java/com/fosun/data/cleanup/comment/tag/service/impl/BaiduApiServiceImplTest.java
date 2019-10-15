package com.fosun.data.cleanup.comment.tag.service.impl;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.baidu.aip.nlp.ESimnetType.SHOPPING;

/**
 * @author: zyf
 * @description:
 * @date: 2019/8/27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BaiduApiServiceImplTest {

    @Autowired
    private BaiduApiServiceImpl baiduApiService;

    @Test
    public void getAPIData() {
        JSONObject apiData = baiduApiService.getAPIData("豫园商城古色古香，的确是个适合游客和本地人的好去处，当然人山人海和游人如织是无法避免的，交通也是很方便的，各路公交车和地铁10号线可以到。一路上除了看到很多纪念品，各种小吃也很期待，每次看到南翔小笼包的队伍都会挣扎一番纠结要不要排队。", SHOPPING);
        System.out.println(JSONObject.toJSONString(apiData));
    }
}