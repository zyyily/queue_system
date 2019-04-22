package com.queue.util;


import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateUtil {
    private static String SERIAL_NUMBER = "0001" ;
    private static DateUtil dateUtil = null;


    public static DateUtil getInstance() {
        if (dateUtil == null) {
            synchronized (DateUtil.class) {
                if (dateUtil == null) {
                    dateUtil= new DateUtil();
                }
            }
        }
        return dateUtil;
    }


    /**
     * 生成 日期+随机数的流水号
     * */
    public String getNumberForPK(){
        String id="";
        SimpleDateFormat sf = new SimpleDateFormat("yyMMdd");
        String temp = sf.format(new Date());
        int random=(int) (Math.random()*10000);
        id=temp+random;
        return id;
    }


    /**
     * HHTG+年月+8+0001
     * 每月从0001开始计数
     * */
    public static synchronized String getnumber(String thisCode){

        String id = null;
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyMMdd");
//        TimeZone time = TimeZone.getTimeZone("ETC/GMT-8");
//        TimeZone.setDefault(time);
        System.out.println(formatter.format(date));
        String thisData = thisCode.substring(0, 6);
        //这个判断就是判断你数据取出来的最后一个业务单号是不是当天的
        if(!formatter.format(date).equals(thisData)){
            thisData = formatter.format(date);
            //如果是新的一天的就直接变成0001
            id = thisData + SERIAL_NUMBER;
        }else{
//            System.out.println("当天");
            DecimalFormat df = new DecimalFormat("0000");
            System.out.println(thisCode.substring(6, 10));
            id =formatter.format(date)
                    + df.format(1 + Integer.parseInt(thisCode.substring(6, 10)));
        }
        return id;
    }
    //测试
    public static void main(String[] args){
        String sno = "1904210001";
        System.out.println(getnumber(sno));
    }
}