package com.zjy.entity;

public class TProduct {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product.product
     *
     * @mbg.generated
     */
    private String product;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product.price
     *
     * @mbg.generated
     */
    private Double price;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product.id
     *
     * @return the value of t_product.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product.id
     *
     * @param id the value for t_product.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product.product
     *
     * @return the value of t_product.product
     *
     * @mbg.generated
     */
    public String getProduct() {
        return product;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product.product
     *
     * @param product the value for t_product.product
     *
     * @mbg.generated
     */
    public void setProduct(String product) {
        this.product = product == null ? null : product.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product.price
     *
     * @return the value of t_product.price
     *
     * @mbg.generated
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product.price
     *
     * @param price the value for t_product.price
     *
     * @mbg.generated
     */
    public void setPrice(Double price) {
        this.price = price;
    }
}