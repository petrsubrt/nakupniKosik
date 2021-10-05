package com.company;


public class Main {


    public static void main(String[] args) {
        String[] items = {"Tvaroh", "Mrkev", "Maslo", "Zakysana smetana", "Citron ", "Mouka psenicna hladka", "Vajecne testoviny", "Slunecnicovy olej"};
        int[] price = {20, 18, 34, 12, 13, 10, 26, 36};
        int sum = 0;
        if (args[0].equals("help")) {
            System.out.println("Items: ");
            for (int i = 0; i < items.length; i++) {
                System.out.println(items[i] + " = " + price[i] + " Kc");
            }
        } else if (args.length <= items.length) {
            for (int i = 0; i < args.length; i++) {
                String arg = args[i];
                int argNum = Integer.parseInt(arg) - 1;
                System.out.println(items[argNum]);
                sum +=price[argNum];
            }
            System.out.println("Total price: "+sum+" Kc");
        } else {
            System.out.println("Bad arg");
        }
        System.out.println();


    }
}




