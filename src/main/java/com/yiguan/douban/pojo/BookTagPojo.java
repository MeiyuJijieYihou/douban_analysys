package com.yiguan.douban.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @version v1.0
 * @ProjectName: douban
 * @ClassName: BookController
 * @Description: TODO(该类用于返回最火的标签)
 * @Author: 付晓
 */
@ApiModel("书籍标签Pojo")
@Data
public class BookTagPojo {

    /**
     * 书籍标签
     */
    private String sort;
}
