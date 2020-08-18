package com.company;

public class Main {

    public static void main(String[] args) {
        String[] array = {"apple, pear, pineapple, 12345"};
        StringArrayHandler stringArrayHandler1 = new StringArrayHandler(array);

        Condition condition1 = new CheckStringCondition();
        Action action1 = new ReverseStringAction();
        //stringArrayHandler1.stringsHandle(action1.doAction(), condition1.test());
    }
}
