package com.imooc.student.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @yelei
 * 
 */
@Component
public class Student implements Serializable {
    /**
     * 学生编号
     */
    private String studentId;

    /**
     * 学生姓名
     */
    private String studentName;

    /**
     * 学生电话
     */
    private BigDecimal studentTel;

    /**
     * 备注
     */
    private String vnote;

    /**
     * 文科理科
     */
    private String studentType;

    private static final long serialVersionUID = 1L;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public BigDecimal getStudentTel() {
        return studentTel;
    }

    public void setStudentTel(BigDecimal studentTel) {
        this.studentTel = studentTel;
    }

    public String getVnote() {
        return vnote;
    }

    public void setVnote(String vnote) {
        this.vnote = vnote;
    }

    public String getStudentType() {
        return studentType;
    }

    public void setStudentType(String studentType) {
        this.studentType = studentType;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Student other = (Student) that;
        return (this.getStudentId() == null ? other.getStudentId() == null : this.getStudentId().equals(other.getStudentId()))
            && (this.getStudentName() == null ? other.getStudentName() == null : this.getStudentName().equals(other.getStudentName()))
            && (this.getStudentTel() == null ? other.getStudentTel() == null : this.getStudentTel().equals(other.getStudentTel()))
            && (this.getVnote() == null ? other.getVnote() == null : this.getVnote().equals(other.getVnote()))
            && (this.getStudentType() == null ? other.getStudentType() == null : this.getStudentType().equals(other.getStudentType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStudentId() == null) ? 0 : getStudentId().hashCode());
        result = prime * result + ((getStudentName() == null) ? 0 : getStudentName().hashCode());
        result = prime * result + ((getStudentTel() == null) ? 0 : getStudentTel().hashCode());
        result = prime * result + ((getVnote() == null) ? 0 : getVnote().hashCode());
        result = prime * result + ((getStudentType() == null) ? 0 : getStudentType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", studentId=").append(studentId);
        sb.append(", studentName=").append(studentName);
        sb.append(", studentTel=").append(studentTel);
        sb.append(", vnote=").append(vnote);
        sb.append(", studentType=").append(studentType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}