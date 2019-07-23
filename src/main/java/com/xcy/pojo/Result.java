package com.xcy.pojo;

import io.swagger.annotations.ApiModelProperty;

/**
 * 操作执行后返回前端的结果
 * T是操作的对象
 * @param <T>
 */
public class Result<T> {

    //操作描述
    @ApiModelProperty("操作描述")
    private String operationType;

    //操作的状态  成功 ：1  失败：0
    @ApiModelProperty("操作的结果 1:成功  0:失败")
    private int status;

    //操作的对象
    private T object;

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
