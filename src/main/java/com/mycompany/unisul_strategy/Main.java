package com.mycompany.unisul_strategy;


public class Main {

    public static void main(String[] args) {
        Context contexto = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + contexto.executeStrategy(10, 5));

        contexto =  new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + contexto.executeStrategy(10, 5));
        
        contexto =  new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + contexto.executeStrategy(10, 5));
        
        contexto =  new Context(new OperationDivide());
        System.out.println("10 / 5 = " + contexto.executeStrategy(10, 5));
        
    }

}
