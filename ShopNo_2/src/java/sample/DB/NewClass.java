/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.DB;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 *
 * @author PhongNha
 */
public class NewClass {

    public static void main(String[] args) {
        Random rand = new Random();
        int orderID = 0, Oder;
        for (int count = 1; count <= 3; count++) {
            orderID = rand.nextInt(3) + 1;
            if (orderID != count) {
                
                break;
            }
        }
        String a = "od" + orderID;
        System.out.println(orderID);
        System.out.println(a);
    }
}
