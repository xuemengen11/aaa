package com.example.demo;

import java.util.Random;

    public class PiCalculator {

        public static void main(String[] args) {
            Long totalPoints = 99999999l; // 总的随机点数
            int insideCircle = 0; // 落在圆内的点数
            Random random = new Random(); // 随机数生成器
            for (int i = 0; i < totalPoints; i++) {
                double x = random.nextDouble() * 2 - 1; // 生成一个[-1, 1]之间的随机数
                double y = random.nextDouble() * 2 - 1; // 同上
                if (x * x + y * y <= 1) { // 判断点是否在半径为1的圆内
                    insideCircle++; // 如果是，增加计数器
                }
            }

            double pi = 4.0 * insideCircle / totalPoints; // 根据公式计算圆周率的近似值
            System.out.println("圆周率约等于 " + pi); // 输出结果
        }
    }


