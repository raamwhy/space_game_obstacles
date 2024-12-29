import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int score;//membuat variabel score
    private GreenfootImage scoreImage;
    public Score(){
        score = 0;//pemberian niali awal score sebesar 0
    }
    public void act(){
        World myWorld = getWorld();
        myWorld.showText(String.valueOf(score), 300, 100);//penempatan nilai score
    }
    //skor akan bertambah sesuai dengan pipa yang dilewati
    public static void add(int num){
        score += num;
    }
    public int getScore()
    {
        return score;
    }
    private void updateImage()
    {
        scoreImage = new GreenfootImage(String.valueOf(score), 50, Color.WHITE, new Color(0, 0, 0, 0)); // membuat objek GreenfootImage dengan teks skor
        setImage(scoreImage); // menetapkan objek GreenfootImage sebagai gambar skor
    }
}
