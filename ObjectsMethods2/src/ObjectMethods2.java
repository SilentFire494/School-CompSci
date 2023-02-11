public class ObjectMethods2 
{
    public static int totalCalories( Food f )
    {
        return  ( f.getProtein() * 4 ) + ( f.getCarbs() * 4 ) + ( f.getFat() * 9 );
    }

    public static String compareCalories( Food f1, Food f2 )
    {
        if ( totalCalories( f1 ) > totalCalories( f2 ) )
            return f1.getName() + " has more calories than " + f2.getName();
        else if ( totalCalories( f1 ) < totalCalories( f2 ) )
            return f1.getName() + " has fewer calories than " + f2.getName();
        else
            return f1.getName() + " and " + f2.getName() + " have the same number of calories.";
    }

    public static boolean isAtLocation( Robot r, Location loc )
    {
        return (distanceFromLocationX(r, loc) == 0 && distanceFromLocationY(r, loc) == 0);
    }

    public static int distanceFromLocationX( Robot r, Location loc )
    {
        // return distance from r's location to loc on x axis
        return Math.abs( r.getLocation().getX() - loc.getX() );

    }

    public static int distanceFromLocationY( Robot r, Location loc )
    {
        // return distance from r's location to loc on y axis
        return Math.abs( r.getLocation().getY() - loc.getY() );
    }

    public static void moveToLocation( Robot r, Location loc )
    {
        // move robot to location
        while ( r.getLocation().getX() != loc.getX() )
        {
            if ( r.getLocation().getX() < loc.getX() )
                r.moveRight();
            else
                r.moveLeft();
        }

        while ( r.getLocation().getY() != loc.getY() )
        {
            if ( r.getLocation().getY() < loc.getY() )
                r.moveUp();
            else
                r.moveDown();
        }
    }

    public static void main( String[] args )
    {
        Food f1 = new Food( "Pizza", 10, 20, 30 );
        Food f2 = new Food( "Salad", 5, 10, 15 );
        Food f3 = new Food( "Ice Cream", 5, 10, 15 );

        System.out.println( compareCalories( f1, f2 ) );
        System.out.println( compareCalories( f2, f3 ) );
        System.out.println( compareCalories( f1, f3 ) );

        Robot r = new Robot( new Location( 0, 0 ) );
        Location loc = new Location( 5, 5 );

        System.out.println( isAtLocation( r, loc ) );
        System.out.println( distanceFromLocationX( r, loc ) );
        System.out.println( distanceFromLocationY( r, loc ) );

        moveToLocation( r, loc );

        System.out.println( isAtLocation( r, loc ) );
        System.out.println( distanceFromLocationX( r, loc ) );
        System.out.println( distanceFromLocationY( r, loc ) );
    }
}