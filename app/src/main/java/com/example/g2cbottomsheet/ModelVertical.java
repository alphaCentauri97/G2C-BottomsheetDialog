package com.example.g2cbottomsheet;

public class ModelVertical {
    int pic;
    String product;
    String productText;
    String price;

    public ModelVertical(int pic, String product, String productText, String price) {
        this.pic = pic;
        this.product = product;
        this.productText = productText;
        this.price = price;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProductText() {
        return productText;
    }

    public void setProductText(String productText) {
        this.productText = productText;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
