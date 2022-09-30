package com.example.g2cbottomsheet;

public class ModelHorizontal {
    String oilCompany;
    String oilText;
    String oil_price;

    public ModelHorizontal(String oilCompany, String oilText, String oil_price) {
        this.oilCompany = oilCompany;
        this.oilText = oilText;
        this.oil_price = oil_price;
    }

    public String getOilCompany() {
        return oilCompany;
    }

    public void setOilCompany(String oilCompany) {
        this.oilCompany = oilCompany;
    }

    public String getOilText() {
        return oilText;
    }

    public void setOilText(String oilText) {
        this.oilText = oilText;
    }

    public String getOil_price() {
        return oil_price;
    }

    public void setOil_price(String oil_price) {
        this.oil_price = oil_price;
    }
}
