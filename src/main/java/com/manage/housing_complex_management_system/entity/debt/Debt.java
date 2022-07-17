package com.manage.housing_complex_management_system.entity.debt;

import com.manage.housing_complex_management_system.entity.resident.Resident;
import com.manage.housing_complex_management_system.entity.residential.Flat;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Debt {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private int debtAmount;
    private String debtNote;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "flat_id")
    private Flat flats;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(int debtAmount) {
        this.debtAmount = debtAmount;
    }

    public String getDebtNote() {
        return debtNote;
    }

    public void setDebtNote(String debtNote) {
        this.debtNote = debtNote;
    }

}
