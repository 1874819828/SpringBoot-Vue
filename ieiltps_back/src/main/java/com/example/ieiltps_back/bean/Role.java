package com.example.ieiltps_back.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Role {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String name;
    private String desc;
}
