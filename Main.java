import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        Scanner input=new Scanner(System.in);
        int number;
        float result;
        System.out.println("请输入题目数量：");
        number=input.nextInt();
        for (int i=0;i<number;i++){
            int num1=new Random().nextInt(100)+1;
            int num2=new Random().nextInt(100)+1;
            int num3=new Random().nextInt(100)+1;
            int operator1=new Random().nextInt(4)+1;
            int operator2=new Random().nextInt(4)+1;
            if (operator1==1)//加法
            {
                String a=num1+"+"+num2;
                if (operator2==1){
                    result=num1+num2+num3;
                    a=a+"+"+num3+"="+result;
                }
                else if (operator2==2){
                    result=num1+num2;
                    while(result<num3){
                        num3=new Random().nextInt(100)+1;
                    }
                    result=result-num3;
                    a=a+"-"+num3+"="+result;
                }
                else if (operator2==3){
                    result=num2*num3;
                    result=result+num1;
                    a=a+"*"+num3+"="+result;
                }
                else if (operator2==4){
                    result=num2/num3;
                    result=result+num1;
                    a=a+"/"+num3+"="+result;
                }
                System.out.println(a);
            }

            if (operator1==2)//减法
            {
                if (operator2==1){
                    result=num1-num2+num3;
                    String a=num1+"-"+num2+"+"+num3+"="+result;
                    System.out.println(a);
                }
                else if (operator2==2) {
                    while ((num1-num2)<num3){
                        num1=new Random().nextInt(100)+1;
                        num2=new Random().nextInt(100)+1;
                        num3=new Random().nextInt(100)+1;
                    }
                    result=num1-num2-num3;
                    String a=num1+"-"+num2+"-"+num3+"="+result;
                    //a=a+"-"+num3+"="+result;
                    System.out.println(a);
                }
                else if (operator2==3){
                    while (num1<(num2*num3)){
                        num1=new Random().nextInt(100)+1;
                        num2=new Random().nextInt(100)+1;
                        num3=new Random().nextInt(100)+1;
                    }
                    result=num2*num3;
                    result=num1-result;
                    String a=num1+"-"+num2+"*"+num3+"="+result;
                    //a=a+"*"+num3+"="+result;
                    System.out.println(a);
                }
                else if (operator2==4){
                    while (num1<(num2/num3)){
                        num1=new Random().nextInt(100)+1;
                        num2=new Random().nextInt(100)+1;
                        num3=new Random().nextInt(100)+1;
                    }
                    result=num2/num3;
                    result=num1-result;
                    String a=num1+"-"+num2+"/"+num3+"="+result;
                    //a=a+"/"+num3+"="+result;
                    System.out.println(a);
                }
            }

            if (operator1==3)//乘法
            {
                String a=num1+"*"+num2;
                result=num1*num2;
                if (operator2==1) {
                    result=result+num3;
                    a=a+"+"+num3+"="+result;
                }
                else if (operator2==2){
                    while (result<num3){
                        num3=new Random().nextInt(100)+1;
                    }
                    result=result-num3;
                    a=a+"-"+num3+"="+result;
                }
                else if (operator2==3){
                    result=result*num3;
                    a=a+"*"+num3+"="+result;
                }
                else if (operator2==4){
                    result=result/num3;
                    a=a+"/"+num3+"="+result;
                }
                System.out.println(a);
            }
            if (operator1==4)//除法
            {
                String a=num1+"/"+num2;
                result=num1/num2;
                if (operator2==1){
                    result=result+num3;
                    a=a+"+"+num3+"="+result;
                }
                else if (operator2==2){
                    while (result<num3){
                        num3=new Random().nextInt(100)+1;
                    }
                    result=result-num3;
                    a=a+"-"+num3+"="+result;
                }
                else if (operator2==3){
                    result=result*num3;
                    a=a+"*"+num3+"="+result;
                }
                else if (operator2==4){
                    result=result/num3;
                    a=a+"/"+num3+"="+result;
                }
                System.out.println(a);
            }
        }
    }
}
