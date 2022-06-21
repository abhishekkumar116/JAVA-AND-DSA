class cuboid{
    int length;
    int width;
    int height;
    int volume()
    {
        return (length*width*height);

    }
}
class classdemo
{
    public static void main(String args[])
    {
        cuboid cobj = new cuboid();
        cobj.length = 20;
        cobj.height = 30;
        cobj.width = 25;
        int vol = cobj.volume();
        System.out.println("The volume of the cuboid is:"+vol);
    }
}
