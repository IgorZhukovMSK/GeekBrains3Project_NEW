package Lesson5.Task1;

import java.util.Random;
import java.util.concurrent.Semaphore;

import static Lesson5.Task1.Main.CARS_COUNT;
import static Lesson5.Task1.Main.HALF_CARS_COUNT;

public class Tunnel extends Stage {
    private static int TUNNEL_COUNT;

    Semaphore smp = new Semaphore((int) (CARS_COUNT / (Math.random()*1)));

    static {
        TUNNEL_COUNT = 0;
    }

    public Tunnel() {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
        TUNNEL_COUNT++; // хочу сделать чтоб тоннель имел номер


    }

    @Override
    public void go(Car c) {
        try {
            try {
                System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
                smp.acquire();
                System.out.println(c.getName() + " начал этап: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(c.getName() + " закончил этап: " + description);
                smp.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}