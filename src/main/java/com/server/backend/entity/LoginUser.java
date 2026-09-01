package com.server.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "login_users", schema = "public")
@Data
public class LoginUser {

    /* Actual primary key of login_users is slno */
    @Id
    @Column(name = "slno", nullable = false)
    private Integer slno;

    @Column(name = "username", length = 100)
    private String userName;

    @Column(name = "roleid")
    private Integer roleId;

    @Column(name = "ins_code", length = 4)
    private String distCode;

    @Column(name = "mobile_no", length = 15, insertable = false, updatable = false)
    private String mobile;

    @Column(name = "email_id", length = 100, insertable = false, updatable = false)
    private String email;

    /* ---- read-only login columns (never written via JPA) ---- */

    @Column(name = "password", insertable = false, updatable = false)
    private String password;

    @Column(name = "hash_password", insertable = false, updatable = false)
    private String hashPassword;

    @Column(name = "status", insertable = false, updatable = false)
    private Boolean status;

    @Column(name = "u_name", length = 100, insertable = false, updatable = false)
    private String fullName;
}