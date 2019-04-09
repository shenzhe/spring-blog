package com.shenzhe.blog.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liuzhao
 * Date: 2018-08-13
 * Time: 下午8:08
 */
@Data
public class StatusReq {

    @NotNull
    @JsonPropertyDescription("任务Id")
    @JsonProperty("task_id")
    private Long taskId;
}
