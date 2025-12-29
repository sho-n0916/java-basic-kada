package kadai_015;

public class Car_Chapter15 {
    private int gear;   // ギア
    private int speed;
    
    
    Car_Chapter15() {
        this.gear = 1;
        this.speed = 10;
        
    }

    // ギア変更
    public void changeGear(int newGear) {
        System.out.println("ギアを" + gear + "から" + newGear + "に切り替えました");
        this.gear = newGear;
    }

    // 速度設定
    public void run (int newspeed) {
        System.out.println("速度は時速" + newspeed + "kmです");
       this.speed = newspeed;
       
    }
}