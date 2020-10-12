package pack;

 public class Test {
 public static void main(String args[]){
  //����һ��CPU����
  CPU cpu =new CPU();
  //��cpu��speed����Ϊ2200
  cpu.setSpeed(2200);
  //����һ��HardDisk����
  HardDisk disk=new HardDisk();
  //��disk��amount����Ϊ200
  disk.setAmount(200);
  //����һ��PC����
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
   System.out.println("CPU�ٶ�"+cpu.getSpeed());
   System.out.println("Ӳ������"+disk.getAmount());
  }

 }