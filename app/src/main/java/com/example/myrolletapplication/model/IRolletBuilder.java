package com.example.myrolletapplication.model;

public interface IRolletBuilder  {
    int priceForOneSquareMeter(); //Цена за 1 кв.м. с учетом ширины и общей площади ролеты
    int productPrice();           //Цена изделия
    double installationPrice();   //Цена монтажа
    double totalPrice();          //Итого:
}