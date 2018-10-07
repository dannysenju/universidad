package com.seratic.universidad.persist.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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

    @Column(name = "date_test", columnDefinition = "TIMESTAMP")
    private LocalDateTime dateTest;

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

    public LocalDateTime getDateTest() {
        return dateTest;
    }

    public void setDateTest(LocalDateTime dateTest) {
        this.dateTest = dateTest;
    }
    
    

}
