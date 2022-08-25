/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.DB;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PhongNha
 */
public class Cart {
    private List<Iterm> iterms;
    private int count;
    private float sumPrice;

    public Cart() {
        iterms = new ArrayList<>();
        count = 0;
    }

    public List<Iterm> getIterms() {
        return iterms;
    }

    public void setIterms(List<Iterm> iterms) {
        this.iterms = iterms;
    }

    public int getCount() {
        return iterms.size();
    }

    public float getSumPrice() {
        float sum = 0;
        for (Iterm iterm : iterms) {
            sum += iterm.getPrice();
        }
        return sum;
    }

    
}
