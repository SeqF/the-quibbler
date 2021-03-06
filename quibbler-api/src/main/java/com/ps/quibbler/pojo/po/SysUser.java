package com.ps.quibbler.pojo.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ps.quibbler.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/**
 * @author ps
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysUser extends BaseEntity {

    private String account;

    private Integer admin;

    private String avatar;

    private Integer deleted;

    private String email;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lastLogin;

    private String mobile;

    private String username;

    private String password;

    private String salt;

    private String status;
}
