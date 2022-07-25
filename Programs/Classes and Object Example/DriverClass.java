public class DriverClass
{
    public static void main(String[] args)
    {
        House house = new House(10,2,"Tiles","Brick");
        house.setNrOfDoors(3);
        house.setTypeOfWall("Plaster");
        System.out.println("House:");
        System.out.println("Number of windows: " + house.getNrOfWindows());
        System.out.println("Number of doors: " + house.getNrOfDoors());
        System.out.println("Type of roof: " + house.getTypeOfRoof());
        System.out.println("Type of wall: " + house.getTypeOfWall());
    }
}
