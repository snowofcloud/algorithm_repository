package com.c503.hthj.asoco.dangerchemical.waste.config;

import java.io.Serializable;
import java.util.Objects;
/**
 * @auther xuxq
 * @date 2018/12/27 22:33
 */
public class GetArmstrongNumber {


    public static void main(String[] args) {
        //阿姆斯特朗数字：153 = 1*1*1 + 5*5*5 + 3*3*3;
        for (int i = 100; i< 1000; i++){
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/100;
            int num = ge*ge*ge + shi*shi*shi +bai*bai*bai;
            if (i == num){
                System.out.println(i);
                //153
                //370
                //371
                //407
            }
        }

    }




}
