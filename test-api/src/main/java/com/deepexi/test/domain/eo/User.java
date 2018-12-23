package com.deepexi.test.domain.eo;


import com.deepexi.util.mapper.SuperEntity;
import java.util.*;
import java.io.Serializable;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;


/**
* @desc 用户管理
 * @author 
*/
//@ApiModel(description = "用户管理")
public class User implements Serializable{

    //@ApiModelProperty(value = "id")
    private Integer  id;
    //@ApiModelProperty(value = "code")
    private String code;
    //@ApiModelProperty(value = "create_by")
    private String createBy;
    //@ApiModelProperty(value = "create_time")
    private String createTime;
    //@ApiModelProperty(value = "name")
    private String name;
    //@ApiModelProperty(value = "status")
    private String status;
    //@ApiModelProperty(value = "update_by")
    private String updateBy;
    //@ApiModelProperty(value = "update_time")
    private String updateTime;
    //@ApiModelProperty(value = "system_tenant")
    private String systemTenant;
    //@ApiModelProperty(value = "domain")
    private String domain;
    //@ApiModelProperty(value = "dr")
    private Integer  dr;
    public void setId(Integer  id){
            this.id = id;
    }

    public Integer  getId(){
            return this.id;
    }
    public void setCode(String code){
            this.code = code;
    }

    public String getCode(){
            return this.code;
    }
    public void setCreateBy(String createBy){
            this.createBy = createBy;
    }

    public String getCreateBy(){
            return this.createBy;
    }
    public void setCreateTime(String createTime){
            this.createTime = createTime;
    }

    public String getCreateTime(){
            return this.createTime;
    }
    public void setName(String name){
            this.name = name;
    }

    public String getName(){
            return this.name;
    }
    public void setStatus(String status){
            this.status = status;
    }

    public String getStatus(){
            return this.status;
    }
    public void setUpdateBy(String updateBy){
            this.updateBy = updateBy;
    }

    public String getUpdateBy(){
            return this.updateBy;
    }
    public void setUpdateTime(String updateTime){
            this.updateTime = updateTime;
    }

    public String getUpdateTime(){
            return this.updateTime;
    }
    public void setSystemTenant(String systemTenant){
            this.systemTenant = systemTenant;
    }

    public String getSystemTenant(){
            return this.systemTenant;
    }
    public void setDomain(String domain){
            this.domain = domain;
    }

    public String getDomain(){
            return this.domain;
    }
    public void setDr(Integer  dr){
            this.dr = dr;
    }

    public Integer  getDr(){
            return this.dr;
    }

}

