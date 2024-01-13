import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Andrei
 */
public class Book {
    private String bookTitle;
    private double rentPrice, buyPrice;
    
    private boolean isBought, isRented, isMissing;
    private String imagePath;

    
    public Book(String title, double rentPrice, double buyPrice) {
    this.bookTitle = title;
    this.rentPrice = rentPrice;
    this.buyPrice = buyPrice;
    }
    
//    public Book(String title) {
//    this.bookTitle = title;
//    }
    
    public void setBookTitle(String title) {
    this.bookTitle = title;
    }
    public String getBookTitle() {
    return this.bookTitle;
    }
    
    public void setRentPrice(double price){
    this.rentPrice = price;
    }
    
    public double getRentPrice() {
    return this.rentPrice;
    }
    
    public void setBuyPrice(double price){
    this.buyPrice = price;
    }
    
    public double getBuyPrice(){
    return this.buyPrice;
    }
    
        
    public void setisBought(boolean x) {
        this.isBought = x;
    }
    public boolean isBought() {
    return this.isBought;
    }
    
    public void setisRented(boolean x) {
    this.isRented = x;
    }
    
    public boolean isRented() {
    return this.isRented;
    }
    
    public void setimagePath(String path) {
        this.imagePath = path;
    }
    
    public String getimagePath() {
    return this.imagePath;
    }
    
    public void setisMissing(boolean x) {
    isMissing = x;
    }
    
    public boolean isMissing() {
    return isMissing;
    }
    
}
