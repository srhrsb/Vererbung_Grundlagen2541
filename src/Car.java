public class Car {
     private int speed;
     private int height;
     private int length;
     private int width;

     public Car(int speed, int height, int length, int width) {
          this.speed = speed;
          this.height = height;
          this.length = length;
          this.width = width;
     }


     public int getSpeed() {
          return speed;
     }

     public void setSpeed(int speed) {
          this.speed = speed;
     }

     public int getHeight() {
          return height;
     }

     public void setHeight(int height) {
          this.height = height;
     }

     public int getLength() {
          return length;
     }

     public void setLength(int length) {
          this.length = length;
     }

     public int getWidth() {
          return width;
     }

     public void setWidth(int width) {
          this.width = width;
     }
}
