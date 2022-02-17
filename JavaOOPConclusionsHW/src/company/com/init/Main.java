package company.com.init;

import company.com.cheif.tools.SaladCreate;
import company.com.cheif.vegetables.Vegetables;
import company.com.cheif.vegetables.model.*;

public class Main {

    public static void main(String[] args) {
        SaladCreate saladCreate = new SaladCreate();

        saladCreate.createSalad(new Vegetables[]{new Onion(),new Potato(),new Beet(),new Tomato(),new Cabbage()});

    }





}
