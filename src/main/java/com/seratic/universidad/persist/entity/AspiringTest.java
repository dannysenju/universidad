package com.seratic.universidad.persist.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "aspiring_test")
public class AspiringTest {

    @Id
    @NotEmpty
    @Column(name = "id_test", nullable = false)
    private String idTest;

    @NotEmpty
    @Column(name = "detail_test", nullable = false)
    private String detailTest;

    @NotEmpty
    @Column(name = "quali_test", nullable = false)
    private double qualificationTest;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_test")
    private Date dateTest;

    public String getIdTest() {
        return idTest;
    }

    public void setIdTest(String idTest) {
        this.idTest = idTest;
    }

    public String getDetailTest() {
        return detailTest;
    }

    public void setDetailTest(String detailTest) {
        this.detailTest = detailTest;
    }

    public double getQualificationTest() {
        return qualificationTest;
    }

    public void setQualificationTest(double qualificationTest) {
        this.qualificationTest = qualificationTest;
    }

    public Date getDateTest() {
        return dateTest;
    }

    public void setDateTest(Date dateTest) {
        this.dateTest = dateTest;
    }


}
