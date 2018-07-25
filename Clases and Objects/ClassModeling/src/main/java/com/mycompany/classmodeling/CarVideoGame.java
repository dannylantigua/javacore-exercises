/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classmodeling;
import com.mycompany.classmodeling.Car;
/**
 *
 * @author dannylantigua
 */
public class CarVideoGame {
    private Car _car;
    private String userName;
    private int _numberOfLifes, _score;
    
    public CarVideoGame(){}

    public CarVideoGame(Car _car, String userName, int _numberOfLifes, int _score) {
        this._car = _car;
        this.userName = userName;
        this._numberOfLifes = _numberOfLifes;
        this._score = _score;
    }

    public Car getCar() {
        return _car;
    }

    public void setCar(Car _car) {
        this._car = _car;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getNumberOfLifes() {
        return _numberOfLifes;
    }

    public void setNumberOfLifes(int _numberOfLifes) {
        this._numberOfLifes = _numberOfLifes;
    }

    public int getScore() {
        return _score;
    }

    public void setScore(int _score) {
        this._score = _score;
    }
    
    // Behaviors
    public void playGame(){}
}
