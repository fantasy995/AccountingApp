package com.experiment.lenovo.accountingsoftware.accuntingpage;

public class ExpendFragmentRecycleViewAdapterItem {
    private String billClassName;
    private int billClassImage;

    public ExpendFragmentRecycleViewAdapterItem(String billClassName, int billClassImage) {
        this.billClassName = billClassName;
        this.billClassImage = billClassImage;
    }

    public String getBillClassName() {
        return billClassName;
    }

    public void setBillClassName(String billClassName) {
        this.billClassName = billClassName;
    }

    public int getBillClassImage() {
        return billClassImage;
    }

    public void setBillClassImage(int billClassImage) {
        this.billClassImage = billClassImage;
    }


}
