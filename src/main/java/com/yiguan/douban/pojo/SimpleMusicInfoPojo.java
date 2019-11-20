package com.yiguan.douban.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author DX
 */
@Data
public class SimpleMusicInfoPojo extends SimpleMusicPojo {

    /**
     * 音乐Id
     */
    @ApiModelProperty("音乐Id")
    private Long id;

    /**
     * 音乐封面路径
     */
    @ApiModelProperty("音乐封面路径")
    private String coverUrl;
}
