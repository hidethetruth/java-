# java-
java课程项目合集

# 阅读程序

```
package pack;

 public class Test {
 public static void main(String args[]){
  //创建一个CPU对象
  CPU cpu =new CPU();
  //将cpu的speed设置为2200
  cpu.setSpeed(2200);
  //创建一个HardDisk对象
  HardDisk disk=new HardDisk();
  //将disk的amount设置为200
  disk.setAmount(200);
  //创建一个PC对象
  PC pc=new PC();
  pc.setCPU(cpu);
  pc.setHardDisk(disk);
pc.show();
  
 }

}
 
 class CPU {
  int speed;
  int getSpeed(){
   return speed;
  }
  public void setSpeed(int speed){
   this.speed=speed;
  }

 }
 
class HardDisk {
  int amount;
  int getAmount(){
   return amount;
  }
  public void setAmount(int amount){
   this.amount=amount;
  }

 }
 
 class PC {
  CPU cpu;
  HardDisk disk;
  void setCPU(CPU cpu){
   this.cpu=cpu;
  }
  void setHardDisk(HardDisk disk){
   this.disk=disk; 
  }
  void show(){
   System.out.println("CPU速度"+cpu.getSpeed());
   System.out.println("硬盘容量"+disk.getAmount());
  }

 }
 ```
## 实验目的

用类描述计算机中cpu的速度和硬盘容量

### 实验过程

1.首先进行框架设计，在Test主类下有CPU、HardDisk、PC三个分类，主类从分类调取参数并设计和调用显示函数show ()从而达到显示CPU速度以及硬盘容量的目的

2.创建项目Experiment,并创建包one

3.创建CPU 1类，创建参数speed,并创建方法getSpeed

4.创建HardDisk. 1类，创建参数amonut, 并创建方法getAmount,用于之后为amount斌值

5.创建PC类，创建属性cpu和HD，并创建方法getCPU、getHar dDisk,为属性赋值，并创建显示函数show ()

6.最后创建主类Test,首先将Test类里设置主函数，调用上述三类中的函数，并为其赋值、和显示

## 实验结果

CPU速度2200
硬盘容量200

## 实验感想

通过学习教学内容完成了第一次java程序的编写，过程中虽然有很多困难但是最后还是可以run了，感觉很好
