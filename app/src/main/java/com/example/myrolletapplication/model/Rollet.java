package com.example.myrolletapplication.model;

public class Rollet {
    public Rollet(){}

    private int PRICE_DELEVERY = 2000; // цена доставки, TODO уточнить, всегда ли 2000
    private RolletBuilder rolletBuilder;

    public void constractRollet(int width,
                                int height,
                                int installation,
                                boolean radioModule,
                                boolean emergencyUnlock,
                                int controller) {
        rolletBuilder = new RolletBuilder(width, height, installation, radioModule, emergencyUnlock, controller);
    }

    public String getTotalPrice() {
        return String.valueOf(rolletBuilder.totalPrice());
    }

    public String getArea() {
        return String.valueOf(rolletBuilder.getArea());
    }

    public int getPriceForOneSquareMeter(){
        return (int)rolletBuilder.priceForOneSquareMeter();
    }
}
