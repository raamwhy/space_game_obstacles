import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pipe extends Actor
{
    private int previousScore = 0; // variabel untuk menyimpan skor sebelumnya
    private double movementIncrement = 0; // variabel untuk menyimpan peningkatan pergerakan
    public Pipe(){
        GreenfootImage image = getImage();
        image.scale(500, 900);
    }
    /**
     * Act - do whatever the Pipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         setLocation(getX() - (int)(1 + movementIncrement), getY());
         if(getX() <= 1){
            setLocation(getX() + 600, Greenfoot.getRandomNumber(250)+50);
        }
        // Memeriksa apakah skor telah meningkat sebesar 10, 20, 30, dst. (kelipatan 10)
        int currentScore = getWorld().getObjects(Score.class).get(0).getScore(); // Mendapatkan skor saat ini
        if (currentScore - previousScore >= 5) {
            movementIncrement += 0.5; // Menambahkan peningkatan pergerakan
            previousScore = currentScore; // Memperbarui skor sebelumnya
        }
    }    
}
