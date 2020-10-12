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