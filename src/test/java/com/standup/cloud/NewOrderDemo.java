//package com.moon.cloud;
//
//public class NewOrderDemo {
//
//    private volatile static boolean orderFlag = true;
//
//    public static void main(String[] args) {
//        boolean loopFlag = true;
//        do {
//            if (orderFlag) {
//                testOrder();
//            }
//            //循环终止条件
//            if (yourCondition){
//                loopFlag = false;
//            }
//        } while (loopFlag);
//    }
//
//    private static void testOrder(){
//        //修改orderFlag为false 阻止下一次报单
//        orderFlag = false;
//        //报单
//
//        //等待回报 异步
//
//        //接收到回报 修改orderFlag 允许下一次循环报单
//        orderFlag = true;
//    }
//}
