package com.example.myrolletapplication.model;

/**
 *  *  Создание роллеты происходит через строителяю.
 *  *  1. Ширина ролеты, мм (величина в милиметрах)
 *  *  2. Высота ролеты, мм (величина в милиметрах)
 *  *  3 .Накладной монтаж (1 - понадобиттся, 0 - не понадобится)
 *  *  4. Площадь, кв.м.
 *  *  5. Радиомодуль (1 - понадобиттся, 0 - не понадобится)
 *  *  6. Аварийная разблокировка (1 - понадобиттся, 0 - не понадобится)
 *  *  7. Пульт (Количество пультов)
 */

public class RolletBuilder implements IRolletBuilder {
    private static WareHouse wareHouse;

    private double  width;           // ширина
    private double  height;          // высота
    private int     installation;    // Накладной монтаж
    private boolean radioModule;     // Радиомодуль
    private boolean emergencyUnlock; // Аварийная разблокировка
    private int     controller;      // пульт управления

    private double area;             // площадь

    public RolletBuilder(double width, double height, int installation, boolean radioModule, boolean emergencyUnlock, int controller) {
        this.width           = width;
        this.height          = height;
        this.installation    = installation;
        this.radioModule     = radioModule;
        this.emergencyUnlock = emergencyUnlock;
        this.controller      = controller;
        area                 = width / 1000 * height / 1000 + width / 1000 * height / 1000 * installation * 0.3;
    }

    @Override
    public int priceForOneSquareMeter() {
        if (width < 2000) {
            return wareHouse.PRICE_BEFORE_2_SQUARE_METER;
        } else if(width >= 2000 && width <= 3000){
            if(area > 7) {
                return wareHouse.PRICE_MORE_7_SQUARE_METER;
            }
            return wareHouse.PRICE_AFTER_7_SQUARE_METER;
        }
        return 0;
        //return wareHouse.PRICE_MORE_7_SQUARE_METER;
    }

    @Override
    public int productPrice() {
        // TODO

        return 0;
    }

    @Override
    public double installationPrice() {
        return productPrice() * 0.2;
    }

    @Override
    public double totalPrice() {
        return priceForOneSquareMeter() + productPrice() + installationPrice();
    }

    public double getArea() {
        return area;
    }

}
