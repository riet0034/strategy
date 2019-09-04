package com.hz;

public class Main {

    public static void main(String[] args) {
        Product butter = new Butter(3);
        Product appleSyrup = new AppleSyrup(2);

        System.out.print(butter.get_price() + appleSyrup.get_price());
    }
}
