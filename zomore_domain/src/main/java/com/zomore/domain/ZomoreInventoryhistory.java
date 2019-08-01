package com.zomore.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ZomoreInventoryhistory {
    private String inventoryhistoryId;

    private String inventoryhistoryBrand;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date inventoryhistoryDate;

    private String inventoryhistoryClassification;

    private String inventoryhistoryShop;

    private String inventoryhistoryPersonnel;

    private String inventoryhistoryMode;

    private String inventoryhistoryDefect;

    private String inventoryhistoryNote;

    public String getInventoryhistoryId() {
        return inventoryhistoryId;
    }

    public void setInventoryhistoryId(String inventoryhistoryId) {
        this.inventoryhistoryId = inventoryhistoryId == null ? null : inventoryhistoryId.trim();
    }

    public String getInventoryhistoryBrand() {
        return inventoryhistoryBrand;
    }

    public void setInventoryhistoryBrand(String inventoryhistoryBrand) {
        this.inventoryhistoryBrand = inventoryhistoryBrand == null ? null : inventoryhistoryBrand.trim();
    }

    public Date getInventoryhistoryDate() {
        return inventoryhistoryDate;
    }

    public void setInventoryhistoryDate(Date inventoryhistoryDate) {
        this.inventoryhistoryDate = inventoryhistoryDate;
    }

    public String getInventoryhistoryClassification() {
        return inventoryhistoryClassification;
    }

    public void setInventoryhistoryClassification(String inventoryhistoryClassification) {
        this.inventoryhistoryClassification = inventoryhistoryClassification == null ? null : inventoryhistoryClassification.trim();
    }

    public String getInventoryhistoryShop() {
        return inventoryhistoryShop;
    }

    public void setInventoryhistoryShop(String inventoryhistoryShop) {
        this.inventoryhistoryShop = inventoryhistoryShop == null ? null : inventoryhistoryShop.trim();
    }

    public String getInventoryhistoryPersonnel() {
        return inventoryhistoryPersonnel;
    }

    public void setInventoryhistoryPersonnel(String inventoryhistoryPersonnel) {
        this.inventoryhistoryPersonnel = inventoryhistoryPersonnel == null ? null : inventoryhistoryPersonnel.trim();
    }

    public String getInventoryhistoryMode() {
        return inventoryhistoryMode;
    }

    public void setInventoryhistoryMode(String inventoryhistoryMode) {
        this.inventoryhistoryMode = inventoryhistoryMode == null ? null : inventoryhistoryMode.trim();
    }

    public String getInventoryhistoryDefect() {
        return inventoryhistoryDefect;
    }

    public void setInventoryhistoryDefect(String inventoryhistoryDefect) {
        this.inventoryhistoryDefect = inventoryhistoryDefect == null ? null : inventoryhistoryDefect.trim();
    }

    public String getInventoryhistoryNote() {
        return inventoryhistoryNote;
    }

    public void setInventoryhistoryNote(String inventoryhistoryNote) {
        this.inventoryhistoryNote = inventoryhistoryNote == null ? null : inventoryhistoryNote.trim();
    }
}