package com.mybatisplus_rud.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author AnHua
 * @since 2020-11-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Myimages implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "mid", type = IdType.ID_WORKER)
    private Integer mid;

    private String tup;

    private String diZhi;


}
