public class WritingStaticMethods 
{
    public static int computeAreaRectangle(int length, int width)
    {
        return length * width;
    }

    public static double computeTotalCost(double unitPrice, int quantity)
    {
        return unitPrice * quantity;
    }

    public static double computeCostAfterDiscount(double totalCost, double sTax, double discount)
    {
        double totalTax = totalCost * sTax;
        double totalDiscount = totalCost * discount;
        return totalCost + totalTax - totalDiscount;
    }
    public static double computeCostAfterDiscount(double unitPrice, int quantity, double sTax, double discount)
    {
        double totalCost = computeTotalCost(unitPrice, quantity);
        double totalTax = totalCost * sTax;
        double totalDiscount = totalCost * discount;
        return totalCost + totalTax - totalDiscount;
    }

    public static void displayAlarm()
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("* ALARM! *");
        }
    }

    public static String copyString(String word, int copies)
    {
        String result = "";
        for(int i = 0; i < copies; i++)
        {
            result += word;
        }
        return result;

    }
    public static void main(String[] args)
    {
     double cost = computeTotalCost(5.99, 10);
     int area = computeAreaRectangle(5, 10);
     double discountPrice = computeCostAfterDiscount(59.9, 0.8, 0.5);

     
     System.out.println("Area of Rectangle: " + area);
     System.out.println("Total Cost: " + cost);

     System.out.println("Discounted price: " + discountPrice);
     displayAlarm();
     
    System.out.println(copyString("Hello", 5));
    }
}
