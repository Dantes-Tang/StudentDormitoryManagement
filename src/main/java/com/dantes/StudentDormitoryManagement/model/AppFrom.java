package com.dantes.StudentDormitoryManagement.model;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class AppFrom {
    private int fromId;
    private long studentId; //学生ID
    private Date appDate; //申请日期
    private int appType; //申请状态（1住、2退、3换）
    private String appDescribe; //申请描述
    private String apprStatus; //审批状态（未提交、已提交、待审批、已审批）
    private String apprOver; //批准人
    private Date apprDate; //批准日期
    private String apprReason;//批准理由

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public Date getAppDate() {
        return appDate;
    }

    public void setAppDate(Date appDate) {
        this.appDate = appDate;
    }

    public int getAppType() {
        return appType;
    }

    public void setAppType(int appType) {
        this.appType = appType;
    }

    public String getAppDescribe() {
        return appDescribe;
    }

    public void setAppDescribe(String appDescribe) {
        this.appDescribe = appDescribe;
    }

    public String getApprStatus() {
        return apprStatus;
    }

    public void setApprStatus(String apprStatus) {
        this.apprStatus = apprStatus;
    }

    public String getApprOver() {
        return apprOver;
    }

    public void setApprOver(String apprOver) {
        this.apprOver = apprOver;
    }

    public Date getApprDate() {
        return apprDate;
    }

    public void setApprDate(Date apprDate) {
        this.apprDate = apprDate;
    }

    public String getApprReason() {
        return apprReason;
    }

    public void setApprReason(String apprReason) {
        this.apprReason = apprReason;
    }
}
