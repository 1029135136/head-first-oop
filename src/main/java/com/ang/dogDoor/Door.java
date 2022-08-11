package com.ang.dogDoor;

import lombok.Data;

/**
 * @author: 于昂
 * @date: 2022/8/11
 **/
public class Door {
    private boolean open;

    public Door() {
        this.open = false;
    }

    public void open() {
        System.out.println("door is opening");
        open = true;
    }

    public void close() {
        System.out.println("door is closing");
        open = false;
    }
}
