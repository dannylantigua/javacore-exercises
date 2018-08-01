/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classmodeling;

import java.util.Date;

/**
 *
 * @author dannylantigua
 */
public class BookPublishingSys {
    
    private Book book;
    private String projectType; //printed book, eBook, etc
    private String timSize; // pocket book 4.25X6.87, Digest, US Trade
    private String coverStyle; //soft or hard
    private boolean perfectBinding;
    private String coverFinish; //gloss or matte
    private String paperStock;
    private String printStyle; // black or color
    private boolean isFormatted;
    private boolean includesCoverDesign;
    private boolean hasISBN;
    private int printingQuantity;
    private double price;
    private double shippingCost;
    private double totalCost;
    private Date date;
    private boolean orderSent;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getTimSize() {
        return timSize;
    }

    public void setTimSize(String timSize) {
        this.timSize = timSize;
    }

    public String getCoverStyle() {
        return coverStyle;
    }

    public void setCoverStyle(String coverStyle) {
        this.coverStyle = coverStyle;
    }

    public boolean isPerfectBinding() {
        return perfectBinding;
    }

    public void setPerfectBinding(boolean perfectBinding) {
        this.perfectBinding = perfectBinding;
    }

    public String getCoverFinish() {
        return coverFinish;
    }

    public void setCoverFinish(String coverFinish) {
        this.coverFinish = coverFinish;
    }

    public String getPaperStock() {
        return paperStock;
    }

    public void setPaperStock(String paperStock) {
        this.paperStock = paperStock;
    }

    public String getPrintStyle() {
        return printStyle;
    }

    public void setPrintStyle(String printStyle) {
        this.printStyle = printStyle;
    }

    public boolean isIsFormatted() {
        return isFormatted;
    }

    public void setIsFormatted(boolean isFormatted) {
        this.isFormatted = isFormatted;
    }

    public boolean isIncludesCoverDesign() {
        return includesCoverDesign;
    }

    public void setIncludesCoverDesign(boolean includesCoverDesign) {
        this.includesCoverDesign = includesCoverDesign;
    }

    public boolean isHasISBN() {
        return hasISBN;
    }

    public void setHasISBN(boolean hasISBN) {
        this.hasISBN = hasISBN;
    }

    public int getPrintingQuantity() {
        return printingQuantity;
    }

    public void setPrintingQuantity(int printingQuantity) {
        this.printingQuantity = printingQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isOrderSent() {
        return orderSent;
    }

    public void setOrderSent(boolean orderSent) {
        this.orderSent = orderSent;
    }
    
    public void printAndSendOrder(){}
}
